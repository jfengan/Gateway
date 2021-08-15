package com.trading.gateway.utils.websocket;

import com.trading.gateway.binance.api.domain.impl.BinanceWebSocketConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class WatchDog {

    private final CopyOnWriteArrayList<BinanceWebSocketConnection> TIME_HELPER = new CopyOnWriteArrayList<>();
    private final SubscriptionOptions options;
    private static final Logger log = LoggerFactory.getLogger(BinanceWebSocketConnection.class);

    public WatchDog(SubscriptionOptions subscriptionOptions) {
        this.options = Objects.requireNonNull(subscriptionOptions);
        long t = 1_000;
        ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
        exec.scheduleAtFixedRate(() -> {
            TIME_HELPER.forEach(connection -> {
                if (connection.getState() == BinanceWebSocketConnection.ConnectionState.CONNECTED) {
                    // Check response
                    if (options.isAutoReconnect()) {
                        long ts = System.currentTimeMillis() - connection.getLastReceivedTime();
                        if (ts > options.getReceiveLimitMs()) {
                            log.warn("[Sub][" + connection.getConnectionId() + "] No response from server");
                            connection.reConnect(options.getConnectionDelayOnFailure());
                        }
                    }
                } else if (connection.getState() == BinanceWebSocketConnection.ConnectionState.DELAY_CONNECT) {
                    connection.reConnect();
                } else if (connection.getState() == BinanceWebSocketConnection.ConnectionState.CLOSED_ON_ERROR) {
                    if (options.isAutoReconnect()) {
                        connection.reConnect(options.getConnectionDelayOnFailure());
                    }
                }
            });
        }, t, t, TimeUnit.MILLISECONDS);
        Runtime.getRuntime().addShutdownHook(new Thread(exec::shutdown));
    }

    public void onConnectionCreated(BinanceWebSocketConnection connection) {
        TIME_HELPER.addIfAbsent(connection);
    }

    public void onClosedNormally(BinanceWebSocketConnection connection) {
        TIME_HELPER.remove(connection);
    }
}

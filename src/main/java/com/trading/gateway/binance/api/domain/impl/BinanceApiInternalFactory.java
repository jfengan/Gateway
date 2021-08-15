package com.trading.gateway.binance.api.domain.impl;

import com.trading.gateway.utils.websocket.RequestOptions;
import com.trading.gateway.utils.websocket.SubscriptionClient;
import com.trading.gateway.utils.websocket.SubscriptionOptions;

import java.net.URI;

public final class BinanceApiInternalFactory {

    private static final BinanceApiInternalFactory instance = new BinanceApiInternalFactory();

    public static BinanceApiInternalFactory getInstance() {
        return instance;
    }

    private BinanceApiInternalFactory() {
    }


    public SubscriptionClient createSubscriptionClient(SubscriptionOptions options) {
        SubscriptionOptions subscriptionOptions = new SubscriptionOptions(options);
        RequestOptions requestOptions = new RequestOptions();
        try {
            String host = new URI(options.getUri()).getHost();
            requestOptions.setUrl("https://" + host);
        } catch (Exception e) {

        }
        SubscriptionClient webSocketStreamClient = new BinanceWebSocketStreamClientImpl(subscriptionOptions);
        return webSocketStreamClient;
    }
}

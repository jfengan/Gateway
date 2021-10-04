package com.trading.gateway.binance.market;

import com.trading.gateway.utils.websocket.Printer;
import com.trading.gateway.utils.websocket.SubscriptionClient;

public class BinanceBookDepth {
    public static void main(String[] args) {

        SubscriptionClient client = SubscriptionClient.create();

        client.subscribeBookDepthEvent("btcusdt", 5, Printer::logInfo, null);

    }
}

package com.trading.gateway.binance;

import com.trading.gateway.utils.websocket.Printer;
import com.trading.gateway.utils.websocket.SubscriptionClient;

public class BinanceDiffDepth {
    public static void main(String[] args) {

        SubscriptionClient client = SubscriptionClient.create();

        client.subscribeDiffDepthEvent("btcusdt", Printer::logInfo, null);

    }
}

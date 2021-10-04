package com.trading.gateway.binance.market;

import com.trading.gateway.utils.websocket.Printer;
import com.trading.gateway.utils.websocket.SubscriptionClient;

public class BinanceMarkPrice {
    public static void main(String[] args) {

        SubscriptionClient client = SubscriptionClient.create();

        client.subscribeMarkPriceEvent("btcusdt", Printer::logInfo, null);

    }
}

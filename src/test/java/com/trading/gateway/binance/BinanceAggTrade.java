package com.trading.gateway.binance;

import com.trading.gateway.utils.websocket.Printer;
import com.trading.gateway.utils.websocket.SubscriptionClient;

public class BinanceAggTrade {
    public static void main(String[] args) {

        SubscriptionClient client = SubscriptionClient.create();

        client.subscribeAggregateTradeEvent("btcusdt", Printer::logInfo, null);

    }
}

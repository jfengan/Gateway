package com.trading.gateway.binance.market;

import com.trading.gateway.utils.websocket.Printer;
import com.trading.gateway.utils.websocket.SubscriptionClient;


/*
* return: a list of price snapshot for all tickers*/

public class BinanceAllTicker {
    public static void main(String[] args) {

        SubscriptionClient client = SubscriptionClient.create();

        client.subscribeAllTickerEvent(Printer::logInfo, null);

    }
}

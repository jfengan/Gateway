package com.trading.gateway.binance;

import com.trading.gateway.utils.websocket.Printer;
import com.trading.gateway.utils.websocket.SubscriptionClient;

public class BinanceSymbolLiquidationOrder {
    public static void main(String[] args) {

        SubscriptionClient client = SubscriptionClient.create();

        client.subscribeSymbolLiquidationOrderEvent("btcusdt", Printer::logInfo, null);

    }
}

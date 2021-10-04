package com.trading.gateway.binance.market;

import com.trading.gateway.utils.websocket.Printer;
import com.trading.gateway.utils.websocket.SubscriptionClient;

/*
* usually there's no liquidation order upon subscription*/

public class BinanceLiquidationOrder {
    public static void main(String[] args) {

        SubscriptionClient client = SubscriptionClient.create();

        client.subscribeAllLiquidationOrderEvent(Printer::logInfo, null);

    }
}

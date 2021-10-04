package com.trading.gateway.binance.trade;

import com.trading.gateway.binance.PrivateConfig;
import com.trading.gateway.utils.websocket.SyncRequestClient;
import com.trading.gateway.utils.websocket.RequestOptions;

public class GetOpenOrders {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);
        System.out.println(syncRequestClient.getAllOrders("BTCUSDT", null, null, null, 10));
    }
}
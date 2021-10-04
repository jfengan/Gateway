package com.trading.gateway.binance.trade;

import com.trading.gateway.binance.PrivateConfig;
import com.trading.gateway.utils.websocket.RequestOptions;
import com.trading.gateway.utils.websocket.SyncRequestClient;

public class GetAccount {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);
        System.out.println(syncRequestClient.getAccountInformation());
    }
}

package com.trading.gateway.binance.trade;

import com.trading.gateway.binance.PrivateConfig;
import com.trading.gateway.binance.api.domain.enums.*;
import com.trading.gateway.utils.websocket.RequestOptions;
import com.trading.gateway.utils.websocket.SyncRequestClient;

public class PostOrder {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);
        System.out.println(syncRequestClient.postOrder("BTCUSDT", OrderSide.SELL, PositionSide.SHORT, OrderType.LIMIT,
                TimeInForce.GTC, "1", "9000", null, null, null, null,
                NewOrderRespType.RESULT));
    }
}

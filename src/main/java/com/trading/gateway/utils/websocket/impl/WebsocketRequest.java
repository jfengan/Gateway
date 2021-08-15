package com.trading.gateway.utils.websocket.impl;

import com.trading.gateway.binance.api.domain.impl.BinanceWebSocketConnection;
import com.trading.gateway.utils.websocket.SubscriptionErrorHandler;
import com.trading.gateway.utils.websocket.SubscriptionListener;
import com.trading.gateway.utils.websocket.impl.utils.Handler;
import com.trading.gateway.utils.websocket.impl.utils.RestApiJsonParser;

public class WebsocketRequest<T> {

    public WebsocketRequest(SubscriptionListener<T> listener, SubscriptionErrorHandler errorHandler) {
        this.updateCallback = listener;
        this.errorHandler = errorHandler;
    }

    public String signatureVersion = "2";
    public String name;
    public Handler<BinanceWebSocketConnection> connectionHandler;
    public Handler<BinanceWebSocketConnection> authHandler = null;
    public final SubscriptionListener<T> updateCallback;
    public RestApiJsonParser<T> jsonParser;
    public final SubscriptionErrorHandler errorHandler;
}

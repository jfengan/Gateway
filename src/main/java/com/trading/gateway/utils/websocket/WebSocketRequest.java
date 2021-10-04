package com.trading.gateway.utils.websocket;


import com.trading.gateway.utils.websocket.impl.utils.Handler;
import com.trading.gateway.utils.websocket.impl.utils.RestApiJsonParser;

class WebSocketRequest<T> {

    WebSocketRequest(SubscriptionListener<T> listener, SubscriptionErrorHandler errorHandler) {
        this.updateCallback = listener;
        this.errorHandler = errorHandler;
    }

    String signatureVersion = "2";
    String name;
    Handler<WebSocketConnection> connectionHandler;
    Handler<WebSocketConnection> authHandler = null;
    final SubscriptionListener<T> updateCallback;
    RestApiJsonParser<T> jsonParser;
    final SubscriptionErrorHandler errorHandler;
}

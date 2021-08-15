package com.trading.gateway.utils.websocket;

@FunctionalInterface
public interface ResponseCallback<T> {

  void onResponse(T response);
}

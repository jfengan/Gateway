package com.trading.gateway.utils.websocket;


@FunctionalInterface
public interface SubscriptionListener<T> {

  void onReceive(T data);
}

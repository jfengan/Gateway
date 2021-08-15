package com.trading.gateway.utils.websocket;

@FunctionalInterface
public interface SubscriptionErrorHandler {

  void onError(RuntimeException exception);
}

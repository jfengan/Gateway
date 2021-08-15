package com.trading.gateway.utils.websocket.impl.utils;

@FunctionalInterface
public interface Handler<T> {

  void handle(T t);
}

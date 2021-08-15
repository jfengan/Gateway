package com.trading.gateway.utils.websocket.impl.utils;

import com.trading.gateway.utils.websocket.impl.utils.JsonWrapper;

@FunctionalInterface
public interface RestApiJsonParser<T> {

  T parseJson(JsonWrapper json);
}

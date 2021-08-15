package com.trading.gateway.utils.websocket.impl.utils;

import com.trading.gateway.utils.websocket.impl.utils.RestApiJsonParser;
import okhttp3.Request;

public class RestApiRequest<T> {

    public Request request;
    public RestApiJsonParser<T> jsonParser;
}

package com.trading.gateway.utils.websocket;


import com.alibaba.fastjson.JSON;
import com.trading.gateway.utils.websocket.model.event.CandlestickEvent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Printer {

    public static void logInfo(Object msg) {
        log.info(JSON.toJSONString(msg));
    }
}

package com.trading.gateway.binance.market;

import com.trading.gateway.utils.websocket.Printer;
import com.trading.gateway.utils.websocket.SubscriptionClient;
import com.trading.gateway.binance.api.domain.enums.CandlestickInterval;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinanceCandleStick {
    public static void main(String[] args) {

        SubscriptionClient client = SubscriptionClient.create();

        client.subscribeCandlestickEvent("btcusdt", CandlestickInterval.ONE_MINUTE, Printer::logInfo, null);
    }
}

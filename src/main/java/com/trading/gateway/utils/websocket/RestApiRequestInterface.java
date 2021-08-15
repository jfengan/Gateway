package com.trading.gateway.utils.websocket;

import com.alibaba.fastjson.JSONObject;
import com.trading.gateway.utils.websocket.impl.utils.RestApiRequest;
import com.trading.gateway.utils.websocket.impl.utils.UrlParamsBuilder;
import com.trading.gateway.utils.websocket.model.ResponseResult;
import com.trading.gateway.binance.api.domain.enums.*;
import com.trading.gateway.utils.websocket.model.market.*;
import com.trading.gateway.utils.websocket.model.trade.*;
import okhttp3.Request;
import java.util.List;

public interface RestApiRequestInterface {
    Request createRequestByGet(String address, UrlParamsBuilder builder);

    Request createRequestByGet(String url, String address, UrlParamsBuilder builder);

    Request createRequest(String url, String address, UrlParamsBuilder builder);

    Request createRequestWithSignature(String url, String address, UrlParamsBuilder builder);

    Request createRequestByPostWithSignature(String address, UrlParamsBuilder builder);

    Request createRequestByGetWithSignature(String address, UrlParamsBuilder builder);

    Request createRequestByPutWithSignature(String address, UrlParamsBuilder builder);

    Request createRequestByDeleteWithSignature(String address, UrlParamsBuilder builder);

    Request createRequestWithApikey(String url, String address, UrlParamsBuilder builder);

    Request createRequestByGetWithApikey(String address, UrlParamsBuilder builder);

    RestApiRequest<ExchangeInformation> getExchangeInformation();

    RestApiRequest<OrderBook> getOrderBook(String symbol, Integer limit);

    RestApiRequest<List<Trade>> getRecentTrades(String symbol, Integer limit);

    RestApiRequest<List<Trade>> getOldTrades(String symbol, Integer limit, Long fromId);

    RestApiRequest<List<AggregateTrade>> getAggregateTrades(String symbol, Long fromId,
                                                            Long startTime, Long endTime, Integer limit);

    RestApiRequest<List<Candlestick>> getCandlestick(String symbol, CandlestickInterval interval, Long startTime,
                                                     Long endTime, Integer limit);

    RestApiRequest<List<MarkPrice>> getMarkPrice(String symbol);

    RestApiRequest<List<FundingRate>> getFundingRate(String symbol, Long startTime, Long endTime, Integer limit);

    RestApiRequest<List<PriceChangeTicker>> get24hrTickerPriceChange(String symbol);
    RestApiRequest<List<SymbolPrice>> getSymbolPriceTicker(String symbol);

    RestApiRequest<List<SymbolOrderBook>> getSymbolOrderBookTicker(String symbol);

    RestApiRequest<List<LiquidationOrder>> getLiquidationOrders(String symbol, Long startTime, Long endTime,
                                                                Integer limit);

    RestApiRequest<List<Object>> postBatchOrders(String batchOrders);

    RestApiRequest<Order> postOrder(String symbol, OrderSide side, PositionSide positionSide, OrderType orderType,
                                    TimeInForce timeInForce, String quantity, String price, String reduceOnly,
                                    String newClientOrderId, String stopPrice, WorkingType workingType, NewOrderRespType newOrderRespType);

    RestApiRequest<ResponseResult> changePositionSide(boolean dual);

    RestApiRequest<ResponseResult> changeMarginType(String symbolName, String marginType);

    RestApiRequest<JSONObject> addPositionMargin(String symbolName, int type, String amount, PositionSide positionSide);

    RestApiRequest<List<WalletDeltaLog>> getPositionMarginHistory(String symbolName, int type, long startTime, long endTime, int limit);

    RestApiRequest<JSONObject> getPositionSide();

    RestApiRequest<Order> cancelOrder(String symbol, Long orderId, String origClientOrderId);

    RestApiRequest<ResponseResult> cancelAllOpenOrder(String symbol);

    RestApiRequest<List<Object>> batchCancelOrders(String symbol, String orderIdList, String origClientOrderIdList);

    RestApiRequest<Order> getOrder(String symbol, Long orderId, String origClientOrderId);

    RestApiRequest<List<Order>> getOpenOrders(String symbol);

    RestApiRequest<List<Order>> getAllOrders(String symbol, Long orderId, Long startTime, Long endTime, Integer limit);

    RestApiRequest<List<AccountBalance>> getBalance();

    RestApiRequest<AccountInformation> getAccountInformation();

    RestApiRequest<Leverage> changeInitialLeverage(String symbol, Integer leverage);

    RestApiRequest<List<PositionRisk>> getPositionRisk();

    RestApiRequest<List<MyTrade>> getAccountTrades(String symbol, Long startTime, Long endTime,
                                                   Long fromId, Integer limit);

    RestApiRequest<List<Income>> getIncomeHistory(String symbol, IncomeType incomeType, Long startTime, Long endTime,
                                                  Integer limit);

    RestApiRequest<String> startUserDataStream();

    RestApiRequest<String> keepUserDataStream(String listenKey);

    RestApiRequest<String> closeUserDataStream(String listenKey);

    RestApiRequest<List<OpenInterestStat>> getOpenInterestStat(String symbol, PeriodType period, Long startTime, Long endTime, Integer limit);

    RestApiRequest<List<CommonLongShortRatio>> getTopTraderAccountRatio(String symbol, PeriodType period, Long startTime, Long endTime, Integer limit);

    RestApiRequest<List<CommonLongShortRatio>> getTopTraderPositionRatio(String symbol, PeriodType period, Long startTime, Long endTime, Integer limit);

    RestApiRequest<List<CommonLongShortRatio>> getGlobalAccountRatio(String symbol, PeriodType period, Long startTime, Long endTime, Integer limit);

    RestApiRequest<List<TakerLongShortStat>> getTakerLongShortRatio(String symbol, PeriodType period, Long startTime, Long endTime, Integer limit);

}

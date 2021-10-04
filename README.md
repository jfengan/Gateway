# Project Gateway

**Trading gateway for binance exchange, mainly for two parts, the first one is a general websocket framework: 
*com.trading.gateway.utils.websocket*, which could be used for other exchanges**

**The Second part is for binance gateway implementation, mainly for public market data endpoints and private trading endpoints**

### Public endpoints:

> aggragate trade data: https://binance-docs.github.io/apidocs/futures/en/#compressed-aggregate-trades-list
> 
> test/java/ com.trading.gateway.binance.market.BinanceAggTrade


> all ticker price snapshots data:  https://binance-docs.github.io/apidocs/futures/en/#symbol-price-ticker
> 
> test/java  com.trading.gateway.binane.market.BinanceAllTicker
> 


> orderbook at some user-specified depth: https://binance-docs.github.io/apidocs/futures/en/#order-book
> 
> test/java  com.trading.gateway.binance.market.BinanceBookDepth


> candle stick for user-specified trading-pairs: https://binance-docs.github.io/apidocs/futures/en/#kline-candlestick-data
> 
> test/java  com.trading.gateway.binance.market.BinanceCandleStick


> liquidation order: https://binance-docs.github.io/apidocs/futures/en/#liquidation-order-streams
> 
> test/java  com.trading.gateway.binance.market.BinanceLiquidationOrder


> return mark-price for some user specified symbol: https://binance-docs.github.io/apidocs/futures/en/#mark-price-stream
> 
> test/java  com.trading.gateway.binance.marekt.BinanceMarkPrice
 

> return difference of the order book at some frequency: https://binance-docs.github.io/apidocs/futures/en/#diff-book-depth-streams
> 
> test/java  com.trading.gateway.binance.market.BInanceDiffDepth
 
### Private endpoint: 

> cancel order: https://binance-docs.github.io/apidocs/futures/en/#cancel-order-trade
> 
> cancel order of a specific symbol with a specific id
> 
> test/java  com.trading.gateway.binance.trade.CancelOrder


> get account information: https://binance-docs.github.io/apidocs/futures/en/#account-information-v2-user_data
> 
> test/java  com.trading.gateway.binance.trade.GetAccount 


> get balance information:  https://binance-docs.github.io/apidocs/futures/en/#futures-account-balance-v2-user_data
> 
> test/java  com.trading.gateway.binance.trade.GetBalance


> get all open orders regarding some user-specified symbol : https://binance-docs.github.io/apidocs/futures/en/#cancel-all-open-orders-trade
> 
> test/java  com.trading.gateway.binance.trade.GetOpenOrders


> get a specific order information:  https://binance-docs.github.io/apidocs/futures/en/#query-order-user_data
> 
> test/java  com.trading.gateway.binance.trade.GetOrder


> post a new order: https://binance-docs.github.io/apidocs/futures/en/#new-order-trade
> 
> test/java  com.trading.gateway.binance.trade.PostOrder
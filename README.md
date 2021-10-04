# Project Gateway

**Trading gateway for binance exchange, mainly for two parts, the first one is a general websocket framework: 
*com.trading.gateway.utils.websocket*, which could be used for other exchanges**

**The Second part is for binance gateway implementation, mainly for public market data endpoints and private trading endpoints**

### Public endpoints:

> aggragate trade data: https://binance-docs.github.io/apidocs/futures/en/#compressed-aggregate-trades-list
> 
> test/java/ com.trading.gateway.binance.BinanceAggTrade

> 
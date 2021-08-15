package com.trading.gateway.utils.websocket.model.user;

import com.trading.gateway.binance.api.domain.constants.BinanceApiConstants;
import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;


@Data
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderUpdate {

    private String symbol;

    private String clientOrderId;

    private String side;

    private String type;

    private String timeInForce;

    private BigDecimal origQty;

    private BigDecimal price;

    private BigDecimal avgPrice;

    private BigDecimal stopPrice;

    private String executionType;

    private String orderStatus;

    private Long orderId;

    private BigDecimal lastFilledQty;

    private BigDecimal cumulativeFilledQty;

    private BigDecimal lastFilledPrice;

    private String commissionAsset;

    private BigDecimal commissionAmount;

    private Long orderTradeTime;

    private Long tradeID;

    private BigDecimal bidsNotional;

    private BigDecimal asksNotional;

    private Boolean isMarkerSide;

    private Boolean isReduceOnly;

    private String workingType;

    private BigDecimal activationPrice;

    private BigDecimal callbackRate;

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("symbol", symbol)
                .append("clientOrderId", clientOrderId).append("side", side).append("type", type)
                .append("timeInForce", timeInForce).append("origQty", origQty).append("price", price)
                .append("avgPrice", avgPrice).append("stopPrice", stopPrice).append("executionType", executionType)
                .append("orderStatus", orderStatus).append("orderId", orderId).append("lastFilledQty", lastFilledQty)
                .append("cumulativeFilledQty", cumulativeFilledQty).append("lastFilledPrice", lastFilledPrice)
                .append("commissionAsset", commissionAsset).append("commissionAmount", commissionAmount)
                .append("orderTradeTime", orderTradeTime).append("tradeID", tradeID)
                .append("bidsNotional", bidsNotional).append("asksNotional", asksNotional)
                .append("isMarkerSide", isMarkerSide).append("isReduceOnly", isReduceOnly)
                .append("workingType", workingType).append("activationPrice", activationPrice)
                .append("callbackRate", callbackRate).toString();
    }
}

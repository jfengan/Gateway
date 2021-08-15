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
public class PositionUpdate {

    private String symbol;

    private BigDecimal amount;

    private BigDecimal entryPrice;

    private BigDecimal preFee;

    private BigDecimal unrealizedPnl;

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("symbol", symbol)
                .append("amount", amount).append("entryPrice", entryPrice).append("preFee", preFee)
                .append("unrealizedPnl", unrealizedPnl).toString();
    }
}

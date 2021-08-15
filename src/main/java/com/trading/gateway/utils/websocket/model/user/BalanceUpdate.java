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
public class BalanceUpdate {

    private String asset;

    private BigDecimal walletBalance;

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("asset", asset)
                .append("walletBalance", walletBalance).toString();
    }
}

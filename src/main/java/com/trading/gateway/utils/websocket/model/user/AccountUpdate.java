package com.trading.gateway.utils.websocket.model.user;

import com.trading.gateway.binance.api.domain.constants.BinanceApiConstants;
import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@Data
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AccountUpdate {

    private List<BalanceUpdate> balances;

    private List<PositionUpdate> positions;

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("balances", balances)
                .append("positions", positions).toString();
    }
}

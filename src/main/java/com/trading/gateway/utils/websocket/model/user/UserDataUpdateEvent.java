package com.trading.gateway.utils.websocket.model.user;


import com.trading.gateway.binance.api.domain.constants.BinanceApiConstants;
import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;


@Data
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDataUpdateEvent {

    private String eventType;

    private Long eventTime;

    private Long transactionTime;

    private AccountUpdate accountUpdate;

    private OrderUpdate orderUpdate;

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("eventType", eventType)
                .append("eventTime", eventTime).append("accountUpdate", accountUpdate)
                .append("orderUpdate", orderUpdate).toString();
    }
}

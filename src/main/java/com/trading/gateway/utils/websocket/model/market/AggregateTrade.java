package com.trading.gateway.utils.websocket.model.market;

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
public class AggregateTrade {

    private Long id;

    private BigDecimal price;

    private BigDecimal qty;

    private Long firstId;

    private Long lastId;

    private Long time;

    private Boolean isBuyerMaker;

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("id", id)
                .append("price", price).append("qty", qty).append("firstId", firstId).append("lastId", lastId)
                .append("time", time).append("isBuyerMaker", isBuyerMaker).toString();
    }
}

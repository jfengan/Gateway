package com.trading.gateway.utils.websocket.model;

import com.trading.gateway.binance.api.domain.constants.BinanceApiConstants;
import lombok.*;
import org.apache.commons.lang3.builder.ToStringBuilder;


@Data
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult {

    private int code;

    private String msg;


    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("code", code)
                .append("msg", msg).toString();
    }
}

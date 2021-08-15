package com.trading.gateway.utils.websocket;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubscriptionOptions {

    private String uri;
    private boolean isAutoReconnect = true;
    private int receiveLimitMs = 300_000;
    private int connectionDelayOnFailure = 15;

    public SubscriptionOptions(SubscriptionOptions options) {
        this.uri = options.uri;
        this.isAutoReconnect = options.isAutoReconnect;
        this.receiveLimitMs = options.receiveLimitMs;
        this.connectionDelayOnFailure = options.connectionDelayOnFailure;
    }
}

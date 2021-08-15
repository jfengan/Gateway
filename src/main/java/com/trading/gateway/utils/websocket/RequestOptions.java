package com.trading.gateway.utils.websocket;

import java.net.URL;


public class RequestOptions {

    private String url;

    public RequestOptions() {
    }

    public RequestOptions(RequestOptions option) {
        this.url = option.url;
    }

    public void setUrl(String url) {
        try {
            URL u = new URL(url);
            this.url = u.toString();
        } catch (Exception e) {
            throw new ApiException(ApiException.INPUT_ERROR, "The URI is incorrect: " + e.getMessage());
        }
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}

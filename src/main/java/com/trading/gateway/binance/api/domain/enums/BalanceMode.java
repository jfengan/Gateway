package com.trading.gateway.binance.api.domain.enums;


public enum BalanceMode {

  TOTAL("1");

  private final String code;

  BalanceMode(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }
}

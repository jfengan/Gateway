package com.trading.gateway.binance.api.domain.enums;

public enum AccountChangeModeEnum {

  TOTAL("1");

  private final String code;

  AccountChangeModeEnum(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }
}

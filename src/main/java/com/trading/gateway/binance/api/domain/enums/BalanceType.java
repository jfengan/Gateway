package com.trading.gateway.binance.api.domain.enums;

import com.trading.gateway.utils.websocket.impl.utils.EnumLookup;

public enum BalanceType {
  TRADE("trade"),
  FROZEN("frozen"),
  LOAN("loan"),
  INTEREST("interest"),
  LOAN_AVAILABLE("loan-available"),
  TRANSFER_OUT_AVAILABLE("transfer-out-available");



  private final String code;

  BalanceType(String code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return code;
  }

  public static final EnumLookup<BalanceType> lookup = new EnumLookup<>(BalanceType.class);

  public static BalanceType lookup(String name) {
    return lookup.lookup(name);
  }

}

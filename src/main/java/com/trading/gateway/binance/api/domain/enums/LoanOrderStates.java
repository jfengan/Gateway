package com.trading.gateway.binance.api.domain.enums;

import com.trading.gateway.utils.websocket.impl.utils.EnumLookup;

public enum LoanOrderStates {

  CREATED("created"),
  ACCRUAL("accrual"),
  CLEARED("cleared"),
  INVALID("invalid");

  private final String code;

  LoanOrderStates(String state) {
    this.code = state;
  }

  @Override
  public String toString() {
    return code;
  }

  public static final EnumLookup<LoanOrderStates> lookup = new EnumLookup<>(LoanOrderStates.class);

  public static LoanOrderStates lookup(String name) {
    return lookup.lookup(name);
  }
}

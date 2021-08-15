package com.trading.gateway.binance.api.domain.enums;

import com.trading.gateway.utils.websocket.impl.utils.EnumLookup;

public enum AccountType {
  SPOT("spot"),
  MARGIN("margin"),
  OTC("otc"),
  POINT("point"),
  SUPER_MARGIN("super-margin"),
  MINEPOOL("minepool"),
  ETF( "etf"),
  AGENCY( "agency"),
  UNKNOWN("unknown");

  private final String code;

  AccountType(String code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return code;
  }

  private static final EnumLookup<AccountType> lookup = new EnumLookup<>(AccountType.class);

  public static AccountType lookup(String name) {
    return lookup.lookup(name);
  }

}

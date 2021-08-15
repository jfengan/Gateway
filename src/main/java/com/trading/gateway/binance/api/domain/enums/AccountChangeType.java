package com.trading.gateway.binance.api.domain.enums;

import com.trading.gateway.utils.websocket.impl.utils.EnumLookup;

public enum AccountChangeType {


  NEWORDER("order.place"),

  TRADE("order.match"),

  REFUND("order.refund"),

  CANCELORDER("order.cancel"),

  FEE("order.fee-refund"),

  TRANSFER("margin.transfer"),

  LOAN("margin.loan"),

  INTEREST("margin.interest"),

  REPAY("margin.repay"),

  OTHER("other"),

  INVALID("INVALID");

  private final String code;

  AccountChangeType(String code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return code;
  }

  private static final EnumLookup<AccountChangeType> lookup = new EnumLookup<>(
      AccountChangeType.class);

  public static AccountChangeType lookup(String name) {
    return lookup.lookup(name);
  }


}

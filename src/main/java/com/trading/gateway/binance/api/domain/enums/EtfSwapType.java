package com.trading.gateway.binance.api.domain.enums;

import com.trading.gateway.utils.websocket.impl.utils.EnumLookup;

public enum  EtfSwapType {
  ETF_SWAP_IN("1"),
  ETF_SWAP_OUT("2");

  private final String code;

  EtfSwapType(String code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return code;
  }

  public static final EnumLookup<EtfSwapType> lookup = new EnumLookup<>(EtfSwapType.class);

  public static EtfSwapType lookup(String name) {
    return lookup.lookup(name);
  }
}

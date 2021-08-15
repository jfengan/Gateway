package com.trading.gateway.binance.api.domain.enums;

public enum DealRole {


  TAKER("taker"),
  MAKER("maker")
  ;

  private final String role;

  DealRole(String role) {
    this.role = role;
  }

  public String getRole() {
    return role;
  }

  public static DealRole find(String role) {
    for (DealRole fr : DealRole.values()) {
      if (fr.getRole().equals(role)) {
        return fr;
      }
    }
    return null;
  }
}

package com.trading.gateway.binance.api.domain.enums;

import com.trading.gateway.utils.websocket.impl.utils.EnumLookup;


/**
 * withdraw, deposit.
 */
public enum WithdrawState {


  SUBMITTED("submitted"),
  REEXAMINE("reexamine"),
  CANCELED("canceled"),
  PASS("pass"),
  REJECT("reject"),
  PRETRANSFER("pre-transfer"),
  WALLETTRANSFER("wallet-transfer"),
  WALEETREJECT("wallet-reject"),
  CONFIRMED("confirmed"),
  CONFIRMERROR("confirm-error"),
  REPEALED("repealed");


  private final String code;

  WithdrawState(String code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return code;
  }

  public static final EnumLookup<WithdrawState> lookup = new EnumLookup<>(WithdrawState.class);

  public static WithdrawState lookup(String name) {
    return lookup.lookup(name);
  }

}

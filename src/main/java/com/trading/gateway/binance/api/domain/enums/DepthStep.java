package com.trading.gateway.binance.api.domain.enums;


public enum  DepthStep {

  STEP0("step0"),
  STEP1("step1"),
  STEP2("step2"),
  STEP3("step3"),
  STEP4("step4"),
  STEP5("step5"),
  ;

  private final String step;

  DepthStep(String step) {
    this.step = step;
  }

  public String getStep() {
    return step;
  }
}

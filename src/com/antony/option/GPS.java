package com.antony.option;

public class GPS implements IOption {
  private Double prix;
  private String name;

  public GPS() {
    this.prix = 100.0d;
    this.name = "GPS";
  }


  @Override
  public Double getPriceOption() {
    return this.prix;
  }

  @Override
  public String toString() {
    return "GPS{" +
        "prix=" + prix +
        ", name='" + name + '\'' +
        '}';
  }
}

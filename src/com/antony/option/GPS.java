package com.antony.option;

public class GPS implements Option {
  private Double prix;
  private String name;

  public GPS() {
    this.prix = 100.0d;
    this.name = "GPS";
  }


  @Override
  public Double getPrix() {
    return this.prix;
  }
}

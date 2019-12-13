package com.antony.option;

public class BarreDeToit implements IOption {
  private Double prix;
  private String name;

  public BarreDeToit() {
    this.prix = 3000.0d;
    this.name = "Barre de toit";
  }

  @Override
  public Double getPriceOption() {
    return this.prix;
  }

  @Override
  public String toString() {
    return "Barre de toit{" +
        "prix=" + prix +
        ", name='" + name + '\'' +
        '}';
  }
}

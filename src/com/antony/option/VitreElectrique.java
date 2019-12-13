package com.antony.option;

public class VitreElectrique implements IOption{
  private Double prix;
  private String name;

  public VitreElectrique() {
    this.prix = 2500.45d;
    this.name = "Vitre electrique";
  }


  @Override
  public Double getPriceOption() {
    return this.prix;
  }

  @Override
  public String toString() {
    return "Vitre electrique{" +
        "prix=" + prix +
        ", name='" + name + '\'' +
        '}';
  }
}

package com.antony.option;

public class Climatisation implements IOption{
  private Double prix;
  private String name;

  public Climatisation() {
    this.prix = 5462.24d;
    this.name = "Climatisation";
  }


  @Override
  public Double getPriceOption() {
    return this.prix;
  }

  @Override
  public String toString() {
    return "Climatisation{" +
        "prix=" + prix +
        ", name='" + name + '\'' +
        '}';
  }
}

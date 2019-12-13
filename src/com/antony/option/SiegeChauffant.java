package com.antony.option;

public class SiegeChauffant implements IOption {
  private Double prix;
  private String name;

  public SiegeChauffant() {
    this.prix =  7589.52d;
    this.name = "Siege Chauffant";
  }


  @Override
  public Double getPriceOption() {
    return this.prix;
  }

  @Override
  public String toString() {
    return "Siege Chauffant{" +
        "prix=" + prix +
        ", name='" + name + '\'' +
        '}';
  }
}

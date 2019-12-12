package com.antony.moteur;

public class Moteur {
  private TypeMoteur type;
  private String cylidre;
  private Double prix;

  public Moteur() {
  }

  public Moteur(String cylidre, Double prix) {
    this.type = null;
    this.cylidre = cylidre;
    this.prix = prix;
  }

  @Override
  public String toString() {
    return "Moteur{" +
        "type=" + type +
        ", cylidre='" + cylidre + '\'' +
        ", prix=" + prix +
        '}';
  }
}

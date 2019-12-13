package com.antony.moteur;

public class MoteurDiesel extends Moteur {
  private TypeMoteur moteur;
  public MoteurDiesel(String cylidre, Double prix) {
    super(cylidre, prix);
    this.type = TypeMoteur.DIESEL;
  }

  @Override
  public String toString() {
    return super.toString();
  }


}

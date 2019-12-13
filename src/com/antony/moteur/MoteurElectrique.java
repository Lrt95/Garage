package com.antony.moteur;

public class MoteurElectrique extends Moteur {
  private TypeMoteur moteur;
  public MoteurElectrique(String cylidre, Double prix) {
    super(cylidre, prix);
    this.type = TypeMoteur.ELECTRIQUE;
  }

  @Override
  public String toString() {
    return super.toString();
  }

}

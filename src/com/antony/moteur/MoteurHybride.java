package com.antony.moteur;

public class MoteurHybride extends Moteur {
  private TypeMoteur moteur;
  public MoteurHybride(String cylidre, Double prix) {
    super(cylidre, prix);
    this.type = TypeMoteur.HYBRIDE;
  }

  @Override
  public String toString() {
    return super.toString();
  }

}

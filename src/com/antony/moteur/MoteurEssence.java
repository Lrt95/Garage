package com.antony.moteur;

public class MoteurEssence extends Moteur {

  private TypeMoteur moteur;
  public MoteurEssence(String cylidre, Double prix) {
    super(cylidre, prix);
    this.type = TypeMoteur.ESSENCE;
  }

  @Override
  public String toString() {
    return super.toString();
  }

}

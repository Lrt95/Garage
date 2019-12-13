package com.antony.moteur;

import com.antony.voiture.Voiture;
import java.io.Serializable;

public class Moteur extends Voiture implements Serializable {
  protected TypeMoteur type;
  private String cylidre;
  private Double prix;

  public Moteur() {
  }

  public Moteur(String cylidre, Double prix) {
    this.type = null;
    this.cylidre = cylidre;
    this.prix = prix;
  }

  public Double getPriceMoteur() {
    return prix;
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

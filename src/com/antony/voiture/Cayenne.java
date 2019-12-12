package com.antony.voiture;

public class Cayenne extends Voiture {

  public Cayenne() {
    super();
    this.prix = 240000.0d;
    this.nom = "Cayenne";
    this.nomMarque = Marque.Porsche;
  }

  public Cayenne(String nom, Marque nomMarque, Double prix) {
    super(nom, nomMarque, prix);
  }

}

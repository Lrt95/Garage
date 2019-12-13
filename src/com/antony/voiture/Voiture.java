package com.antony.voiture;

import com.antony.garage.Garage;
import com.antony.moteur.Moteur;
import com.antony.option.IOption;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Voiture extends Garage implements Serializable, IOption {
  protected Double prix;
  protected String nom;
  protected Marque nomMarque;
  private  Moteur moteur;
  private transient List<IOption> option = new ArrayList<>();

  public Voiture() {
    this.prix = null;
    this.nom = null;
    this.nomMarque = null;

  }

  public Double getPriceVoiture() {
    return this.prix + this.moteur.getPriceMoteur() + this.option.stream().map(x -> x.getPriceOption()).reduce(0.0d ,(x,y) -> x + y);
  }

  public String getNom() {
    return nom;
  }

  public Marque getNomMarque() {
    return nomMarque;
  }

  public Moteur getMoteur() { return moteur; }



  @Override
  public String toString() {
    return "Voiture{" +
        "prix=" + getPriceVoiture() +
        ", nom='" + getNom() + '\'' +
        ", nomMarque=" + getNomMarque() +
        ", moteur=" + getMoteur() +
        ", option=" + getOption() +
        '}';
  }

  public void setMoteur(Moteur moteur) {
    this.moteur = moteur;
  }

  public List<IOption> getOption() {
    return option;
  }

  public void addOption(IOption option) {
      this.option.add(option);
  }

  @Override
  public Double getPriceOption() {
    return null;
  }
}

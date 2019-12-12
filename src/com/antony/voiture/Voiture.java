package com.antony.voiture;

import com.antony.moteur.Moteur;
import com.antony.option.Option;
import java.util.ArrayList;
import java.util.List;

public class Voiture implements Option {
  protected Double prix;
  protected String nom;
  protected Marque nomMarque;
  private Moteur moteur;
  private List<Option> option = new ArrayList<Option>();

  public Voiture() {
    this.prix = null;
    this.nom = null;
    this.nomMarque = null;
  }

  public Voiture( String nom, Marque nomMarque, Double prix) {
    this.prix = prix;
    this.nom = nom;
    this.nomMarque = nomMarque;
  }

  public Double getPrix() {
    return prix;
  }

  public String getNom() {
    return nom;
  }

  public Marque getNomMarque() {
    return nomMarque;
  }

  @Override
  public String toString() {
    return "Voiture{" +
        "prix=" + prix +
        ", nom='" + nom + '\'' +
        ", nomMarque=" + nomMarque +
        ", moteur=" + moteur +
        ", option="  +
        '}';
  }

  public void setMoteur(Moteur moteur) {
    this.moteur = moteur;
  }
  public void  getOption () {
     this.option.stream().forEach(System.out::println);
  }
  public void addOption(Option option) {
      this.option.add(option);
  }
}

package com.antony.moteur;

public enum TypeMoteur {
  DIESEL("Diesel"),
  ESSENCE("Essence"),
  HYBRIDE("Hybride"),
  ELECTRIQUE("Electrique");

  private String name = "";

  TypeMoteur(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}

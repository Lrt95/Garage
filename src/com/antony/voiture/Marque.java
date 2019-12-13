package com.antony.voiture;

public enum Marque {
  PEUGEOT("Peugeot"),
  CITROEN("Citroen"),
  RENAULT("Renault"),
  FERRARI("Ferrari"),
  AUDI("Audi"),
  PORSCHE("Porsche"),
  BMW("BMW"),
  DACIA("Dacia"),
  TOYOTA("Toyota"),
  HYUNDAI("Hyundai"),
  SEAT("Seat");

  private String name = "";

  Marque(String name) {
    this.name = name;
  }


  public String toString() {
    return this.name;
  }
}

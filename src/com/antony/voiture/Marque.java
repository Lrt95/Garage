package com.antony.voiture;

import java.util.stream.Stream;

public enum Marque {
  Peugeot("Peugeot"),
  Citroen("Citroen"),
  Renault("Renault"),
  Ferrari("Ferrari"),
  Audi("Audi"),
  Porsche("Porsche"),
  BMW("BMW"),
  Dacia("Dacia"),
  Toyota("Toyota"),
  Hyundai("Hyundai"),
  Seat("Seat");

  private String name = "";

  Marque(String name) {
    this.name = name;
  }



  public String toString() {
    return this.name;
  }
}

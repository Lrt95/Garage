package com.antony.garage;

import com.antony.voiture.Voiture;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Garage {

  private ArrayList<Voiture> voitures = new ArrayList<>();
  private ArrayList<Voiture> listvoitures = new ArrayList<>();
  private ObjectOutputStream oos;
  private ObjectInputStream ois;
  private String fileName = "garage.txt";

  public Garage () {
    if (!Files.exists(Paths.get(fileName))) {
      try {
        Files.createFile(Paths.get(fileName));
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  public Garage(ArrayList<Voiture> voitures) {
    this.voitures = voitures;
  }

  public void addVoiture(Voiture voiture) {
    try {
      this.voitures.add(voiture);
      oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File(fileName))));
      oos.writeObject(this.voitures);
      oos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private String getVoitures() {
    try {
      if (Files.size(Paths.get(fileName)) > 0) {
        ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File(fileName))));
        this.listvoitures = (ArrayList<Voiture>) ois.readObject();
        ois.close();
      } else {
        return "aucun véhicule";
      }
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
    return "Garage Antony";
  }

  @Override
  public String toString() {
    getVoitures();
    String temp = "";
    for (int i = 0; i < this.listvoitures.size(); i++ ){
       temp = temp + "\n" + "Voiture : " + this.listvoitures.get(i).getNomMarque() + " " + this.listvoitures.get(i).getNom() + " " /*+ this.listvoitures.get(i).getPriceVoiture()*/ + "€" ;
    }
    return temp;
  }
}




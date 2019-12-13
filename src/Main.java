import com.antony.garage.Garage;
import com.antony.moteur.*;;
import com.antony.option.*;
import com.antony.voiture.*;

public class Main {

  public static void main(String[] args) {
    Garage garage = new Garage();

    Voiture test = new Clio();
    test.setMoteur(new MoteurEssence("90CH", 5262d));
    test.addOption(new VitreElectrique());
    test.addOption(new Climatisation());
    garage.addVoiture(test);
    Voiture test2 = new RS8();
    test2.setMoteur(new MoteurHybride("850CH", 545262d));
    test2.addOption(new VitreElectrique());
    test2.addOption(new Climatisation());
    test2.addOption(new GPS());
    garage.addVoiture(test2);
    System.out.println(test);
    System.out.println(garage);
  }
}

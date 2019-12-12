import com.antony.moteur.MoteurEssence;
import com.antony.option.GPS;
import com.antony.voiture.Cayenne;
import com.antony.voiture.Voiture;

public class Main {

  public static void main(String[] args) {
    Voiture test = new Cayenne();
    test.setMoteur(new MoteurEssence("essence", 12543d));
    test.addOption(new GPS());
    System.out.println(test);
    test.getOption();
  }
}

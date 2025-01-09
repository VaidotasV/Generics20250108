import java.util.ArrayList;
import java.util.List;

public class MainUzduotis2_2 {
    public static void main(String[] args) {

        Berzas berzas1 = new Berzas();
        Berzas berzas2 = new Berzas();
        Berzas berzas3 = new Berzas();
        Azuolas azuolas = new Azuolas();
        Egle egle = new Egle();
        Pusis pusis = new Pusis();
        Kadagys kadagys = new Kadagys();

        List<Medis> ivairusMedziai = new ArrayList<>();
        ivairusMedziai.add(berzas1);
        ivairusMedziai.add(azuolas);
        ivairusMedziai.add(kadagys);
        ivairusMedziai.add(egle);
        ivairusMedziai.add(pusis);

        List<Spygliuotis> spygliuociai = new ArrayList<>();
        spygliuociai.add(kadagys);
        spygliuociai.add(egle);
        spygliuociai.add(pusis);

        List<Berzas> berzai = new ArrayList<>();
        berzai.add(berzas1);
        berzai.add(berzas2);
        berzai.add(berzas3);

        Miskas.ivairusMiskas(ivairusMedziai);
        System.out.println();

        Miskas.spygliuociuMiskas(spygliuociai);
        System.out.println();

        Miskas.berzuMiskas(berzai);
    }
}


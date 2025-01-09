import java.util.List;

public class Miskas {

    public static void ivairusMiskas(List<? extends Medis> medziai) {
        System.out.println("Ivairus miskas:");
        for (Medis medis : medziai) {
            medis.turi();
        }
    }

    public static void spygliuociuMiskas(List<? extends Spygliuotis> medziai) {
        System.out.println("Spygliuociu miskas:");
        for (Spygliuotis medis : medziai) {
            medis.turi();
        }
    }

    public static void berzuMiskas(List<? extends Berzas> medziai) {
        System.out.println("Berzu miskas:");
        for (Berzas medis : medziai) {
            medis.turi();
        }
    }
}

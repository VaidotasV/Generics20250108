public class Main {
    public static void main(String[] args) {

        Integer[] skaiciai = {1, 2, 3};
        String[] eilutes = {"Hello", "World"};

        spausdintiMasyva(skaiciai);
        spausdintiMasyva(eilutes);
    }

    public static <T> void spausdintiMasyva(T[] masyvas) {
        for (T elementas : masyvas) {
            System.out.println(elementas);
        }
    }
}

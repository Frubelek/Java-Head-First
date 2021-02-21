package GraWStatkiUproszczona_Strona130;

public class ProstyPortal {

    static int[] polaPolozenia;
    static int ilostTrafien;

    public void setPolaPolozenia(int[] ppol) {
        polaPolozenia = ppol;
    }


    public static String sprawdz(String stringPole) {
        int strzal = Integer.parseInt(stringPole);
        String wynik = "pudło";

        for (int pole : polaPolozenia) {
            if (strzal == pole) {
                wynik = "trafiony";
                ilostTrafien++;
                break;
            }
        }
        if (ilostTrafien == polaPolozenia.length) {
            wynik = "zatopiony";
        }
        System.out.println(wynik);
        return wynik;
    }
}

package GraWStatkiUproszczona_Strona130;

public class GraPortalTest {
    public String sprawdz(String stringPole) {
        int strzal = Integer.parseInt(stringPole);
        String wynik = "pudło";

        for (int pole : polePolozenia) {
            if (strzal == pole) {
                wynik = "trafiony";
                iloscTrafien++;
                break;
            }
        }
        if (iloscTrafien == polePolozenia.length) {
            wynik = "zatopiony";

        }
        System.out.println(wynik);
        return wynik;
    }
}


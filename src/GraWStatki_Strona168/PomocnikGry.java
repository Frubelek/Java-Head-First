package GraWStatki_Strona168;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class PomocnikGry {

    private static final String alfabet = "abcdefg";
    private final int dlugoscPlanszy = 7;
    private final int wielkoscPlanszy = 49;
    private final int [] plansza = new int[wielkoscPlanszy];
    private int iloscPortali = 0;

    public String pobierzDaneWejsciowe(String komunikat) {
        String daneWejsciowe = null;
        System.out.println(komunikat + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            daneWejsciowe = is.readLine();
            if (daneWejsciowe.length() == 0)
                return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
//        return daneWejsciowe.toLowerCase();       // InteliJ podpowiedział aby to zmienić
        return Objects.requireNonNull(daneWejsciowe).toLowerCase();
    }

    public ArrayList rozmiescPotal(int wielkoscPortalu) {
        ArrayList<String> zajetePola = new ArrayList<>();
//        String [] wspolrzedneLnc = new String[wielkoscPortalu];
        String pomoc;
        int [] wspolrzedne = new int[wielkoscPortalu];
        int prob = 0;
        boolean powodzenie = false;
        int polozenie;

        iloscPortali++;
        int inkr = 1;
        if ((iloscPortali % 2) == 1) {

            inkr = dlugoscPlanszy;
        }

        while (!powodzenie & prob++ < 200 ) {
            polozenie = (int) (Math.random() * wielkoscPlanszy);
//            System.out.println(" sprawdź " + polozenie);
            int x = 0;
            powodzenie = true;
                while (powodzenie && x < wielkoscPortalu) {
                    if (plansza[polozenie] == 0) {
                        wspolrzedne[x++] = polozenie;
                        polozenie += inkr;
                        if (polozenie >= wielkoscPlanszy) {
                            powodzenie = false;
                        }
                        if (x > 0 & (polozenie % dlugoscPlanszy == 0)) {
                            powodzenie = false;
                        }
                    } else {
//                        System.out.println(" już zajęte " + polozenie);
                        powodzenie = false;
                    }
                }
        }
        int x = 0;
        int wiersz;
        int kolumna;
        System.out.print("\n");
        while (x < wielkoscPortalu) {
            plansza[wspolrzedne[x]] = 1;
            wiersz = wspolrzedne[x] / dlugoscPlanszy;
            kolumna = wspolrzedne[x] % dlugoscPlanszy;
            pomoc = String.valueOf(alfabet.charAt(kolumna));
            zajetePola.add(pomoc.concat(Integer.toString(wiersz)));
            x++;
            System.out.println(" współrzędne " + x + " = " + zajetePola.get(x - 1));
        }
        System.out.print("\n");
        return zajetePola;
    }
}

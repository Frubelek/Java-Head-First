package GraWStatki_Strona168;

import java.util.ArrayList;

public class Portal {

//    deklaracja składowych klasy Portal

    private ArrayList<String> polaPolozenia;
    private String nazwa;

//    wywołanie metod

    public void setPolaPolozenia(ArrayList<String> ppol) {  // metoda do zapisania polozenia portalu,
        polaPolozenia = ppol;                               // Polozenie jest generowane losowo przez
    }                                                       // metodę rozmiescPortal() w klasie PomocnikGry.

    public void setNazwa(String nazwaPortalu) {     // metoda ustawiająca nazwę portalu
        nazwa = nazwaPortalu;
    }

    public String sprawdz(String ruch) {        // ruch - argument
        String wynik = "pudło";
        int indeks = polaPolozenia.indexOf(ruch);   // jeśli pole jest zajęte,
                                                    // zwóci indeks tego pola,
                                                    // w przeciwnym razie zwróci -1
        if (indeks >= 0) {                  // jeśli indeks będzie liczbą równą
            polaPolozenia.remove(indeks);   // 0 lub wyższą, pole zostanie usunięte

            if (polaPolozenia.isEmpty()) {      // sprawdza czy wszystkie pola
                wynik = "zatopiony";            // ArrayListy są puste
                System.out.println("Auć! Zatopiłes portal " + nazwa + " :( ");
            } else {
                wynik = "trafiony";
            }
        }
        return wynik;       // Zwracamy wynik: "pudło", "trafiony" lub "zatopiony"
    }

}
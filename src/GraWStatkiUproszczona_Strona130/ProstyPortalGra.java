package GraWStatkiUproszczona_Strona130;

import java.io.IOException;


public class ProstyPortalGra {

    public static void main(String[] args) throws IOException {
        int ilośćRuchówGracza = 0;

        PomocnikGry pomocnik = new PomocnikGry();
        ProstyPortal portal = new ProstyPortal();

        int liczbaLosowa = (int) (Math.random() * 5);

        int[] polozenie = {liczbaLosowa, liczbaLosowa + 1, liczbaLosowa + 2};
        portal.setPolaPolozenia(polozenie);
        boolean czyIstnieje = true;

        while (czyIstnieje == true) {
            String pole = pomocnik.pobierzDaneWejsciowe("Podaj liczbę");

            String wynik = portal.sprawdz(pole);

            ilośćRuchówGracza++;

            if (wynik.equals("zatopiony")) {
                czyIstnieje = false;
                System.out.println(ilośćRuchówGracza + " ruchów");
            }
        }
    }

    private static int[] getInts(int polePolozeniaPoczatkuPortalu) {
        int[] portalWielkosc3 = new int[3];
        portalWielkosc3[0] = polePolozeniaPoczatkuPortalu;
        portalWielkosc3[1] = polePolozeniaPoczatkuPortalu + 1;
        portalWielkosc3[2] = polePolozeniaPoczatkuPortalu + 2;
        return portalWielkosc3;
    }


}

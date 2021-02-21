package zadaniaPoboczneOdStrony142do154;

public class TestowaniePetliFor {

    public static void main(String[] args) {

        System.out.println("*");

        String[] tablicaImion = {"Franek", "Beniek", "Gienek"};

        for (String imie : tablicaImion) {
            System.out.println(imie);
        }

//        Zadanie ze strony 151
        System.out.println("**");

        for (int x = 0; x < 4; x++) {
            for (int y = 4; y > 2; y--) {
                System.out.println(x + " " + y);
            }
            if (x == 1) {
                x++;
            }
        }

//        Zadanie ze strony 152
        System.out.println("***");

        int x = 0;
        int y = 30;
        for (int zewn = 0; zewn < 3; zewn++) {
            for (int wewn = 4; wewn > 1; wewn--) {
//              tu mam umieścić kod aby rozwiazać zadanie
                x = x + 3;
//                x = x + 6;
//                x = x + 2;
//                x++;
//                x--;
//                x = x + 0;
//
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}

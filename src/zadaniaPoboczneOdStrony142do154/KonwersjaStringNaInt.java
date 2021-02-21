package zadaniaPoboczneOdStrony142do154;

public class KonwersjaStringNaInt {

    public static void main(String[] args) {

//        Konwersja łańcucha znaków na wartość int
        int wartosc = Integer.parseInt("3");
        System.out.println(wartosc + 3);

        System.out.println("String " + "3" + 3);


//        Konwersja long na int
        long duzaLiczba = 1999999999999L;
        int duzyInt = (int) duzaLiczba;
        System.out.println(duzaLiczba);
        System.out.println(duzyInt);
    }
}

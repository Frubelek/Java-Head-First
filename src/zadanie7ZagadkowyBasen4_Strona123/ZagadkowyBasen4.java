package zadanie7ZagadkowyBasen4_Strona123;

public class ZagadkowyBasen4 {
    public static void main(String[] args) {
        ZagadkowyBasen4b[] obty = new ZagadkowyBasen4b[6];
        int y = 1;
        int x = 0;
        int wynik = 0;
        while (x < 6) {
            obty[x] = new ZagadkowyBasen4b();
            obty[x].izm = y;
            y = y * 10;
            x = x + 1;
        }
        x = 6;
        while (x > 0) {
            x = x - 1;
            wynik = wynik + obty[x].zrobCos(x);
        }
        System.out.println("Wynik " + wynik);
    }
}



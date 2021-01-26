package zadanie7ZagadkowyBasen4_Strona123;

public class ZagadkowyBasen4b {
    int izm;
    public int zrobCos(int czynnik) {
        if (izm > 100) {
            return izm * czynnik;
        } else {
            return izm * (5 - czynnik);
        }
    }
}

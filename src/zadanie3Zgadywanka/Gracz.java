package zadanie3Zgadywanka;

public class Gracz {

    int liczba = 0;

    public void zgaduj() {
        liczba = (int) (Math.random() * 10);
        System.out.println("Typuję liczbę: " + liczba);
    }
}

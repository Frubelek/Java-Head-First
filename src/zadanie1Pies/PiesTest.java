package zadanie1Pies;

public class PiesTest {

    public static void main(String[] args) {
        Pies p = new Pies();
        p.wielkosc = 40;
        p.szczekaj();
        p.imie = "Burek";
        p.rasa = "Koń";
        System.out.println("A teraz sobie poszczekaj");
        p.szczekaj();
        System.out.println("imie psa to " + p.imie + ", rasa psa to " + p.rasa + ", a wielkosc psa to " + p.wielkosc);
    }
}

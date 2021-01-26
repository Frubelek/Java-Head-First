package zadanie2film;

public class FilmTest {

    public static void main(String[] args) {
        Film pierwszy = new Film();
        pierwszy.tytul = "Przeminęło ze śmiechem";
        pierwszy.rodzaj = "Komediocoś";
        pierwszy.ocena = -1;

        Film drugi = new Film();
        drugi.tytul = "Gacie po tacie";
        drugi.rodzaj = "Komedia Włoska";
        drugi.ocena = 5;
        drugi.odtworzFilm();

        Film trzeci = new Film();
        trzeci.tytul = "Kanapka z masłem";
        trzeci.ocena = 3;
        trzeci.odtworzFilm();
    }
}

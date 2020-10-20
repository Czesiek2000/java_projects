package ppj08;

public class Kukurydza {
    // Deklaracja pola klasy
    public int iloscZiaren;

    // Deklaracja konstruktora inicjujacego wartosc pola
    public Kukurydza(int iloscZiaren) {
        this.iloscZiaren = iloscZiaren;
    }

    // Metoda zwracajaca tablice obiektu Popcorn, w zaleznosci od podanej wartosci do konstruktora
    public Popcorn[] zrobPopcorn() {
        Popcorn[] p;
        if (iloscZiaren == 0) {
            p = new Popcorn[0];
        }else
            p = new Popcorn[iloscZiaren];
        
        // Zwrocenie tablicy
        return p;
    }
}

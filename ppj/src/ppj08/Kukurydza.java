package ppj08;

public class Kukurydza {
    public int iloscZiaren;

    public Kukurydza(int iloscZiaren) {
        this.iloscZiaren = iloscZiaren;
    }

    public Popcorn[] zrobPopcorn() {
        Popcorn[] p;
        if (iloscZiaren == 0) {
            p = new Popcorn[0];
        }else
            p = new Popcorn[iloscZiaren];
        return p;
    }
}

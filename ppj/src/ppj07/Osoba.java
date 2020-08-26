package ppj07;

public class Osoba {
    String imie;
    String nazwisko;
    int rokUrodzenia;

    public Osoba() {

    }

    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public void show() {
        System.out.println("Imie " + imie + " nazwisko " + nazwisko + " rok urodzenia " + rokUrodzenia);
    }
}

package ppj07;

public class Osoba {
    // Deklaracja zmiennych
    String imie;
    String nazwisko;
    int rokUrodzenia;

    // Bezparametrowy konstruktor
    public Osoba() {

    }

    // Konstruktor przyjmujacy i deklarujacy wszystkie pola w klasie
    public Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    // Metoda wyswietlajaca wartosci pol w klasie
    public void show() {
        System.out.println("Imie " + imie + " nazwisko " + nazwisko + " rok urodzenia " + rokUrodzenia);
    }
}

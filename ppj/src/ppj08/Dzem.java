package ppj08;

public class Dzem {
    // Deklaracja pol klasy
    private String smak;
    private double waga;

    // Konstruktor bezparametrowy deklarujacy wartosci domyslne
    public Dzem() {
        this.smak = "No name";
        this.waga = 100.0;
    }

    // Deklaracja pol wartosciami parametrow konstruktora
    public Dzem(String smak, double waga) {
        this.smak = smak;
        this.waga = waga;
    }

    // Konstruktor przyjmujacy wartosc waga
    public Dzem(double waga) {
        // System.out.println("Waga " + waga);
        this.waga = 100.0;
        this.smak = "No name";
    }

    // Konstruktor przyjmujacy wartosc smak
    public Dzem(String smak) {
        // System.out.println("Smak " + smak);
        this.smak = "No name";
        this.waga = 100.0;
    }

    // Metoda wyswietlajaca wartosci pola klasy
    public void showValue() {
        System.out.println("Smak " + this.smak + " waga " + this.waga);
    }
}

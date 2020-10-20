package ppj07;

public class Cplx {
    // Deklaracja pol
    private double rz;
    private double imz;

    // Inicjalizacja wartosci w konstruktorze
    public Cplx(double rz, double imz) {
        this.rz = rz;
        this.imz = imz;
    }

    // Metoda add dodajaca parametr do wartosci pola
    public void add(Cplx c) {
        rz = rz + c.rz;
        imz = imz + c.imz;
    }

    // Metoda odejmujaca wartosc parametru od wartosci pola
    public void sub(Cplx c) {
        rz = rz - c.rz;
        imz = imz - c.imz;
    }

    // Metoda mul mnozaca parametru z wartoscia pola
    public void mul(Cplx c) {
        this.rz = this.rz * c.rz - this.imz * c.imz;
        this.imz = this.rz * c.imz + this.imz * c.rz;
    }

    // Zwiekszenie wartosci o 1
    public void inc() {
        rz++;
    }

    // Wyswietlenie wartosci w postaci 4 + 5i
    public void show() {
        System.out.println((int)rz + " + " + (int)imz + "i");
    }
}

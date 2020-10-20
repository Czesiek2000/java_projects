package ppj10;
public class zestaw11 {
    public static void main(String[] args) {
        Owoc o = new Owoc("Owoc");
        Granat g = new Granat("Granat");
        o.wyswietl();
        g.wyswietl();
        Owoc1 o1 = new Owoc1("Owoc");
        Jablko j = new Jablko("Jablko");
        Gruszka gr = new Gruszka("Gruszka");
        Pomarancza p = new Pomarancza("Pomarancza");
        o1.show();
        j.show();
        gr.show();
        p.show();
        DrzewoIglaste sosna = new DrzewoIglaste(true, 10, "12", 200, 120);
        DrzewoIglaste modrzewie = sosna;
        DrzewoLisciaste deby = new DrzewoLisciaste(true, 20, "13", 2);
        DrzewoLisciaste osiki = deby;
        DrzewoOwocowe morelowce = new DrzewoOwocowe(true, 5, "11", 4, "Morela");
        DrzewoOwocowe sliwy = new DrzewoOwocowe(false, 25, "10", 5, "Sliwa");

        // Deklaracja tablicy zawierajacej wszystkie obiekty drzew.
        Drzewo[] las = {sosna, modrzewie, deby, osiki, morelowce, sliwy};

        // Wyswietlenie elementow w tablicy 
        for (int i = 0; i < las.length; i++) {
            System.out.println(las[i]); // Wywoluje sie metoda toString
        }
    }
}

class Owoc {
    // Deklaracja pola
    String nazwa;

    // Konstruktor inicjujacy pole nazwa
    public Owoc(String nazwa) {
        this.nazwa = nazwa;
    }

    // Metoda wyswietlajaca wartosc pola w klasie
    public void wyswietl() {
        System.out.println("Nazwa " + this.nazwa);
    }

}

// Klasa dziedziczaca po klasie owoc
class Granat extends Owoc {

    // Konstruktor inicjujacy pole w klasie
    public Granat(String nazwa) {
        // Wywolanie konstruktora nadrzednego
        super(nazwa);
    }

    // Wyswietlenie pola
    public void wyswietl() {
        // Wywolania metody nadrzednej
        super.wyswietl();
    }
}

// Klasa owoc rozszerzajaca klase z poprzedniego zadania
class Owoc1 {
    // Deklaracja pol w klasie
    private String nazwa;
    private double masa;

    // Konstruktor inicjujacy pole w klasie
    public Owoc1(String nazwa) {
        this.nazwa = nazwa;
        this.masa = ((Math.random() * 100) + 150); // Przypisanie wartosci losowej od 100 do 250
    }

    // Wyswietlenie wartosci pol
    public void show() {
        System.out.println("Nazwa " + this.nazwa + " masa " + this.masa);
    }

}

// Klasa dziedziczaca funkcje i pola po klasie owoc1
class Jablko extends Owoc1 {
    // Konstruktor inicjujacy pole w klasie
    public Jablko(String nazwa) {
        // Wywolanie konstruktora nadrzednego
        super(nazwa);
    }

    // Nadpisanie metody z klasy nadrzednej
    @Override
    public void show() {
        // Wywolanie metody show z klasy nadrzednej
        super.show();
    }
}

// Klasa dziedziczaca funkcje i pola po klasie owoc1
class Gruszka extends Owoc1 {
    // Konstruktor inicjujacy pole w klasie
    public Gruszka(String nazwa) {
        // Wywolanie konstruktora nadrzednego
        super(nazwa);
    }

    // Nadpisanie metody z klasy nadrzednej
    @Override
    public void show() {
        // Wywolanie metody show z klasy nadrzednej
        super.show();
    }
}

// Klasa dziedziczaca funkcje i pola po klasie owoc1
class Pomarancza extends Owoc1 {
    // Konstruktor inicjujacy pole w klasie
    public Pomarancza(String nazwa) {
        // Wywolanie konstruktora nadrzednego
        super(nazwa);
    }

    // Nadpisanie metody z klasy nadrzednej
    @Override
    public void show() {
        // Wywolanie metody show z klasy nadrzednej
        super.show();
    }
}

// Zadanie 03 
class Drzewo {
    // Deklaracja pol
    public boolean wiecznieZielone;
    public int wysokosc;
    public String przekrojDrzewa;

    // Inicjalizacja pol
    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    // Wyswietlenie wartosci pol
    public String toString() {
        return "Wiecznie zielone " + this.wiecznieZielone + " wysokosc " + this.wysokosc + " przekroj drzewa " + this.przekrojDrzewa;
    }
}

// Klasa dziedziczaca funkcje i pola po klasie drzewo
class DrzewoIglaste extends Drzewo {
    // Inicjacja pol w klasie
    public int iloscIgieł;
    public double dlugoscSzyszki;

    // Konstruktor inicjujacy pola w klasie
    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgieł, double dlugoscSzyszki) {
        // Wywolanie konstruktora z klasy nadrzednej i inicjacja powtarzajacych sie pol 
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        // Inicjacja nowych pol
        this.iloscIgieł = iloscIgieł;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    // Metoda toString wyswietlajaca pola w klasie
    public String toString() {
        // Wywolanie metody toString z klasy nadrzednej i wyswietlenie pol z tej klasy
        return super.toString() + " ilosc igieł " + this.iloscIgieł + " dlugosc szyszki " + this.dlugoscSzyszki;
    }
}

// Klasa dziedziczaca funkcje i pola po klasie drzewo
class DrzewoLisciaste extends Drzewo {
    // Inicjacja pol w klasie
    public int kształtLiscia;

    // Konstruktor inicjujacy pola w klasie
    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int kształtLiscia) {
        // Wywolanie konstruktora z klasy nadrzednej i inicjacja powtarzajacych sie pol 
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        // Inicjacja nowych pol
        this.kształtLiscia = kształtLiscia;
    }

    // Metoda toString wyswietlajaca pola w klasie
    public String toString() {
        // Wywolanie metody toString z klasy nadrzednej i wyswietlenie pol z tej klasy
        return super.toString() + " kształt liscia " + this.kształtLiscia;
    }
}

// Klasa dziedziczaca funkcje i pola po klasie drzewo
class DrzewoOwocowe extends DrzewoLisciaste {
    // Inicjacja pol w klasie
    public String nazwaOwoca;

    // Konstruktor inicjujacy pola w klasie
    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int kształtLiscia, String nazwaOwoca) {
        // Wywolanie konstruktora z klasy nadrzednej i inicjacja powtarzajacych sie pol 
        super(wiecznieZielone, wysokosc, przekrojDrzewa, kształtLiscia);
        
        // Inicjacja nowych pol
        this.nazwaOwoca = nazwaOwoca;
    }

    // Metoda toString wyswietlajaca pola w klasie
    @Override
    public String toString() {
        // Wywolanie metody toString z klasy nadrzednej i wyswietlenie pol z tej klasy
        return super.toString() + " nazwa owoca " + this.nazwaOwoca;
    }
}
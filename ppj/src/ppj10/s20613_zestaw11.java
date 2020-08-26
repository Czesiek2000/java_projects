package ppj10;
public class s20613_zestaw11 {
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

        Drzewo[] las = {sosna, modrzewie, deby, osiki, morelowce, sliwy};

        for (int i = 0; i < las.length; i++) {
            System.out.println(las[i]);
        }
    }
}

class Owoc {
    String nazwa;

    public Owoc(String nazwa) {
        this.nazwa = nazwa;
    }

    public void wyswietl() {
        System.out.println("Nazwa " + this.nazwa);
    }

}

class Granat extends Owoc {

    public Granat(String nazwa) {
        super(nazwa);
    }

    public void wyswietl() {
        super.wyswietl();
    }
}

class Owoc1 {
    private String nazwa;
    private double masa;

    public Owoc1(String nazwa) {
        this.nazwa = nazwa;
        this.masa = ((Math.random() * 100) + 150);
    }

    public void show() {
        System.out.println("Nazwa " + this.nazwa + " masa " + this.masa);
    }

}


class Jablko extends Owoc1 {
    public Jablko(String nazwa) {
        super(nazwa);
    }

    @Override
    public void show() {
        super.show();
    }
}

class Gruszka extends Owoc1 {
    public Gruszka(String nazwa) {
        super(nazwa);
    }

    @Override
    public void show() {
        super.show();
    }
}

class Pomarancza extends Owoc1 {
    public Pomarancza(String nazwa) {
        super(nazwa);
    }

    @Override
    public void show() {
        super.show();
    }
}

class Drzewo {
    public boolean wiecznieZielone;
    public int wysokosc;
    public String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    public String toString() {
        return "Wiecznie zielone " + this.wiecznieZielone + " wysokosc " + this.wysokosc + " przekroj drzewa " + this.przekrojDrzewa;
    }
}

class DrzewoIglaste extends Drzewo{
    public int iloscIgieł;
    public double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int iloscIgieł, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgieł = iloscIgieł;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }

    public String toString() {
        return super.toString() + " ilosc igieł " + this.iloscIgieł + " dlugosc szyszki " + this.dlugoscSzyszki;
    }
}

class DrzewoLisciaste extends Drzewo {
    public int kształtLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int kształtLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.kształtLiscia = kształtLiscia;
    }

    public String toString() {
        return super.toString() + " kształt liscia " + this.kształtLiscia;
    }
}

class DrzewoOwocowe extends DrzewoLisciaste{
    public String nazwaOwoca;
    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int kształtLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, kształtLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return super.toString() + " nazwa owoca " + this.nazwaOwoca;
    }
}
package ppj09;

public class zestaw10 {
    public static void main(String[] args) {
//        Kwadrat k = new Kwadrat(5);
//        k.show();
//
//        Walec w = new Walec(5.0, 4.0);
//        w.show();
//
//        KulaW kw = new KulaW(k);
//        KulaW kw1 = new KulaW(w);
//        KulaNa kn = new KulaNa(k);
//        KulaNa kn1 = new KulaNa(w);

        int[][][] tab = new int[5][8][8];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    System.out.print(tab[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

// Deklaracja klasy kwadrat
class Kwadrat {
    // Deklaracja pola klasy
    private double bok;

    // Konstruktor inicjujacy pole klasy
    public Kwadrat(double bok) {
        this.bok = bok;
    }

    // Metoda liczaca i wyswietlajaca pole i objetosc
    public void show() {
        double pole = Math.pow(this.bok, 2);
        double objetosc = Math.pow(this.bok, 3);;

        System.out.println("Pole " + pole);
        System.out.println("Objetosc " + objetosc);
    }

    // Getter zwracajacy bok
    public double getBok() {
        return bok;
    }
}

class Walec {
    // Deklaracja pol klasy
    private double promien;
    private double wysokosc;

    // Deklaracja konstruktora inicjujacego pola podanymi wartosciami
    public Walec(double promien, double wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    // Metoda liczaca i wyswietlajaca pole i objetosc
    public void show() {
//        pole pir2
        double pole = 3.14 * Math.pow(this.promien, 2);
        double objetosc = pole * this.wysokosc;
        System.out.println("Pole " + pole);
        System.out.println("Objetosc " + objetosc);
    }

    // Getter promien
    public double getPromien() {
        return promien;
    }

    // Getter wysokosc
    public double getWysokosc() {
        return wysokosc;
    }
}


class KulaW {
    // Deklaracja i inicjacja pola
    private double srednica = (Math.random() * 10);

    // Konstruktor przyjmujacy obiekt kwadrat
    public KulaW(Kwadrat k) {
        if (this.srednica < ((k.getBok() * (Math.sqrt(k.getBok()))) / 2)) {
            System.out.println("Miescie sie");
        }else {
            System.out.println("Nie miesci sie");
        }
    }

    // Konstruktor przyjmujacy walec
    public KulaW(Walec w) {
        if (this.srednica < (w.getPromien() * 2)) {
            if (this.srednica < (w.getWysokosc())) {
                System.out.println("Miesci sie ");
            }
        }else {
            System.out.println("Nie miesci sie ");
        }
    }
}

class KulaNa {
    // Deklaracja pola
    private double srednica;

    // Konstruktor inicjujacy pole
    public KulaNa(Kwadrat k) {
        this.srednica = k.getBok();
    }

    // Konstruktor przyjumujacy obiekt walec
    public KulaNa(Walec w) {
        if (w.getWysokosc() > w.getPromien()) {
            System.out.println("walec pionowo kula sie miesci");
        }else {
            System.out.println("walec poziomo kula sie nie miesci");
        }
    }


}

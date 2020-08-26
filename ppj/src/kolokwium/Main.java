package kolokwium;

public class Main {

    public static void main(String[] args) {
        int test = 2;
        happen(2);
        System.out.println("main" + test);

        Zadanie przyklad = new Zadanie(3);
        przyklad.show();

        int test5[] = new int[10];
        happen2(test5);
        int val = 5;
        show(val++);
        show(++val);

        double a = 2.45;
        int b = 43;
        char c = 'A';
        Zadanie2 zadanie2 = new Zadanie2(c,b,c);
        zadanie2.show();

        int[][] table = new int[5][0b1111111 & 5];
        for (int i = table.length - 1; i >= 0; i--) {
            for (int j = table[i].length - 1; j >= 0; j--) {
                System.out.println(i + " " + j);
            }
        }
        System.out.println(0b1111111 & 5);

        int v = 0;
        int w = 0xA;
        System.out.println(v++);

        System.out.println('a' + 'z');
    }

    public static void happen(int value) {
        value -= 6;
        System.out.println("value " + value);
    }

    public static void happen(int tab[]) {
        for (int i = tab.length; i >= 0 ; i--) {
            tab[i] -= 1;
            System.out.println("tab value" + tab[i]);
        }
    }

    public static void happen2(int value) {
        value -= 6;
        System.out.println("value " + value);
    }

    public static void happen2(int tab[]) {
        for (int i = tab.length - 1; i >= 0 ; i--) {
            tab[i] -= 1;
            System.out.println("tab value" + tab[i]);
        }
    }

    public static void show(int value){
        System.out.println(value);
    }

}

class Zadanie {
    int pole1;
    double pole2;
    String pole3;

    public Zadanie(int pole1, double pole2, String pole3) {
        this.pole1 = pole1;
        this.pole2 = pole2;
        this.pole3 = pole3;
    }

    public Zadanie(int pole1) {
        this(pole1, 3.14, "przyklad");
    }

//    public Zadanie(double pole2) {
//        this(12, pole2, "przyklad");
//    }

    public void show() {
        System.out.println(pole1 + " " + pole2 + " " + pole3);
    }
}

class Zadanie2 {
    public double wartosc;
    public int ilosc;
    public char oznaczenie;

    public Zadanie2(double wartosc, int ilosc, char oznaczenie) {
        this.wartosc = wartosc;
        this.ilosc = ilosc;
        this.oznaczenie = oznaczenie;
    }

    public void show() {
        System.out.println(wartosc + " " + ilosc + " " + oznaczenie);
    }
}

class Klasa {
    int pole1;
    double pole2;
    String pole3;

    public Klasa(int pole1, double pole2, String pole3) {
        this.pole1 = pole1;
        this.pole2 = pole2;
        this.pole3 = pole3;
    }
}


class Konstruktor extends Klasa {
    int pole1;

    Konstruktor(int wartosc1, double wartosc2, String string) {
        super(wartosc1, wartosc2, string);
        pole1 = wartosc1;
    }

    Konstruktor(double wartosc2) {
        this(12, wartosc2, "14");
        pole1 = 12;
    }
}
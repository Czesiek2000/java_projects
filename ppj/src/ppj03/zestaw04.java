package ppj03;

public class zestaw04 {

    public void zadanie01() {
        // Deklaracja wartosci
        boolean czyPada = true;
        
        // Sprawdzenie warunku
        if (czyPada == true) {
            System.out.println("Pada");
        }else {
            System.out.println("Nie pada");
        }
    }

    public void zadanie02(){
        // Deklaracja wartosci
        int wrt = 5;
        // Sprawdzenie czy liczba znajduje sie w przedziale
        if (wrt > -15 && wrt < -10) {
            System.out.println("Nalezy do A");
        }

        // Sprawdzenie czy liczba znajduje sie w drugim przedziale
        if (wrt <= -13) {
            System.out.println("Nalezy do B");
        }
    }

    public void zadanie03() {
        int wynik = (int)Math.pow(Math.sqrt(2),2)-2;
        System.out.println(wynik);
    }

    public void zadanie04() {
        // Podpunkt 1
        double sqTwo = Math.sqrt(2);
        double pow = Math.pow(sqTwo, 2);

        // Podpunkt 2
        double wynik = pow - 2;
        System.out.println(wynik);

        // Podpunkt 3
        if (wynik == (int)Math.pow(Math.sqrt(2),2)-2) {
            System.out.println("Wynik jest rowny tyle samo co w zadaniu 3");
        }else {
            System.out.println("Wynik jest inny");
        }
    }

    public void zadanie05(){
        double wynik = 0;
        // Wyswietlenie 10 wartosci sumy
        for (int i = 0; i <= 10; i++) {
            wynik += 1 / (Math.pow(2, i));
            System.out.println(wynik);
        }
    }

    public void zadanie06(){
        int x = 4;
        long y = x * x - x++;

        if (y < 12)
            System.out.println("za mało");
        else
            System.out.println("w sam raz");

        // Wynikiem y jest 12. wynikiem operacji 12 < 12 jest false wiec wykona sie operacja w else
    }

    public void zadanie07(){
        // Wypisanie liczb 1 - 10
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // Wyswietlenie pustej lini
        System.out.println();

        // pomnozenie wartosci wrt przez kolejne wartosci i
        int wrt = 3;
        for (int i = 0; i <= 10; i++) {
            System.out.print(wrt * i + " ");
        }
    }

    public void zadanie08(){
        // Petla po wartosciach od -1500 do 1500
        for (int i = -1500; i < 1500; i++) {
            // Sprawdzenie czy kolejne wartosci sa podzielne przez 2 i 3
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    // Wyswietlenie choinki z gwiazdek
    public void zadanie09(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

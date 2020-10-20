package ppj06;

public class zestaw07 {

    public void zadanie02(char[] c) {
        int licznik = 0;
        // Petla po wszystkich wartosciach w tablicy
        for (int i = 0; i < c.length; i++) {
            // Sprawdzenie czy element na i-tej pozycji jest rowny pustemu znakowi
            if (c[i] == ' ') {
                // Jezeli tak to zwiekszam licznik wystapien
                licznik++;
                System.out.println("spacja " + licznik);
            }else {
                // Jezeli nie to wyswietlam wartosc na danej pozycji
                System.out.print(c[i] + " ");
            }
        }
    }

    public void zadanie03(int tab[], int tab2[], int arg) {
        int length = 0;
        int tab3[];
        // Sprawdzenie ktora tablica jest wieksza
        if (tab.length < tab2.length) {
            length = tab.length;
        } else {
            length = tab2.length;
        }
        
        // Sprawdzenie wartosci argumentu
        if (arg < 0) {
            tab3 = new int[length];
            for (int i = 0; i < length; i++) {
                tab3[i] = tab[i] + tab2[i];
            }

        // Sprawdzenie wartosci argumentu
        }else if (arg > 0) {
            int length2 = 0;
            if (tab.length > tab2.length) {
                length2 = tab.length - tab2.length;
                tab3 = new int[length2];
                for (int i = 0; i < length2; i++) {
                    tab3[i] = tab[tab.length - i - 1];
                    System.out.print(tab3[i] + " ");
                }
            }else if(tab.length == tab2.length){
                tab3 = null;
            }else {
                length2 = tab2.length - tab.length;
                tab3 = new int[length2];
                for (int i = 0; i < length2; i++) {
                    tab3[i] = tab2[tab2.length - i - 1];
                }
            }

            // Wyswietlenie tablicy
            for (int i = 0; i < tab3.length; i++) {
                System.out.print(tab3[i] + " ");
            }

        }else {
            System.out.println("Inna wartosc");
        }

    }

    public void zadanie04() {
        // Utworzenie tablicy 25 x 25
        int tab[][] = new int[25][25];
        // Wypelnienie losowymi wartosciami tablicy
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                int random = (int)(Math.random() * 2);
                tab[i][j] = random;
            }
        }

        // Wyswietlenie tablicy
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("================");
        int n = tab.length;
        int m = 0;
        int j = 0;

        for (int k = 0; k < n; k++){
            for (int i = k; i < n ; i++) {
                m = i+1;
                if (j < n & m < n) {
                    System.out.print(tab[j][m] + " ");
                    j++;
                    m++;
                }
            }
            j=0;
            System.out.println();
        }


    }
}

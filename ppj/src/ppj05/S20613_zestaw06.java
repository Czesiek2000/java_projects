package ppj05;
public class S20613_zestaw06 {
    public void cwiczenie_01() {
        int random = (int)(Math.random() * 10);
        int random2 = (int)(Math.random() * 20);
        int random3 = (int)(Math.random() * 30);

        int tab[] = new int[random];
        int tab2[] = new int[random2];
        int tab3[] = new int[random3];

        int tab4[][] = {tab, tab2, tab3};

        for (int i = 0; i < tab.length; i++) {
            int rand = (int)(Math.random() * 10);
            tab[i] = rand;
            System.out.print(tab[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < tab2.length; i++) {
            int rand = (int)(Math.random() * 20);
            tab2[i] = rand;
            System.out.print(tab2[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < tab3.length; i++) {
            int rand = (int)(Math.random() * 10);
            tab3[i] = rand;
            System.out.print(tab3[i] + " ");
        }
    }

    public void cwiczenie_02() {
        // deklaracja tablicy
        int tab[][] = new int[8][8];

        // Wypełnienie tablicy wartosciami losowymi
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                int rand = (int)(Math.random() * 10);
                tab[i][j] = rand;
            }
        }

        // Wypisanie tablicy
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }

        // Sprawdzenie wartosci na przekatnych tablicy
        int licznik = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 1; j < tab[i].length; j++) {
                System.out.println("tab["+ i +"]"+"["+ i +"] " + tab[i][i] + " " + "tab["+ j +"]"+"["+ j +"] " + tab[j][j]);
                if (tab[i][i] == tab[j][j]) {
                    licznik++;
                    System.out.println("Para " + licznik);
                }

                if (licznik == 3) {
                    System.out.println("Wystepuja 3 takie same liczby");
                }
            }
        }

    }

    public void cwiczenie_03() {
        char[][] tab = {
                {'S', 'a', 'm', 's', 'u', 'n', 'g'},
                {'N', 'o', 'k', 'i', 'a'},
                {'A', 'p', 'p', 'l', 'e'},
                {'B', 'l', 'a', 'c', 'k', 'B', 'e', 'r', 'r', 'y'},
                {'A', 'l', 'c', 'a', 't', 'e', 'l'},
                {'S', 'o', 'n', 'y'},
                {'J', 'o', 'l', 'l', 'a'}
        };

        // Wypisuje tablice
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }


        // czy słowo zawiera i
        for (int i = 0; i < tab[i].length; i++) {
            int k = 0;
            while (k <= tab[i].length - 1) {
                if (tab[i][k] == 'i') {
                    System.out.println("zawiera i na pozycji " + k);
                }
                k++;
            }
        }

        // Suma znakow w słowie wieksza od 255
        for (int i = 0; i < tab[i].length; i++) {
            int sum = 0;
            int l = 0;
            while (l <= tab[i].length - 1) {
                sum += tab[i][l];
                l++;

            }
            if (sum > 255) {
                System.out.println("suma wieksza od 255 " + sum);
            }else {
                System.out.println("suma mniejsza od 255 " + sum);
            }
        }

        // Sprawdzanie czy slowo zawiera dwie takie same litery
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length - 1; j++) {
                for (int k = 1; k < tab[i].length - 1; k++) {
                    if (tab[i][j] == tab[i][k]) {
                        System.out.println("tab[" + i + "]" + "[" + j + "] " + tab[i][j] + " tab[" + i + "]" + "[" + k + "] " + tab[i][k]);
                    }else {
                        System.out.println("nie rowna sie " + tab[i][j] + " " + tab[i][k]);
                    }
                }
            }
        }

    }

    public void cwiczenie_04() {
        int tab[][] = new int[10][10];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                int random = (int)(Math.random() * 10);
                tab[i][j] = random;
            }
        }

        for (int i = 0; i < tab.length; i++) {

           for (int j = 0; j < tab[i].length; j++) {

                for (int k = 0; k < tab[i].length - j - 1; k++) {

                    if (tab[i][k] > tab[i][k + 1]) {

                        int t = tab[i][k];
                        tab[i][k] = tab[i][k + 1];
                        tab[i][k + 1] = t;
                    }
                }
            }
        }


        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}

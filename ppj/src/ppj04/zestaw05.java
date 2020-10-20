package ppj04;

public class zestaw05 {

    public void zadanie01(){
        // Deklaracja tablicy 10 elementowej
        int[] tab = new int[10];
    }

    public int[] zadanie02(){
        // Deklaracja tablicy 10 elementowej
        int[] tab = new int[10];
        int random;
        // Petla wypelniajaca tablice wartosciami losowymi
        for (int i = 0; i < tab.length; i++) {
            // Wartosc 0 i 1
            random = (int)(Math.random() * 2);
            // Przypisanie wartosci 0 i 1 na kazdej pozycji tablicy
            tab[i] = random;
        }

        // Zwrocenie tablicy
        return tab;
    }

    public void zadanie03(int[] tab){
        // Wypelnienie losowymi wartosciami tablicy
        int random;
        for (int i = 0; i < tab.length; i++) {
            random = (int)(Math.random() * 2);
            tab[i] = random;
        }

        // Wyswietlenie tablicy
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        // Wyswietlenie pustej lini
        System.out.println();
        
        // Liczenie 0 i 1 w tablicy
        int i0 = 0;
        int i1 = 0;

        for (int i = 0; i < tab.length; i++) {
            // Sprawdzenie czy element tablicy jest rowny 0 czy 1
            if (tab[i] == 0) {
                i0 += 1;
            }else {
                i1 += 1;
            }
        }
        // Podsumowanie
        System.out.print("0 wystapiło " + i0 + " a jedynek " + i1);
    }

    public void zadanie04(){
        // Deklaracja tablicy o dlugosci 10, zawierajacej same 0
        double tab[] = new double[10];

        System.out.println("Inicjalizacja 0");

        for (int i = 0; i < tab.length; i++) {
            System.out.print( tab[i] + " " );
        }

        System.out.println();
        System.out.println("random numbers");
        // Przypsanie wartosci losowych na kazde miejsce w tablicy
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Math.random();
            System.out.print( tab[i] + " " );
        }

        System.out.println();
        System.out.println("parzyste indeksy");

        // Wyswietlenie wartosci na parzystych miejscach w tablicy
        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                System.out.print(tab[i] + " ");
            }
        }

        System.out.println();
        System.out.println("konwertowane na int ");
        // Konwerotwanie wartosci parzystych na int
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) tab[i];
            if (tab[i] % 2 != 0) {
                System.out.print(tab[i] + " ");
            }
        }
    }

    public void zadanie05(){
        int tab[];
//        System.out.println(tab); wyswietla bład ze zmienna tab nie jest zainicjowana
    }

    // Sprawdzenie dzialania programu z zadania
    public void zadanie06(){
        int tab[] = { 789, 678, 567 };

        for (int i = 0; i < tab.length; i++)

            for (int j = i; j < tab.length; j++)

                System.out.println(tab[i] - tab[j]); // 0 111 222 0 111 0
    }

    public void zadanie07(){
        // Deklaracja tablicy slowa
        String[] slowa = { "Ala", "kota", "ma", "ma", "a", "kot", "Ale"};
        
        // Wyswietlenie tablicy
        for (int i = 0; i < slowa.length; i++) {
            System.out.print(slowa[i] + " ");
        }

        System.out.println();
        
        // Poprawne ulozenie elementow w tablicy
        String[] correct = { slowa[0], slowa[2], slowa[1], slowa[4], slowa[5], slowa[3], slowa[6]};

        // Wyswietlenie poprawnej tablicy
        for (int i = 0; i < correct.length; i++) {
            System.out.print(correct[i] + " ");
        }
    }

    public void zadanie08(){
        // Deklaracja tablicy
        char tab[] = new char[10];

        // Wypelnienie tablicy losowymi literami
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (char)(Math.random() * ('Z' - 'A') + 'A');
        }

        // Wyswietlenie pierwszej tablicy
        System.out.println("Pierwsza tablica ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        
        // Deklaracja nowej tablicy o takiej samej dlugosci jak pierwsza tablica
        char tmp[] = new char[tab.length];
        
        // Wyswietlenie nowej tablicy
        for (int i = tmp.length - 1; i >= 0; i--) {
            tmp[i] = tab[tab.length - i - 1];
        }

        System.out.println();
        
        // Wyswietlenie lustrzane tablicy
        System.out.println("Lustrzane odbicie ");
        for (int i = 0; i < tmp.length; i++) {
            System.out.print(tmp[i] + " ");
        }

    }

}

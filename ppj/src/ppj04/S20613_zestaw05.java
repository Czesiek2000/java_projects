package ppj04;

public class S20613_zestaw05 {

    public void zadanie01(){
        int[] tab = new int[10];
    }

    public int[] zadanie02(){
        int[] tab = new int[10];
        int random;
        for (int i = 0; i < tab.length; i++) {
            random = (int)(Math.random() * 2);
            tab[i] = random;
        }

        return tab;
    }

    public void zadanie03(int[] tab){
        int random;
        for (int i = 0; i < tab.length; i++) {
            random = (int)(Math.random() * 2);
            tab[i] = random;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        // Liczenie 0 i 1

        System.out.println();
        int i0 = 0;
        int i1 = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                i0 += 1;
            }else {
                i1 += 1;
            }
        }
        System.out.print("0 wystapiło " + i0 + " a jedynek " + i1);
    }

    public void zadanie04(){
        double tab[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("Inicjalizacja 0");

        for (int i = 0; i < tab.length; i++) {
            System.out.print( tab[i] + " " );
        }

        System.out.println();
        System.out.println("random numbers");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Math.random();
            System.out.print( tab[i] + " " );
        }

        System.out.println();
        System.out.println("parzyste indeksy");

        for (int i = 0; i < tab.length; i++) {
            if (i % 2 == 0) {
                System.out.print(tab[i] + " ");
            }
        }

        System.out.println();
        System.out.println("konwertowane na int ");
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

    public void zadanie06(){
        int tab[] = { 789, 678, 567 };

        for (int i = 0; i < tab.length; i++)

            for (int j = i; j < tab.length; j++)

                System.out.println(tab[i] - tab[j]); // 0 111 222 0 111 0
    }

    public void zadanie07(){
        String[] slowa = { "Ala", "kota", "ma", "ma", "a", "kot", "Ale"};
        for (int i = 0; i < slowa.length; i++) {
            System.out.print(slowa[i] + " ");
        }

        System.out.println();
        String[] correct = { slowa[0], slowa[2], slowa[1], slowa[4], slowa[5], slowa[3], slowa[6]};

        for (int i = 0; i < correct.length; i++) {
            System.out.print(correct[i] + " ");
        }
    }

    public void zadanie08(){
        char tab[] = new char[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (char)(Math.random() * ('Z' - 'A') + 'A');

        }

        System.out.println("Pierwsza tablica ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        char tmp[] = new char[tab.length];
        for (int i = tmp.length - 1; i >= 0; i--) {
            tmp[i] = tab[tab.length - i - 1];
        }

        System.out.println();
        System.out.println("Lustrzane odbicie ");
        for (int i = 0; i < tmp.length; i++) {
            System.out.print(tmp[i] + " ");
        }

    }

}

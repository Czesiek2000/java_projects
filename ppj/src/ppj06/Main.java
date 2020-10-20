package ppj06;
public class Main {
    public static void main(String[] args) {
        MethodCurrier m = new MethodCurrier();
        zestaw07 s = new zestaw07();
        
        // Utworzenie tablicy z wymaganymi znakami
        char[] c = {'A', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a'};
        
        // Utworzenie tablicy 6 elementowej
        int tab[] = new int[6];

        // Utworzenie tablicy 5 elementowej
        int tab2[] = new int[5];
        
        // Wypelnienie tablicy 5 elementowej losowymi wartosciami od 1 do 10
        for (int i = 0; i < tab.length; i++) {
            int random = (int)(Math.random() * 10);
            tab[i] = random;
        }

        // Wypelnienie tablicy 6 elementowej losowymi wartosciami od 1 do 10
        for (int i = 0; i < tab2.length; i++) {
            int random = (int)(Math.random() * 10);
            tab2[i] = random;
        }

        // Wyswietlenie tablicy
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");

        }

        System.out.println("\n====");

        // Wyswietlenie drugiej tablicy
        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i] + " ");
        }

        System.out.println("\n====");
        
        // Wywolanie metody z parametrem tablica c
        s.zadanie02(c);
//        s.zadanie03(tab, tab2, 1);
//        s.zadanie04();


    }
}

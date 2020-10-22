package ppj11;
public class Zad2 {
    public static void main(String[] args) {
        int n = 3;
        // Tworzenie tablicy dwu-wymiarowej 3 x 3
        int[][] tab = new int[n][n];
        // Wypelnienie wyzej utworzonej tablicy losowymi wartosciami
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (int) (Math.random() + 6);
            }
        }
        // Stworzenie testowej tablicy
        int[][] tab1 = {
                {0, 0, 1},
                {0, 1, 0},
                {0, 1, 0}
        };

        
        try {
            // Wywolanie funkcji sprawdz z argumentem wczesniej stworzonej tablicy tab1.
            sprawdz(tab1);
        } catch (WrongValueException e) {
            // Wyswietlenie komunikatu na konsoli
            System.out.println(e.getMessage());
        }

    }

    static void sprawdz(int[][] tab) throws WrongValueException {
        boolean czyException = false;
        String wrong = "";
        // Petla przechodzaca po kazdym elemencie tablicy podanej w argmencie
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                // Sprawdzenie warunku z polecenia dla kazdego elementu tablicy
                if (i != j && tab[i][j] != 0) {
                    wrong += "[" + i + ", " + j + "],";
                    czyException = true;
                }
            }
        }
        // Podniesienie wyjatku na konsoli.
        if (czyException) {
            throw new WrongValueException(wrong);
        }
    }
}
# Projekt03

## Treść projektu

Utwórz klasę bazową **Ssak** wraz z polami:
- private String imie;
- private short rokUrodzenia;
- private boolean mlody;

oraz, klasy pochodne **Wadera** i **Wilk** dziedziczące po klasie **Ssak**. 

Klasa **Wadera** będzie deklarowała pola:
- private int iloscSzczeniat;
- private Ssak[] szczenieta;

Klasa **Wilk** deklaruje pola:
- private String nazwaStada;
- private int pozycja; 

Ponadto każda z klas będzie implementowała metody:

- `String przedstawSie()` - wypisująca wszystkie informacje o danym ssaku jakojedną linię tekstu (wartości pól zostaną oddzielone przecinkami, a linia zostaniezakończona średnikiem);
- `void zapisz(FileOutputStream)`- zapisująca informacje przechowywane w obiekcie;

Uwaga: nie definiuj metod **get** i **set** wykorzystaj właściwości polimorfizmu.

Przygotuj przykład z dwoma oddzielnymi stadami wilków, składającymi się z takiej samej ilości samców i samic, wśród których jest przynajmniej **13** młodych. 

Następnie zapisz informacje o osobnikach w stadzie do pliku: "wilki.txt". 

Uruchamiając program należy dokonać sprawdzenia czy plik o nazwie "wilki.txt" istnieje, jeżeli tak należy użyć metody `public static Ssak[] zaladuj(String sciezka)` pozwalającą odczytać i odtworzyć stada. 

Natomiast gdy nie istnieje, program utworzy stada i zapisze ich stan osobniczy do pliku.
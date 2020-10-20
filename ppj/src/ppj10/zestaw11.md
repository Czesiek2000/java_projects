# PPJ11 - dziedziczenie
## Zadanie 01.

Utwórz klasę Owoc z prywatnym polem String nazwa i dziedziczącą po niej klasę Granat z polem iloscPestek. 

Utwórz w obu klasach metodę `String wyswietl()`, która wykorzystując słowo kluczowe `super` zwróci ciąg znaków zawierający wszystkie informacje zawarte w obiekcie tej klasy.

## Zadanie 02.

Utwórz klasę Owoc z prywatnymi polami String nazwa oraz double masa i dziedziczącymi po niej klasami Jablko, Pomarancza i Gruszka. Konstruktory wszystkich klas pochodnych będą ustalały nazwę owocu (zgodną z nazwą klasy) i losowały masę owocu z przedziału 100 − 250 gr.

## Zadanie 03.

Utwórz klasę Drzewo z polami: 
- boolean wiecznieZielone, 
- int wysokosc,
- String przekrojDrzewa. 

Następnie zaimplementuj konstruktory inicjujące pola i metodę `String toString()` zwracającą informacje o drzewie.

Utwórz klasę DrzewoIglaste dziedziczącą po klasie Drzewo, oraz definiująca pola:

- int iloscIgiel 
- double dlugscSzyszki. 

Następnie przygotuj konstruktor inicjujący wszystkie pola oraz metodę `String toString()` zwracającą informacje o drzewie wraz z wartościami pól opisujących drzewo iglaste. 

Utwórz klasę DrzewoLisciaste dziedziczącą po klasie Drzewo, oraz definiująca pole int ksztaltLiscia i metodę `String toString()` zwracającą informacje o drzewie.

Utwórz klasę DrzewoOwocowe dziedziczącą po klasie DrzewoLisciaste, oraz definiująca pole `String nazwaOwoca`, podobnie jak w poprzednich zadaniach uzupełnij klasę o konstruktor i funkcjonalną metodę `String toString()`.

Wykorzystując kod programów z poprzednich ćwiczeń utwórz program, który wypełni tablicę Drzewo[] las drzewami takimi jak:

- sosny,
- modrzewie,
- dęby,
- osiki,
- morelowce
- śliwy. 

Wykorzystując mechanizm polimorfizmu wyświetl wszystkie informacje o wszystkich drzewach.
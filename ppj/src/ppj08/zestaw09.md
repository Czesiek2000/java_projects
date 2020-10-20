# PPJ09 - klasy i obiekty
## Zadanie 01.

Utwórz klasę Kukurydza, której kostruktor przyjmie i zainicjuje pole iloscZiaren. 

Następnie przygotuj metodę zrobPopcorn, która zwróci tablicę obiektów klasy Popcorn w ilości z przedziału od 0 do iloscZiaren.

## Zadanie 02.

Zadeklaruj klasę Dzem zawierającą prywatne pola:

- String smak,
- double waga

Utwórz konstruktory przyjmujące jako parametry zmienne:

- (String smak, double waga),
- (double waga),
- (String smak).

Dostarczone parametry konstruktorów powinny zainicjalizować pola klasy. 

W przypadku gdy konstruktor nie dostarcza niezbędnego parametru należy przyjąć, że pole smak musi przyjąć wartość “No name”, natomiast waga - 100.0. 

Przedstaw wykorzystanie wszystkich konstruktorów tworząc obiekty reprezentujące trzy rodzaje dżemów.

Uwaga: należy założyć, że tylko konstruktor z dwoma parametrami może przypisaćwartości polom klasy.

## Zadanie 03.

Utwórz klasę Wyraz zawierającą pola:
- typu String – inicjowane przez konstruktor, 
- typu Wyraz – inicjowane przez metodę setNastepnyWyraz. 

Ponadto klasa będzie implementowała bezparametrową metodę show, celem której będzie wyświetlenie na ekranie słowa przechowywanego przez obiekt oraz wywołanie metody show na rzecz obiektu przechowywanego w drugim polu (o ile istnieje). Przedstaw użycie klasy Wyraz w programie, wykorzystując w tym celu zdanie “Ala ma kota a kot ma Ale”.
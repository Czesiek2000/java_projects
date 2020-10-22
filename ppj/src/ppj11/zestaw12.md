# PPJ12 - dziedziczenie i wyjatki

Zadanie 01.

Utwórz klasę **Alarm** dziedziczącą po klasie **Exception**. Następnie przygotuj klasę **DetektorDymu** zawierającą metodę `sprawdz`, która może podnieść wyjątek Alarm jeśli wyczuje dym.

Zadanie 02.

Utwórz klasę **Pojazd** z polem `String color` i **dziedziczącą** po niej klasę PojazdKolowy z **prywatnym** polem `iloscOsi`. 

Następnie utwórz **dziedziczącą** po klasie **PojazdKolowy** klasę **CiagnikSiodlowy** z polem `masa`, oraz metodą `rozpocznijJazde`, która sprawdzi jaki jest nacisk pojazdu na oś. 

Jeżeli nacisk przekracza 11 ton podniesiony zostanie wyjątek z komunikatem "Jazda niebezpieczna, odmowa uruchomienia silnika".

Zadanie 03.
Utwórz i wypełnij losowymi wartościami z przedziału 0 − 5 **dwuwymiarową tablicę kwadratową** `tab`. 

Następnie przygotuj **statyczną** metodę, sprawdzającą czy ta tablica ma wartości aij = 0 dla `i ≠ j`, gdzie i, j= 0, 1, ..., n−1. 

Jeżeli nie jest spełniona powyższa zależność podniesiony zostanie wyjątek wskazujący, które elementy tablicy są nieprawidłowe np:
```java
int[][] tab = {
    {0, 0, 1}, 
    {0, 1, 0}, 
    {0, 1, 0} 
    };
    
```
skutkuje wyjątkiem:

Tablica nie spelnia wymagan,bledy na pozycjach[0, 2], [2, 1]
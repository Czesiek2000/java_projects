# PPJ07 - Metody

## Zadanie 01.

Zadeklaruj klasę MethodCurrier implementującą dwie nic nie zwracające metody setValue. 

Pierwsza przyjmie jako parametr zmienną typu prostego int, natomiast druga przyjmie jako parametr zmienną typu float. 

Obie metody wyświetlą na ekranie wartości dostarczonych zmiennych z informacją jakiego typu był parametr.

Następnie należy utworzyć obiekt klasy MethodCurrier i wywołać obie metody dostarczając jako parametry literały typu:  

- int
- float
- char
- byte

Na jakiej podstawie podejmowana jest decyzja którą z metod należy wywołać ?

## Zadanie 02. 

Dana jest tablica zmiennych typu char przechowująca napis Ala ma kota. 

Napisz metodę, która policzy ile razy wystąpiły znaki składające się na ciąg dostarczony jako argument.

## Zadanie 03.

Utwórz i wypełnij losowymi wartościami dwie tablice zmiennych typu int. Następnie utwórz metodę przyjmującą obie tablice i dodatkowo wartość typu int jako argumenty. 
Zadaniem metody będzie:
- dostarczenie tablicy, której wartościami będą sumy elementów na tych samych indeksach, gdy wartość argumentu typu int będzie mniejsza od 0;

Uwaga - elementy które nie maja pary, powinny zostać pominięte
- dostarczenie tablicy zawierającej tylko te elementy, które nie mają "pary" indeksowej, gdy wartość argumentu typu int będzie więsza od 0
- dostarczenie elementu pustego gdy tablice są tej samej długości.

## Zadanie 04.

Utwórz tablicę zmiennych typuinto rozmiarze 25 × 25, a następnie wypełnij ją losowymi wartościami 0 i 1. 

Następnie napisz program, sprawdzający czy w tej tablicy wystąpił taki obszar (o nieparzystym rozmiarze n × n gdzie n ≥ 3) że powyżej przekątnej są same jedynki a poniżej same zera (wartości na przekątnej nie są istotne).

Zadanie zrealizuj wykorzystując rekurencyjną metodę zwracającą wiersz, kolumnę i wielkość największego obszaru spełniającego to założenie.
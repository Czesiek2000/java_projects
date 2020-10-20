# PPJ07 - klasy

## Zadanie 01.

Zadeklaruj klasę MethodCurrier implementującą dwie nic niezwracające metody setValue. 

Pierwsza przyjmie jako parametr zmienną typu prostego int, natomiast druga przyjmie jako parametr zmienną typu float. 

Obie metody wyświetlą na ekranie wartości dostarczonych zmiennych z informacją jakiego typu był parametr.

Następnie należy utwórzyć obiekt klasy MethodCurrier i wywołać obie metody dostarczając jako parametry literały typu:

- int
- float
- char
- byte

Na jakiej podstawie podejmowana jest decyzja którą z metod należy wywołać ? 

## Zadanie 02.
Zdefiniuj klasę Number z polem typu int, oraz metodami setValue (przypisującą polu wartość dostarczoną jako parametr metody) i showValue (wyświetlającą wartość pola).

Następnie rozszerz definicję klasy MethodCurrier z poprzedniego zadania o metodę setValue akceptującą jako parametr klasę Number.

Przedefiniuj wszystkie metody setValue tak aby wykonywały następujące czynności:

- wyświetlały stan zmiennej dostarczonej jako parametr,
- modyfikowały wartość dostarczonej zmiennej,
- wyświetlały stan zmodyfikowanej zmiennej. 

Na koniec przedstaw wywołanie wszystkich metod setValue i odpowiedz co zmieniły wywołane metody ? 

## Zadanie 03.
Utwórz klasę Osoba zawierającą publiczne pola: 
- String imie
- String nazwisko
- int rokUrodzenia

Utwórz obiekt klasy Osoba i przechowaj go w zmiennej osoba. Wykorzystaj możliwość dostępu do publicznych pól tej klasy i przypisz im literały lub wartości opisujące tworzoną osobę.

## Zadanie 04.

Utwórz konstruktor dla klasy Osoba który zainicjuje wszystkie jej pola. Ponadto utwórz metodę show wypisującą na ekran stan wszystkich pól. Działanie obu składowych klasy przedstaw w programie.

## Zadanie 05
Liczby zespolone składają się z części rzeczywistej i urojonej opisanych przez zmienne typu double. Napisz klasę Cplx implementującą:

- prywatne pola obu liczb 
- dwuparametrowy konstruktor
- funkcję dodawania `add(Cplx)`
- funkcję odejmowania `sub(Cplx)`
- funkcję mnożenia `mul(Cplx)`
- funkcję zwiększającą część rzeczywistą o jeden `inc()`
- funkcję `show` wyświetlającą daną liczbę zespoloną w formacie **4 + 5i**. 

Działanie zdefiniowanej klasy przedstaw na przykładach przynajmniej trzech różnych liczb.
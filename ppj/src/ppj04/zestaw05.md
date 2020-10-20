# PPJ05 - operacje na tablicach

## Zadanie 01

Zadeklaruj jednowymiarową tablicę zmiennych typu int o rozmiarze 10 elementów.

## Zadanie 02

Zadeklaruj jednowymiarową tablicę zmiennych typu int o rozmiarze 10 elementów i wypełnij ją losowymi wartościami 0 lub 1.

## Zadanie 03

Napisz program liczący ile 0 i 1 jest w tablicy zdefiniowanej w poprzednim zadaniu. 

## Zadanie 04

Zadeklaruj tablicę zmiennych typu double o rozmiarze 10 elementów zainicjowaną wartościami 0. A następnie: 

- wypełnij tablicę losowymi liczbami.
- wyświetl na ekranie zawartość całej tablicy.
- wyświetl na ekranie tylko liczby o parzystym indeksie.
- wyświetl na ekranie tylko elementy tablicy, których przekonwertowane na int wartości są nieparzyste.

## Zadanie 05

Jaką wartość wypisze poniższa komenda:
```java
int tab[];     

System.out.println(tab);
```

## Zadanie 06

Przeanalizuj poniższy program i wypisz wyświetlane wartości:

```java
int tab[] = { 789, 678, 567};

for (int i = 0; i < tab.length; i++) 

for (int j = i; j < tab.length; j++)             

System.out.println(tab[i] - tab[j]); 
```

## Zadanie 07

Dana jest tablica zdefiniowana jak nastęuje:
```java
String[] slowa = {"Ala", "kota", "ma", "ma", "a", "kot", "Ale"}; 
```

Napisz program, który wypisze na ekranie Ala ma kota a kot ma Ale wykorzystując tablicę slowa.

## Zadanie 08

Dana jest jednowymiarowa tablica zmiennych typu char wypełniona elementami o losowych wartościach z przedziału od 'A' do 'Z'. 

Napisz program tworzący tablicę o rozmiarze identycznym do danej tablicy i wypełnij ją tak, aby stanowiła lustrzane odbicie tablicy pierwotnej. 
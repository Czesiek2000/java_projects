## PPJ02 - operacje bitowe

## Zadanie 01.

Dana jest wartość 165. 

Utwórz program wyświetlający na ekranie tę wartość z wykorzystaniem literału: 

- binarnego (system dwójkowy),
- oktalnego (system ósemkowy),
- heksadecymalnego (system szesnastkowy).

## Zadanie 02.

Przedstaw program, który dokona przesunięcia bitowego wartości 14: 
- o zero pozycji w prawo,
- rezultat poprzedniego punktu o dwie pozycje w lewo,
- rezultat poprzedniego punktu o 4 pozycje w prawo.

Po każdej operacji wyświetl rezultat na ekranie.

## Zadanie 03.

Utwórz program, który zdefiniuje zmienną typu int o dowolnej wartości i nazwie n. 

Następnie napisz program wyświetlający na ekranie:
- wartość reprezentowaną przez ostatnie 5 bitów liczby n;
- 1 lub 0 zależnie od wartości siódmego bitu tej zmiennej;
- wartości poszczególnych bajtów (począwszy od najbardziej znaczącego) z których składa się ta liczba, wynikiem powinny być 4 liczby z przedziału [0 - 255]
- wartość reprezentowaną przez dwa środkowe bajty liczby n reprezentowane jako liczba z przedziału [0, 2^{16} - 1 = 65535].

## Zadanie 04.

Dany jest poniższy program: 

```java
int a1 = 0x6D, a2 = zzz, a = a1 & a2,     

b1 = 0xA, b2 = xxx, b = b1 | b2,     

c1 = 11 << 2, c2 = yyy, c = c1 ^ c2;      

System.out.println(a + " " + b + " " + c);     
```

Zastąp wartości $zzz$, $xxx$ i $yyy$ tak, aby wynik na ekranie pokazywał: 13 15 42
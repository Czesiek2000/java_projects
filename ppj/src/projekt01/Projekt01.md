# Projekt01 - kalkulator bitowy

## Treść projektu

Poniższy fragment kodu pozwoli na wprowadzenie liczby całkowitej z klawiatury: 
```java
Scanner scanner = new Scanner(System.in); 

int val1 = scanner.nextInt();
```

Zaimplementuj program realizujący kalkulator podstawowych operacji matematycznych, w którym wszystkie operacje zostaną zrealizowane przy pomocy operatorów bitowych.

Wprowadź z klawiatury dwie liczby naturalne, a następnie jeden z czterech znaków (+, -, *, /) operacji matematycznych. 

Przeprowadź na dostarczonych wartościach bitowe operacje matematyczne zgodne z przypisanym im znakiem. 

Zatrzymaj program w momencie, kiedy obie wprowadzone liczby będą miały wartości zerowe.

Przykładowe wykonanie operacji: 

```
Podaj pierwsza liczbe: 5 

Podaj druga liczbe: 2 

Podaj operacje: + 

5 - 00...0000 0101 

2 - 00...0000 0010 

7 - 00...0000 0111 

================== itd 
```
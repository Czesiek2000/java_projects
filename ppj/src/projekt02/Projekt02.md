# Projekt02 - koszyk owocow

## Treść projektu

Przygotuj klasę Owoc z polami 
- int kaliber
- double waga.

Następnie utwórz program, który przygotuje (utworzy i wypełni) 20-elementową tablicę obiektów klasy **Owoc** o nazwie **koszyk**.

Tablicę koszyk należy dostarczyć do metody `public Owoc[][][] mySort(Owoc[]dane)`, która:
- posortuje dostarczoną tablicę wykorzystując algorytm sortowania bąbelkowego i zapisze wszystkie stany pośrednie sortowanej tablicy w tablicy wynikowej na pozycji 
```bash
[0][...][...];
```
- posortuje dostarczoną tablicę dane wykorzystując algorytm sortowania przez wybieranie i zapisze wszystkie stany pośrednie sortowanej tablicy w tablicy wynikowejna pozycji 
```
[1][...][...];
```
- posortuje dostarczoną tablicę dane wykorzystując algorytm sortowania przez wstawianie i zapisze wszystkie stany pośrednie sortowanej tablicy w tablicy wynikowejna pozycji 
```
[2][...][...];
```
- zwróci tablicę powstałą w wyniku trzech powyższych operacji.

Sortując owoce przyjmij że podstawowym kryterium będzie **kaliber**, a kryterium wtórnym będzie **waga**.

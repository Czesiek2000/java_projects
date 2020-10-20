package ppj08;

public class zestaw09 {
    public static void main(String[] args) {
        // Inicjacja klasy Kukurudza
        Kukurydza k = new Kukurydza(0);
        
        // Wyswietlenie tablicy
        System.out.println(k.zrobPopcorn());

        // Inicjacja klasy Dzem
        Dzem d1 = new Dzem();
        
        // Wyswietlenie wartosci pol
        d1.showValue();

        Dzem d2 = new Dzem("Malinowy", 10.0);
        d2.showValue();

        Dzem d3 = new Dzem("Truskawkowy");

        Dzem d4 = new Dzem(20.0);

        // Inicjacja klasy Wyraz
        Wyraz wyraz = new Wyraz("Ala ma kota a kot ma ale");
        Wyraz wyraz1 = new Wyraz("Ala ma kota");
        
        // Wyswietlenie wyrazu zapisanego w polu klasy
        wyraz.show();
        
        // Dodanie wyrazu do pola w klasie
        wyraz.setNastepnyWyraz(wyraz1);
        
        // Wyswietlenie po dodaniu do pola wyrazu z parametru
        wyraz.show();
    }
}

package ppj08;

public class s20613_zestaw09 {
    public static void main(String[] args) {
        Kukurydza k = new Kukurydza(0);
        System.out.println(k.zrobPopcorn());

        Dzem d1 = new Dzem();
        d1.showValue();

        Dzem d2 = new Dzem("Malinowy", 10.0);
        d2.showValue();

        Dzem d3 = new Dzem("Truskawkowy");

        Dzem d4 = new Dzem(20.0);

        Wyraz wyraz = new Wyraz("Ala ma kota a kot ma ale");
        Wyraz wyraz1 = new Wyraz("Ala ma kota");
        wyraz.show();
        wyraz.setNastepnyWyraz(wyraz1);
        wyraz.wyraz.show();
    }
}

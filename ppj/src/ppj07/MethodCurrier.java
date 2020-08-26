package ppj07;

public class MethodCurrier {

    // Decyzja podejmowana jest na podstawie konwersji zmiennych dokonywanej przez kompilator
//    public void setValue(int value) {
//        System.out.println("int: " + value);
//    }
//
//    public void setValue(float value) {
//        System.out.println("float: " + value);
//    }
    public void setValue(int value) {
        System.out.println("dostarczone: " + value);
        value++;
        System.out.println("value zmienione " + value);
    }

    public void setValue(float value) {
        System.out.println("dostarczone: " + value);
        value += 2;
        System.out.println("value zmienione " + value);
    }

    public void setValue(Number n) {
        System.out.print("dostarczono wartosc ");
        n.showValue();
        int nPole = n.pole += 3;
        System.out.println("zmieniona wartosc " + nPole);
    }
}

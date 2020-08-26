package ppj06;

public class MethodCurrier {
    // Dzieje sie tak na podstawie konwersji zmiennych przez kompilator
    public void setValue(int param) {
        System.out.println("Int: " + param);
    }

    public void setValue(float param) {
        System.out.println("Float: " + param);
    }


}

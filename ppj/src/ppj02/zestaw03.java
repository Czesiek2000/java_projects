package ppj02;
public class zestaw03 {
    public void cwiczenie_01(){
        boolean bo = true;
        boolean bo1 = false;
        byte mnb = -128, mnbB = -0b10000000, mnbO = -0200, mnbH = -80;
        byte mxb = 127, mxbB = -0b1111111, mxbO = 0177, mxbH = 0x7F;
        short mxsh = 32767, mxshO = 077777, mxshH = 0x7FFF;
        short mnsh = -32768, mnshO = -0100000, mnshH = -0x8000;
        int mxi = 2147483647, mxiH = 0x7FFFFFF;
        int mni = -2147483648, mniH = -0x80000000;
        long mxl = 9223372036854775807L;
        long mnl = -9223372036854775808L;
        float mxf = 3.4028235E38f;
        float mnf = 1.401298464324817E-45f;
        double mxd = 4.9E-324d;
        double mnd = 4.9E-324;
        char mxc = 65535;
        char mnc = 	0;
    }

    public void cwiczenie_02() {
        boolean boolVal = true;
        byte byteVal = 10;
        short shortVal = 100;
        int intVal = 1000;
        long longVal = 100000;

        float floatVal = 3.14f;
        double doubleVal = 6.63d;
        char charVal = 'a';

        // Porownania
        // boolean mozna tylko z boolean porownywac
//        System.out.println(boolVal == byteVal);
//        System.out.println(boolVal == shortVal);
//        System.out.println(boolVal == intVal);
//        System.out.println(boolVal == longVal);
//        System.out.println(boolVal == floatVal);
//        System.out.println(boolVal == doubleVal);
//        System.out.println(boolVal == charVal);

        System.out.println(byteVal == shortVal);
        System.out.println(byteVal == intVal);
        System.out.println(byteVal == longVal);
        System.out.println(byteVal == floatVal);
        System.out.println(byteVal == doubleVal);
        System.out.println(byteVal == charVal);

        System.out.println(shortVal == intVal);
        System.out.println(shortVal == longVal);
        System.out.println(shortVal == floatVal);
        System.out.println(shortVal == longVal);
        System.out.println(shortVal == doubleVal);
        System.out.println(shortVal == charVal);

        System.out.println(intVal == longVal);
        System.out.println(intVal == floatVal);
        System.out.println(intVal == doubleVal);
        System.out.println(intVal == charVal);

        System.out.println(longVal == floatVal);
        System.out.println(longVal == doubleVal);
        System.out.println(longVal == charVal);

        System.out.println(floatVal == doubleVal);
        System.out.println(floatVal == charVal);

        System.out.println(doubleVal == charVal);

    }

    public void cwiczenie_03() {
        int a112;
//        int 0aa;
//        int @abc;
//        int static;
//        int null;
    }

    public void cwiczenie_04() {
        int a;
        a = 10;
        System.out.println(a);
    }

    public void cwiczenie_05() {
        char charValue = 'a';
        char charvalue = 'b';
        System.out.println(charValue);
        System.out.println(charvalue);
        /*
            * program skompiluje sie poniewaz w javie sa to dwie rozne zmienne.
            * Java jest wrazliwa na wielkość liter
            *
        */
    }

    public void cwiczenie_06() {
        int a = 0;
        double b = 10;
//        a = b;
        b = a;
    /*
        * a = b potrzebne jest zmiejszenie wartosci double do int
        * b = a java automatycznie rozszerzyła int zeby zmiescił się w double
    */
    }

    public void cwiczenie_07() {
        int i = 10;
        char c = 'a';
        float f = 3.14f;
        double d = 6.63d;
        byte b = 2;

        System.out.println(c + i); // char zostanie przekonwerowany do inta i dodany, wartosc wyswietlona bedzie w int'cie
        System.out.println(i + c); // dodawanie jest przemienne, taki sam wynik jak w operacji powyzej
        System.out.println(f + d); // dodawanie dwoch liczb naturalnych
        System.out.println(b + i); // byte zostanie przekonwerotwany do inta i dwie wartosci int zostana dodane
    }
}

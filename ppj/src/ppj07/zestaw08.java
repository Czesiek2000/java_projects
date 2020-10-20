package ppj07;

public class zestaw08 {
    public static void main(String[] args) {
        MethodCurrier m = new MethodCurrier();
        byte b = 10;
        m.setValue(10);
        m.setValue(3.14f);
        m.setValue('a');
        m.setValue(b);

        Number n = new Number();
        m.setValue(n);

//        Osoba osoba = new Osoba();
//        System.out.println("po stworzeniu osoba ");
//        osoba.show();
//        osoba.imie = "Marian";
//        osoba.nazwisko = "Kowalski";
//        osoba.rokUrodzenia = 2000;
//        System.out.println("zainicjowanie pol osoby ");
//        osoba.show();
//
//        Osoba osoba1 = new Osoba("Marcin" , "Nowak", 2001);
//        System.out.println("konstruktor w osoba1 ");
//        osoba1.show();
//
//        Cplx c = new Cplx(4, 5);
//        Cplx c2 = new Cplx(8, 10);
//        Cplx c2 = new Cplx(6, 12);
//        c.show();
//        c2.show();
//        c.add(c2);
//        c.mul(c2);
//        c.inc();
//        c2.show();
//        c.show();
    }
}

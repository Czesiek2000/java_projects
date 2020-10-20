package ppj07;

public class Number {
    // Deklaracja pola
    int pole;

    // metoda inicjujaca wartosc pole 
    public void setValue(int value) {
        this.pole = value;
    }

    // Metoda wyswietlajaca wartosc zapisana w polu pole
    public void showValue(){
        System.out.println(this.pole);
    }
}

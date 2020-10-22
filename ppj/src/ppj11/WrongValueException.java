package ppj11;

// Klasa dziedzicza po klasie exception
public class WrongValueException extends Exception {
    // Wywolanie konstruktora z klasy Exception i zmiana wyswietlanego komunikatu przy bledzie 
    public WrongValueException(String elements) {
        super("Tablica nie spelnia wymagan , bledy na pozycjach " + elements);
    }
}

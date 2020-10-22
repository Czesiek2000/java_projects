package projekt01;
import java.util.Scanner;

public class Projekt01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        int b = 1;
        char val3;
        int result = 0;


        while (a != 0 || b != 0) {
            System.out.print("\npodaj val1 ");
            a = scanner.nextInt();
            changeToBinary(a);
            System.out.print("\npodaj val2 ");
            b = scanner.nextInt();
            changeToBinary(b);
            System.out.print("\npodaj operacje: ");
            val3 = scanner.next().charAt(0);

            if (val3 == '+') {
                while ( b != 0 ) {
                    int c = a & b;
                    a = a ^ b;
                    b = c << 1;
                    result = a;
                }
            }else if (val3 == '-') {
                while (b != 0) {
                    int sub = (~a) & b;
                    a = a ^ b;
                    b = sub << 1;
                    result = a;
                }
            } else if (val3 == '/') {
                if (b == 0) {
                    System.out.print("Dzielenie przez 0 !\n");
                }else {
                    int licznik = 0;
                    while(a >= b) {
                        a = a - b;
                        licznik += 1;
                    }
                        result = a;
                }
            } else if (val3 == '*') {
                int mult = 0, licznik = 0;
                while (b > 0) {

                    if ((b % 2) == 1)
                        mult += (a << licznik);

                    licznik++;
                    b /= 2;
                    result = mult;
                }
            } else {
                System.out.println("Nieprawidłowy wprowadzony znak " + val3);
            }

            System.out.println("Wynik: " + result);
            changeToBinary(result);
            }
            scanner.close();

    }

     static void changeToBinary(int n) {
        if (n > 1)
            changeToBinary(n / 2);

        System.out.print(n % 2 + " ");
    }
}

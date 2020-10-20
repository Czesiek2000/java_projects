package ppj01;
public class zestaw02 {
    public void cwiczenie_01() {
        int bin = 0b10100101;
        int bin2 = 0245;
        int bin3 = 0xA5;
    }

    public void cwiczenie_02() {
        int wrt = 14;
        int wrt2 = wrt >> 0;
        System.out.println(wrt2);
        int wrt3 = wrt2 << 2;
        System.out.println(wrt3);
        int wrt4 = wrt3 >> 4;
        System.out.println(wrt4);
    }

    public static void cwiczenie_03() {
        int n = 0b01110011;
        int mask = 0b00011111;
        System.out.println(n & mask);

        System.out.println((n>>6) & 0b1);

        System.out.println((byte)n & 1);
        System.out.println((byte)n & (1 << 4));
        System.out.println((byte)n & (1 << 8));

        System.out.println(n & 0b00011000);
    }

    public void cwiczenie_04() {
        int a1 = 0x6D, a2 = 0b0001101, a = a1 & a2;
        int b1 = 0xA, b2 = 0b1111, b = b1 | b2;
        int c1 = 11 << 2, c2 = 0b000110, c = c1 ^ c2;
        System.out.println(a + " " + b + " " + c);
    }

}

package kolokwium;

public class Main2 {
    public static boolean czy(int k) {
        int a = 'a' + 'z';
        while (k > 0) {
            a++;
            k = k >> 2;
            System.out.println("1 " + (int) '1');
        }
        a -= 218;
        if (a > 0 && a % 3 == 0)
            return true;
        else
            return false;
    }

    public static boolean czymozna(int x, int y) {
        if (!(x * y % 2 == 0)) return false;
        else
            return true;
    }

    public static int[][] newtab(int x, int y) {
        int tab[][] = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (czymozna(i, j))
                    tab[i][j] = x / (i + 1);
                else
                    tab[i][j] = x / (j + 2);
            }
        }
        return tab;
    }


    public static int f(int a, int b) {
        int x = a > b ? a : b;
        int n = 0;
        for (int i = 1; i <= x; i++)
            if (b % i == 0 && a % i == 0)
                if (i > n) n = i;
        return n;
    }

    public static void rek(int a, int b) {
        if (a / b == 0) System.out.println("END");
        else {
            System.out.println(f(a, b));
            rek(--a, b++);
        }
    }

    public static void main(String[] args) {
//        for (int i=0; i<=22; i+=11){
//            if (czy(i)) System.out.println((int)(Math.pow(i,2)));
//            else
//                System.out.println(i);
//        }
//        for (int i=0; i<2 ;i++){
//            for (int j=0;j<3;j++){
//                System.out.print(newtab(2,3)[i][j]);
//            }
//            System.out.println();
//        }
//        rek(20,16);

        byte wrt = 5;
        int maska = 128;
        for (int x = 0; x <= 7; x++) {
            System.out.print(wrt & (maska >>> x));
        }

        char tab[]={1 , 2 , 4 ,5};
        int tab2[]={1,2,3,4};
        int tab3[]={2,4,7,1};
        int tab4[]={1,2,3,4,5,6};
        System.out.println();
        metoda(tab);
        System.out.println("\n");
        metoda2(tab2, 3);
        System.out.println();
        metoda3(tab3);
        System.out.println();
        metoda4(tab4);

        method();
    }

    public static void metoda(char arr[]) {
        int x = 0;
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = (int) arr[i];
            System.out.print(arr1[i]);
        }
    }

    public static void metoda2(int arr[] , int a) {
        int arr2[] = new int[arr.length + a];
        for (int i = 0; i < arr.length; i++)
            arr2[i] = arr[i];
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i]);
    }
    public static void metoda3(int arr3[]){
        int arr[];
        arr = arr3;
        for(int i = 0; i < arr.length ; i++){
            for(int j=0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i < arr3.length; i++)
            System.out.print(arr3[i]);
    }

    public static void metoda4(int arr4[]){
        int x = 0;
        for(int i = 0; i < arr4.length ; i++){
            if(arr4.length % 2 == 0)
                x = (arr4[arr4.length / 2]+arr4[arr4.length/2 - 1])/2;
            else
                x = 1;
        }
        System.out.println(x);
    }

    public static void metod() {
        for (;;){
            System.out.println("witaj w programie");
        }
    }

    public static void method() {
        char tab [][] = {{'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'J'}};
        for (int i = 0; i < tab.length ; i++) {
            for (int j = 2; j < tab[i].length; j++) {
                System.out.print(tab[i][j]+ "; ");
            }
            System.out.println();
        }

        int x = 4;
        System.out.println(x << 1);
        System.out.println(x);
        x*=2;
        System.out.println(x);
        System.out.println(false & true);
        char c = 'c';
        switch (c) {
            case 99:
                break;

            default:
                System.out.println((int)c);
        }


        for (int i = 0, shift = 4; i < 4 ; i++) {
//            System.out.println(i + " " + shift);
//            System.out.print(shift << 1);
//            System.out.print(" ");
//            shift *= 2;

        }


    }

}

package projekt02;
public class Projekt02 {
    public static void main(String[] args) {
        Owoc[] koszyk = new Owoc[20];
        for (int i = 0; i < koszyk.length; i++) {
            koszyk[i] = new Owoc((int)(Math.random() * 10), Math.random() * 10);
        }

        Owoc o = new Owoc((int)(Math.random() * 10), Math.random() * 10);

        o.show(o.mySort(koszyk));
    }
}

class Owoc {
    private int kaliber;
    private double waga;

    public Owoc(int kaliber, double waga) {
        this.kaliber = kaliber;
        this.waga = waga;
    }

    public Owoc[][][] mySort(Owoc[] dane) {
        Owoc[][][] result = new Owoc[3][dane.length * dane.length+ 1][dane.length];
        Owoc[][] temp = new Owoc[dane.length * dane.length + 1][dane.length];

        for (int iter = 0; iter < temp.length - 1; iter++) {
            int n = dane.length;

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (dane[j].getKaliber() == dane[j + 1].getKaliber()) {
                        if (dane[j].getWaga() > dane[j + 1].getWaga()) {
                            Owoc temp1 = dane[j];
                            dane[j] = dane[j + 1];
                            dane[j + 1] = temp1;

                            temp[iter][i] = dane[j];
                        }
                    }else {
                        if (dane[j].getKaliber() > dane[j + 1].getKaliber()) {
                            Owoc temp1 = dane[j];
                            dane[j] = dane[j + 1];
                            dane[j + 1] = temp1;

                            temp[iter][i] = dane[j];
                        }
                    }
                }
            }
        }

        result[0] = temp;

        Owoc[][] temp1 = new Owoc[dane.length * dane.length + 1][dane.length];
        for (int iter = 0; iter < temp1.length - 1; iter++) {
            for (int i = 0; i < dane.length - 1; i++) {
                int min_index = i;
                if (dane[i].getKaliber() == dane[i + 1].getKaliber()) {
                    for (int j = i + 1; j < dane.length; j++) {
                        if (dane[j].getWaga() < dane[min_index].getWaga()) {
                            min_index = j;
                        }
                    }
                    Owoc tmp = dane[min_index];
                    dane[min_index] = dane[i];
                    dane[i] = tmp;
                    temp1[iter][i] = dane[i];
                }else {
                    for (int j = i + 1; j < dane.length; j++) {
                        if (dane[j].getKaliber() < dane[min_index].getKaliber()) {
                            min_index = j;
                        }
                    }
                    Owoc tmp = dane[min_index];
                    dane[min_index] = dane[i];
                    dane[i] = tmp;
                    temp1[iter][i] = dane[i];
                }
            }
        }

        result[1] = temp1;
        
        Owoc[][] temp2 = new Owoc[dane.length * dane.length + 1][dane.length];
        for (int iter = 0; iter < temp2.length - 1; iter++) {
            for (int j = 1; j < dane.length; j++) {
                if (dane[j - 1].getKaliber() == dane[j].getKaliber()) {
                    double keyW = dane[j].getWaga();
                    int i = j - 1;
                    while ((i > -1) && (dane[i].getWaga() > keyW)) {
                        dane[i + 1] = dane[i];
                        i--;
                    }
                    dane[i + 1].waga = keyW;
                    temp2[iter][i + 1] = dane[i + 1];
                } else {
                    int key = dane[j].getKaliber();
                    int i = j - 1;
                    while ((i > -1) && (dane[i].getKaliber() > key)) {
                        dane[i + 1] = dane[i];
                        i--;
                    }
                    dane[i + 1].kaliber = key;
                    temp2[iter][i + 1] = dane[i + 1];
                }
            }
        }

        result[2] = temp2;
        return result;
    }


    public int getKaliber() {
        return kaliber;
    }

    public double getWaga() {
        return waga;
    }

    public void show(Owoc[][][] dane) {
        System.out.println("Nowe sortowanie");
        for (int i = 0; i < dane.length; i++) {
            for (int j = 0; j < dane[i].length; j++) {
                for (int k = 0; k < dane[i][j].length; k++) {
                    System.out.println(dane[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

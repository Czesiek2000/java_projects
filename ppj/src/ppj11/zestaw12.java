package ppj11;

public class zestaw12 {
    public static void main(String[] args) {
        DetektorDymu dm = new DetektorDymu(false);
        DetektorDymu dm1 = new DetektorDymu(true);
        try {
            dm.sprawdz();
            dm1.sprawdz();
        }catch (Alarm a) {
            System.out.println(a.getMessage());
        }

        Pojazd p = new Pojazd("Red");
        PojazdKolowy pk = new PojazdKolowy("Green", 2);
        CiagnikSiodlowy cs = new CiagnikSiodlowy("Blue", 2, 10);
        CiagnikSiodlowy cs1 = new CiagnikSiodlowy("Black", 2, 11);

        try {
            cs.rozpocznijJazde();
            cs1.rozpocznijJazde();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int tab[][] = new int[3][3];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = (int)(Math.random() * 5);
            }
        }

        try {
            sprawdz(tab);
        }catch (TabException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void sprawdz(int[][] tab) throws TabException {
        String output = "Tablica nie spełnia wymagan, bledy na pozycjach: ";
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] != 0) {
                    if (i != j){
                        String text = "";
                        text += "[" + i + ", " + j + "], ";
                        output += text;
                    }
                }
            }
        }

        if (!output.equals("Tablica nie spełnia wymagan, bledy na poscigach: ")) {
            throw new TabException(output);
        }else {
            System.out.println(output);
        }

    }
}

class Alarm extends Exception {

    public Alarm(String message) {
        super(message);
    }
}

class DetektorDymu {
    private boolean czyDym;

    public DetektorDymu(boolean czyDym) {
        this.czyDym = czyDym;
    }

    public void sprawdz() throws Alarm{
        if (czyDym == true) {
            throw new Alarm("Wykryto dym, Alarm!");
        }else {
            System.out.println("Brak dymu");
        }
    }
}

class TabException extends Exception{
    public TabException(String message) {
        super(message);
    }
}

class Pojazd {
    String color;

    public Pojazd(String color) {
        this.color = color;
    }
}

class PojazdKolowy extends Pojazd{
    private int iloscOsi;

    public PojazdKolowy(String color, int iloscOsi) {
        super(color);
        this.iloscOsi = iloscOsi;
    }
}

class CiagnikSiodlowy extends PojazdKolowy {
    double masa;

    public CiagnikSiodlowy(String color, int iloscOsi, double masa) {
        super(color, iloscOsi);
        this.masa = masa;
    }

    public void rozpocznijJazde() throws Exception{
        if (masa >= 11) {
            throw new Exception("Jazda niebezpieczna, odmowa uruchomienia silnika");
        }else {
            System.out.println("Mozna jechac");
        }

    }
}

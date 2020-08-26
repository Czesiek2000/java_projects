
import java.io.*;

public class s20613_p03 {
    public static void main(String[] args) {
        Ssak s = new Ssak("ssak", (short)1996, true);
        Ssak[] szczenieta = {
                new Ssak("szczenie1", (short)2000, false),
                new Ssak("szczenie2", (short)2001, true),
                new Ssak("szczenie3", (short)2002, false)
        };
        Wadera w = new Wadera("wadera", (short)1999, true, 3, szczenieta);
        Wilk wilk = new Wilk("Wilk", (short)1998, false, "Wilcze stado", 1);
        Wilk wilk2 = new Wilk("Wilk2", (short)1997, true, "Stado 2", 2);

        try {
            File file = new File("wilki.txt");
            FileOutputStream fos = new FileOutputStream(file);

            s.zapisz(fos);
            w.zapisz(fos);
            wilk.zapisz(fos);

        }catch (IOException e) {
            e.printStackTrace();
        }

        zaladuj("./wilki.txt");
        Ssak[] s1 =  zaladuj("./wilki.txt");
        int length = s1.length;
        for (int i = 0; i < length; i++) {
            if (s1[i] != null) {
                System.out.println(s1[i].przedstawSie());
            }
        }
    }

    public static Ssak[] zaladuj(String sciezka){
        File f = new File(sciezka);
        Ssak[] ssaki = new Ssak[10];
        int index = 0;
        try {
            if (!f.exists()) {
                Ssak s1 = new Ssak("test", (short)1999, false);
                Wilk w1 = new Wilk("test", (short)1998, false, "testowe stado", 1);
                Wadera w = new Wadera("test", (short)1997, true, 2, new Ssak[3]);
                File file = new File("stado.txt");
                FileOutputStream fos = new FileOutputStream("stado.txt");
                String s = "";
                s += s1.przedstawSie() + "\n" + w1.przedstawSie() + "\n" + w.przedstawSie();
                byte[] b = s.getBytes();
                fos.write(b);
                fos.close();
            } else {
                BufferedReader reader = new BufferedReader(new FileReader(sciezka));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split(", ");

                    if (data.length == 3) {
                        for (int i = 0; i < data.length; i++) {
                            if (data[i].equals(";")) {
                                data[i] = data[i].replace(";", "");
                            }
                        }
                        if (index > ssaki.length - 1) {
                            Ssak[] tmp = new Ssak[ssaki.length * 2];
                            for (int i = 0; i < ssaki.length; i++) {
                                tmp[i] = ssaki[i];
                            }

                            ssaki = null;
                            ssaki = tmp;
                        }
                        ssaki[index] = new Ssak(data[0], Short.parseShort(data[1]), Boolean.parseBoolean(data[2]));
                    }
                    index++;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        return ssaki;
    }
}

class Ssak {
    private String imie;
    private short rokUrodzenia;
    private boolean mlody;

    public Ssak(String imie, short rokUrodzenia, boolean mlody) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
        this.mlody = mlody;
    }

    String przedstawSie() {
        return imie +", "+ rokUrodzenia + ", " + mlody + ";";
    }

    void zapisz(FileOutputStream f) {
        try {
            String s = this.przedstawSie() + "\n";
            byte b[] = s.getBytes();
            f.write(b);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Wadera extends Ssak {
    private int iloscSzczeniat;
    private Ssak[] szczenieta;

    public Wadera(String imie, short rokUrodzenia, boolean mlody, int iloscSzczeniat, Ssak[] szczenieta) {
        super(imie, rokUrodzenia, mlody);
        this.iloscSzczeniat = iloscSzczeniat;
        this.szczenieta = szczenieta;
    }

    public String przedstawSie() {
        String szczenietaValue = "";
        for (int i = 0; i < this.szczenieta.length; i++) {
            szczenietaValue += this.szczenieta[i].przedstawSie();
        }
        return super.przedstawSie() + iloscSzczeniat + ", " + szczenietaValue + "; ";
    }

    void zapisz(FileOutputStream f) {
        try {
            String szczenietaValue = "";
            for (int i = 0; i < this.szczenieta.length; i++) {
                szczenietaValue += this.szczenieta[i].przedstawSie() + "\n";
            }
            String s = super.przedstawSie() + this.iloscSzczeniat + "\n" + szczenietaValue;
            byte b[] = s.getBytes();
            f.write(b);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Wilk extends Ssak {
    private String nazwaStada;
    private int pozycja;

    public Wilk(String imie, short rokUrodzenia, boolean mlody, String nazwaStada, int pozycja) {
        super(imie, rokUrodzenia, mlody);
        this.nazwaStada = nazwaStada;
        this.pozycja = pozycja;
    }

    public String przedstawSie() {
        return super.przedstawSie() + nazwaStada + ", " + pozycja + "; ";
    }

    void zapisz(FileOutputStream f) {
        try {
            String s = super.przedstawSie() + " " + this.nazwaStada + ", " + this.pozycja;
            byte b[] = s.getBytes();
            f.write(b);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
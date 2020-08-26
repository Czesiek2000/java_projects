package ppj08;

public class Dzem {
    private String smak;
    private double waga;

    public Dzem() {
        this.smak = "No name";
        this.waga = 100.0;
    }

    public Dzem(String smak, double waga) {
        this.smak = smak;
        this.waga = waga;
    }

    public Dzem(double waga) {
        System.out.println("Waga " + waga);
        this.smak = "No name";
    }

    public Dzem(String smak) {
        System.out.println("Smak " + smak);
        this.waga = 100.0;
    }

    public void showValue() {
        System.out.println("Smak " + this.smak + " waga " + this.waga);
    }
}

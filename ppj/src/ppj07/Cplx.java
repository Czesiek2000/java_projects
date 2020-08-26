package ppj07;

public class Cplx {
    private double rz;
    private double imz;

    public Cplx(double rz, double imz) {
        this.rz = rz;
        this.imz = imz;
    }

    public void add(Cplx c) {
        rz = rz + c.rz;
        imz = imz + c.imz;
    }

    public void sub(Cplx c) {
        rz = rz - c.rz;
        imz = imz - c.imz;
    }

    public void mul(Cplx c) {
        this.rz = this.rz * c.rz - this.imz * c.imz;
        this.imz = this.rz * c.imz + this.imz * c.rz;
    }

    public void inc() {
        rz++;
    }

    public void show() {
        System.out.println((int)rz +" + "+ (int)imz+"i");
    }
}

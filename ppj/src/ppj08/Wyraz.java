package ppj08;

public class Wyraz {

    String name;
    Wyraz wyraz;

    public Wyraz(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name " + this.name);
    }

    public void setNastepnyWyraz(Wyraz wyraz) {
        this.wyraz = wyraz;
    }

}

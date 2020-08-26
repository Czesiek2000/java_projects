package ppj06;

public class S20613_zestaw07 {
    char[] c = {'A', 'l', 'a', ' ', 'm', 'a', ' ', 'k', 'o', 't', 'a'};

    public void zadanie02(char[] c) {
        int licznik = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                licznik++;
                System.out.println("spacja " + licznik);
            }else {
                System.out.print(c[i] + " ");
            }
        }
    }

    public void zadanie03(int tab[], int tab2[], int arg) {
        if (arg < 0) {
            // dostarczenie tablicy z wartosciami sumy tab i tab2 na tych samych miejscach
        }else if (arg > 0) {
            // dostarczenie tablicy tylko te elementy ktore nie maja pary indeksowej
        }else {
            // dostarczenie pustego elementu
        }
    }

    public void zadanie04() {

    }
}

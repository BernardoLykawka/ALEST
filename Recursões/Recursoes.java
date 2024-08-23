package Recursões;
public class Recursoes {
    private int soma;
    private int exp = 1;
    private int o = 0;

    public Recursoes() {
        this.soma = 0;
    }

    // 1
    public int somarFor(int a[]) {
        for (int i = 0; i < a.length; i++) {
            soma += a[i];
        }
        return soma;
    }

    public int somarRec(int a[], int index) {
        if (index == 0) {
            return soma + 1;
        } else {
            soma += a[index];
            return somarRec(a, index - 1);
        }
    }

    // 2
    public int expFor(int x, int y) {
        for (int i = 0; i < y; i++) {
            exp *= x;
        }
        return exp;
    }

    public int expRec(int x, int y) {
        if (y == 0) {
            return exp;
        } else {
            x *= x;
            return expRec(x, y - 1);
        }
    }

    // 3
    public void inverteFor(int[] a, int[] inverso) {  //ta void

        int inversor = a.length - 1;
        System.out.println("Inverte com for: ");

        for (int i = 0; i < a.length; i++) {
            inverso[inversor] = a[i];
            System.out.print(a[i] + " ");
            inversor--;
        }

        System.out.println("\nInverso:");

        for (int i = 0; i < a.length; i++) {
            System.out.print(inverso[i] + " ");

        }
    }

    public int[] inverteRec(int[] a, int index, int[] inverso) {  //n ta printando
        if (index == 0) {
            return a;
        } else {
            inverso[index] = a[o];
            o++;
            return inverteRec(a, index - 1, inverso);
        }
    }
}

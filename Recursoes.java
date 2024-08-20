public class Recursoes {
    private int soma;
    private int index;
    private int[] a;

    public Recursoes() {
        this.soma = 0;
    }

    public int somarFor(int a[]) {
        int soma = 0;
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

    public int expFor(int x, int y) {
        int exp = 1;

        for (int i = 0; i < y; i++) {
            exp *= x;
        }
        return exp;
    }

    public int expRec(){

       
        
    }
}

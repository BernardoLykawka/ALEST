public class Recursoes {
    private int soma;
    private int exp=1;

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
        for (int i = 0; i < y; i++) {
            exp *= x;
        }
        return exp;
    }

    public int expRec(int x, int y){
        if(y==0){
            return exp;
        } else{
            x*=x;
            return expRec(x, y-1);
        }
    }
}

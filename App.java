import java.net.Socket;

public class App {
    public static void main(String[] args){
        Recursoes r = new Recursoes();
        
        int[] a = { 1, 3, 10, 15, 5 };
        int index=a.length-1;
        System.out.println("Soma de elementos do array: ");
        System.out.println("Somar com for: "+r.somarFor(a));
        System.out.println("Somar com recursao:"+r.somarRec(a,index));
        System.out.println("-----------------------------\n");

        int x=2, y=5;
        System.out.println("Calcula exponencial");
        System.out.println("Calcula com for: "+r.expFor(x, y));
        System.out.println("Calcula com recursão: "+r.expRec());

    }



}

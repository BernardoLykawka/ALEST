public class App {
    public static void main(String[] args){
        Recursoes r = new Recursoes();
        
        int[] a = { 1, 3, 10, 15, 5 };
        int index=a.length-1;
        System.out.println("Soma de elementos do array: ");
        System.out.println("somar com for: "+r.somarFor(a));
        System.out.println("somar com recursao:"+r.somarRec(a,index));
        System.out.println("---------------------------");

    }



}

public class App {
    public static void main(String[] args) {
        /*
         * Remova os comentarios abaixo para chamar metodos que testam
         * as inplementacoes.
         * Os testes não são exaustivos e podem existir erros que os
         * testes não pegam!
         */
        ListArray lista = new ListArray();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(9);
        lista.add(2,2);
        System.out.println("Primeira lista: "+lista);

        lista.reverse();
        System.out.println("\nReverte Lista: "+lista);

        lista.bubbleSort();
        System.out.println("\nBubble Sort: "+lista);

        System.out.println("\nBinary Search está no index: "+lista.binarySearch(6));

        System.out.println("Conta quantas vezes o elemento 2 aparece: "+lista.countOcurrences(2));

        System.out.println("Tamanho da lista: " + lista.size());

        System.out.println("Elemento armazenado na primeira posicao da lista: " +lista.get(0));
        
        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Tentando remover elemento 9: " + lista.remove(9));
        System.out.println(lista);
        System.out.println("Tamanho da lista: " + lista.size());

        lista.add(16);
        System.out.println("Verificando inserção após ter removido elemento: " + lista);
        
        System.out.println("Adicionando o elemento 5 no indice 2, elemento anterior era: " + lista.set(2, 5));
        System.out.println(lista);
        
        System.out.println("Lista contem elemento 0? " + lista.contains(0));

        System.out.println("Tamanho da lista: " + lista.size());
        lista.clear();
        System.out.println("Limpando a lista... ");
        System.out.println("Lista agora deve estar vazia. Tamanho da lista: " + lista.size());
    }
}

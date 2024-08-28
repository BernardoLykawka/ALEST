/**
 * Classe que implementa uma lista linear usando arranjo.
 * 
 * @author Isabel H. Manssour, Luan Garcia
 */

public class ListArray {

    // Atributos
    private static final int TAM_DEFAULT = 10;
    private Integer[] data;
    private int count;
    private int tam;

    /**
     * Construtor da lista.
     */
    public ListArray() {
        this(TAM_DEFAULT);
    }

    /**
     * Construtor da lista.
     * 
     * @param tam tamanho inicial a ser alocado para data[]
     */
    public ListArray(int tam) {
        if (tam <= 0) {
            tam = TAM_DEFAULT;
        }
        data = new Integer[tam];
        count = 0;
        this.tam = tam;
    }

    /*
     * Método para imprimir a lista como uma string.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for (int pos = 0; pos < count; pos++)
            sb.append(data[pos]).append(" ");
        sb.append("]");
        return sb.toString();
    }

    /**
     * Retorna o numero de elementos armazenados na lista.
     * 
     * @return o numero de elementos da lista
     */
    public int size() {
        return count;
    }

    /**
     * Adiciona um elemento ao final da lista.
     * 
     * @param element elemento a ser adicionado ao final da lista
     */
    public void add(Integer element) {
        data[count] = element;
        count++;
    }

    /**
     * Adiciona um elemento na posicao passada como parametro.
     * 
     * @param index
     * @param element
     */
    public void add(int index, Integer element) {   

        for (int i = count; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = element;
        count++;
    }


    /**
     * Retorna o elemento de uma determinada posicao da lista.
     * 
     * @param index a posicao da lista
     * @return o elemento da posicao especificada
     */
    public int get(int index) {
        return data[index];
    }

    /**
     * Esvazia a lista.
     */
    public void clear() {
        for(int i=0;i<=count;i++){
            data[i] = null;
        }
        count=0;
    }

    /**
     * Retorna true se a lista nao contem elementos.
     * 
     * @return true se a lista nao contem elementos
     */
    public boolean isEmpty() {
        if(count==0){
            return true;
        }
        return false;
    
    }

    /**
     * Retorna a posição na qual está armazenado o valor passado por parâmetro.
     * 
     * @param element O elemento a ser procurado
     * @return A posição do elemento na lista ou -1 caso não esteja na lista.
     */
    public int indexOf(Integer element) {
        for(int i=0;i<data.length;i++){
            if(element==data[i]){
                return i;
            }
        }
        return -1;
    }

    /**
     * Procura e remove o primeiro elemento com valor passado como
     * parâmetro no array.
     * 
     * @param element o elemento a ser removido
     * @return true caso tenha sido removido, false caso não tenha removido
     */
    public boolean remove(Integer element) {
        for (int i = 0; i < data.length; i++) {
            if(data[i]==element){
                data[i]=null;
                count--;
                return true;
                
            }
        }
        return false;
    }

    /**
     * Substitui o elemento armazenado em uma determinada posicao da lista pelo
     * elemento passado por parametro, retornando o elemento que foi substituido.
     * 
     * @param index   a posicao da lista
     * @param element o elemento a ser armazenado na lista
     * @return o elemento armazenado anteriormente na posicao da lista
     */
    public int set(int index, Integer element) {
        return data[index]=element;
    }

    /**
     * Procura pelo elemento passado por parametro na lista e retorna true se a
     * lista contem este elemento.
     * 
     * @param element o elemento a ser procurado
     * @return true se a lista contem o elemento passado por parametro
     */
    public boolean contains(Integer element) {
        for(int i=0;i<data.length;i++){
            if(data[i]==element){
                return true;
            }
        }
        return false;
    }

    /**
     * Modifica o tamanho max da lista para o valor recebido
     *
     * @param newCapacity
     */
    public void setCapacity(int newCapacity) {
        data = new Integer[newCapacity];
    }

    /**
     * Inverte o conteudo da lista
     * logaritmica
     */

    public void reverse(){
        int temp;
        int j=count-1;
        for(int i=0;i<(count)/2;i++){
            temp=data[i];
            data[i]=data[j];
            data[j]=temp;
            j--;
        }
    }

    public int countOcurrences(Integer element) {
        int occ = 0;
        for(int i=0;i<count;i++){
            if(data[i].equals(element)){
                occ++;
            }
        }
        return occ;
    }
}

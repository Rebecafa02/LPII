
public class BuscaArrayGenerico{
    //esse extends está limitando os tipos que podem ser passados como parametros para objetos de classes que implementam a interface Comparable
    public static <T extends Comparable> int buscar(T[] array, T elemento){
        for (int i = 0; i< array.lenght; i++){
            if (array[i].compareTo(elemento)==0){
                return i;
            }
        }
        return -1;
    }
}

public static void main (String [] args){
    Integer[] array = new Integer[] {7, 2, 9, 1, 4};


}
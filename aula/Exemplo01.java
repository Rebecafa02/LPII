import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exemplo01 {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<Integer>();
        List<Integer> lista2 = new LinkedList<Integer>();
        lista1.add(0, 15);
        lista2.add(0, 15);
        //polimofirmos= metodos com a mesma assinatura mas que internamente tem comportamentos diferentes, apesar de o resultado final ser o mesmo
    }
}
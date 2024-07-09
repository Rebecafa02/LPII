import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class AnimaisUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        final int QTD = 10;
        ArrayList<Animais> lista1 = new ArrayList<>();
        ArrayList<Animais> lista2 = new ArrayList<>();

        for(int i = 0; i < QTD; i++){
            System.out.println("Insira o nome de um animal");
            String a = scanner.nextLine();
            lista1.add(new Animais(a));
        }

        for (Animais a: lista1)
            System.out.println(a.nome);

        Iterator<Animais> iterador = lista1.iterator();  	// obtenção de iterador da lista 1

        while(iterador.hasNext()){
            Animais a = iterador.next();
            String n = a.nome;
            if(n.length() >= 5){
                iterador.remove();
                lista2.add(a);
            }
        }

        System.out.println("");

        for(Animais a: lista1)
            System.out.println(a.getNome());

        System.out.println("");
        
        for(Animais a: lista2)
            System.out.println(a.getNome());
        
    
        
        scanner.close();
    }
}

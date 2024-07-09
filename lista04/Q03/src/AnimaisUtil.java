package Q03;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class AnimaisUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        final int QTD = 10;
        ArrayList<Animal> lista1 = new ArrayList<>();
        ArrayList<Animal> lista2 = new ArrayList<>();

        for(int i = 0; i < QTD; i++){
            System.out.println("Insira o nome de um animal");
            String a = scanner.nextLine().toLowerCase();
            if(lista1.contains(a)){
                System.out.println("Esse animal já está na lista, por favor adicione outro! ");
            } else{
                lista1.add(new Animal(a));
            }
        }

        for (Animal a: lista1)
            System.out.println(a.nome);

        Iterator<Animal> iterador = lista1.iterator();  	// obtenção de iterador da lista 1

        while(iterador.hasNext()){
            Animal a = iterador.next();
            String n = a.nome;
            if(n.length() >= 5){
                iterador.remove();
                lista2.add(a);
            }
        }

        System.out.println("");

        for(Animal a: lista1)
            System.out.println(a.getNome());

        System.out.println("");

        for(Animal a: lista2)
            System.out.println(a.getNome());



        scanner.close();
    }
}

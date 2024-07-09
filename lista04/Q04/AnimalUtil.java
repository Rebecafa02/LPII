package Q04;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AnimalUtil{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection<String> lista1 = new ArrayList<>();
        Collection<String> lista2 = new ArrayList<>();
        //sendo lista 1 a lsita com o nome dos animais e a lista 2 a lista com os nomes dos animais com cinco letras ou mais
        Boolean valorCorreto = false;

        for (int i = 0; i < 10; i++){
            do{
                System.out.println("Insira o nome do " + (i +1) + "º animal");
                String nomeAnimal = scanner.nextLine().toLowerCase();
                if (lista1.contains(nomeAnimal)){
                System.out.println("Animal já está na lista, por favor insira outro nome!");
                } else {
                    lista1.add(nomeAnimal);
                    valorCorreto = true;
                }
            } while (!valorCorreto);
            valorCorreto = false;
        }   

        Iterator<String> t1 = lista1.iterator();
        while (t1.hasNext()) {
            String animal = t1.next();
            if (animal.length()>= 5){
                lista2.add(animal);
                t1.remove();
            }
        }

        System.out.println("Lista de animais 1: ");
        for (String animal : lista1){
            System.out.println(animal);
        }

        System.out.println("Lista de animais 2: ");
        for (String animal : lista2){
            System.out.println(animal);
        }

        scanner.close();
    }
}

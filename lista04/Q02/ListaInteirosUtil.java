package Q02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collection;

public class ListaInteirosUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        final int QTD = 10;
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        for(int i = 0; i < QTD; i++){
            System.out.println("Insira um numero inteiro ");
            int n = scanner.nextInt();
            lista1.add(n);
        }

        for (Integer n: lista1)
            System.out.println(n);

        Iterator<Integer> iterador = lista1.iterator();  	// obtenção de iterador da lista 1

        while(iterador.hasNext()){
            Integer n = iterador.next();
            if(n % 10 == getNumeroReverso(n) % 10){
                iterador.remove();
                lista2.add(n);
            }
        }

        System.out.println("");

        for(Integer n: lista1)
            System.out.println(n);

        System.out.println("");
        
        for(Integer n: lista2)
            System.out.println(n);
        
        public static int getNumeroReverso(int n){
            int ultimoDigito;
            int nReverso = 0;
            while(n != 0){
                ultimoDigito = n % 10;
                nReverso = nReverso * 10 + ultimoDigito;
                n = n/10;}
            return nReverso;
        }
        
        scanner.close();
    }
}

import java.util.LinkedList;
import java.util.Deque;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);

        String resp;
        do {
            System.out.println("Inserir (i), remover (r) ou fechar programa(f) ?");
            resp = scanner.nextLine().toLowerCase();

            switch(resp){
                case "i":
                    System.out.println("Numero a inserir: ");
                    Integer n = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Inserção no inicio ou no final? (I/F) ");
                    String extremidade = scanner.nextLine().toLowerCase();
                    if(extremidade.equals("i")){
                        deque.addFirst(n);
                    } else {
                        deque.addLast(n);
                    }
                    System.out.println("Deque apos inserçao: " + deque);
                    break;
                case "r":
                    System.out.println("Remoção no inicio ou no final? (I/F) ");
                    extremidade =  scanner.nextLine().toLowerCase();
                    if(extremidade.equals("i")){
                        n = deque.pollFirst();
                    } else {
                        n = deque.pollLast();
                    }
                    System.out.printf("Numero removido: %d", n, "\n" );
                    System.out.println("Deque apos remoção: " + deque);
                    break;
            }
        } while (!resp.equals("f"));
        scanner.close();
    }
}
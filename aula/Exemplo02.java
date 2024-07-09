import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);

        String resp;
        do {
            System.out.println("Enfileirar (e), desenfileirar (d) ou fechar programa(f) ?");
            resp = scanner.nextLine().toLowerCase();

            switch(resp){
                case "e":
                    System.out.println("Numero a enfileirar: ");
                    Integer n = scanner.nextInt();
                    scanner.nextLine();
                    fila.add(n);
                    System.out.println("Fila apos inserçao: " + fila);
                    break;
                case "d":
                    n = fila.remove();
                    System.out.printf("Numero desenfileirado: %d", n, "\n" );
                    System.out.println("Fila apos remoção: " + fila);
                    break;
            }
        } while (!resp.equals("f"));
        scanner.close();
    }
}
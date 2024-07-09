import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContatoTelefoneUtil {
    static List<ContatoTelefonico> telefone = new ArrayList<ContatoTelefonico>();
    static Scanner scanner = null;

    public static void main(String[] args){
        scanner = new Scanner(System.in);

        String op;

        do{
            menu();
            System.out.println("Operação 1-4: ");
            op = scanner.nextInt();

            switch (op){

            
            }
        } while (op!= 4)
    }

    public static void menu(){
        System.out.println("*1");
    }
}

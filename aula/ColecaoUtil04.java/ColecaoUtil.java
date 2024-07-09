import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class ColecaoUtil {
    final static Collection<Funcionario> lista = new ArrayList<>();
    final static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int op;

        do { 
            menu ();
        } while ();

        Iterator<Funcionario> it = lista.iterator();

        while (it.hasNext()){
            Funcionario f = it.next();
            f.reajustarSalario(percentual);
        }

        public static void menu(){
            System.out.println("******* OPERAÇÕES *******");
		    System.out.println("* 1 - INSERIR           *");
		    System.out.println("* 2 - REAJUSTAR SALÁRIO *");
		    System.out.println("* 3 - LISTAR            *");
		    System.out.println("* 4 - SAIR              *");
		    System.out.println("*************************");
        }
        public static void listar(){
            Iterator <Funcionario> it = lista.iterator();
            System.out.println("Lista");
            for (int i = 1; i)
        }

    }
}

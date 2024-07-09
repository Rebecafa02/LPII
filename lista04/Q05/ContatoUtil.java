package Q05;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;
import java.util.Date;


public class ContatoUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contato> listaContatos = new ArrayList<>();
        int opcao = 0;

        do{
            System.out.println("---------- MENU: ---------- ");
            System.out.println("1 - Inserir contato");
            System.out.println("2 - Listar contatos de determinado ano de nascimento");
            System.out.println("3 - Encerrar operação");
            System.out.println("Escolha uma opção (de 1 a 3): ");
            opcao = scanner.nextInt();

            scanner.nextLine();

            switch(opcao){
                case 1 -> {
                    String nome;
                    long telefone;
                    GregorianCalendar dataNascimento = new GregorianCalendar();

                    System.out.println("Digite as informações corretamente: ");
                    System.out.println("Nome: ");
                    nome = scanner.nextLine();

                    System.out.println("Telefone para contato: ");
                    telefone = scanner.nextLong();

                    scanner.nextLine();

                    System.out.println("Data de Nascimento: ");
                    System.out.println("Dia: ");
                    int dia = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Mês (1 a 12): ");
                    int mes = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    dataNascimento.set(ano, mes, dia);

                    listaContatos.add(new Contato(nome, telefone, dataNascimento));
                    System.out.println("Cadastro realizado com sucesso!");
                    System.out.println("-----------------------------------------------");
                }
                case 2 -> {
                    System.out.println("Insira o ano: ");
                    int ano = scanner.nextInt();

                    for (Contato contato: listaContatos){
                        if(contato.getDataDeNascimento().get(Calendar.YEAR) == ano){
                            System.out.println(contato);
                        }
                    }
                    System.out.println("-----------------------------------------------");
                }

                case 3 -> {
                    System.out.println("Encerrando o programa!");
                }

                default -> {
                    System.out.println("Insira uma opção válida");
                }
            }
        } while(opcao != 0);

    }
    
}

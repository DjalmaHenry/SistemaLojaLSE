// Classe Aplicação
package agenda;

import java.util.Scanner;

public class GerenciaAgenda {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int op;
        String nome;
        while (true) {
            System.out.println("MENU:");
            System.out.println("1 - Adicionar um novo contato.");
            System.out.println("2 - Remover um contato.");
            System.out.println("3 - Alterar os dados de um contato.");
            System.out.println("4 - Consultar os dados de um contato.");
            System.out.println("5 - Exibir os dados de todos os contatos.");
            System.out.println("0 - Sair do programa.");
            System.out.println("Informe a opção desejada: ");
            System.out.print("-> ");
            op = in.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe o Nome: ");
                    System.out.print("-> ");
                    nome = in.next();
                    in.nextLine();
                    agenda.inserirValor(nome);
                    break;
                case 2:
                    System.out.println("Informe o Nome: ");
                    System.out.print("-> ");
                    nome = in.next();
                    in.nextLine();
                    agenda.removerValor(nome);
                    break;
                case 3:
                    System.out.println("Informe o Nome: ");
                    System.out.print("-> ");
                    nome = in.next();
                    in.nextLine();
                    agenda.alterarValor(nome);
                    break;
                case 4:
                    System.out.println("Informe o Nome: ");
                    System.out.print("-> ");
                    nome = in.next();
                    in.nextLine();
                    agenda.exibirValor(nome);
                    break;
                case 5:
                    agenda.exibirValores();
                    break;
                case 0:
                    System.out.println("Programa feito por Djalma Henrique");
                    System.out.println("Adeus!");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Opção inválida");
            }
        }
    }
}

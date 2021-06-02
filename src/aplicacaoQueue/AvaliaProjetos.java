package aplicacaoQueue;

import br.unicap.c3.ed1.TAD.Queue;
import java.util.Scanner;

public class AvaliaProjetos {

    public static void main(String[] args) {
        Queue projetos = new Queue(1000);
        Scanner in = new Scanner(System.in);
        int op;
        do {
            System.out.println("AVALIAÇÃO DE PROJETOS.");
            System.out.println("MENU:");
            System.out.println("1 - Registrar novo projeto.");
            System.out.println("2 - Exibir próximo projeto.");
            System.out.println("3 - Finalizar avaliação.");
            System.out.println("0 - Finalizar programa.");
            System.out.println("Informe a opção desejada:");
            System.out.print("-> ");
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    novoPedido(projetos, in);
                    break;
                case 2:
                    proximoPedido(projetos);
                    break;
                case 3:
                    atenderPedido(projetos);
                    break;
                case 0:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.err.println("Erro, opção invalida!");
            }
        } while (op != 0);
    }

    public static void novoPedido(Queue projetos, Scanner in) {
        System.out.println("Informe o nome do projeto:");
        System.out.print("-> ");
        String nome = in.nextLine();
        projetos.enQueue(nome);
        System.out.println("Projeto registrado com sucesso!");
    }

    public static void proximoPedido(Queue projetos) {
        if (projetos.isEmpty()) {
            System.err.println("Não há nenhum projeto para avaliar.");
        } else {
            System.out.println("Projeto a ser avaliado: " + projetos.head());
        }
    }

    public static void atenderPedido(Queue projetos) {
        if (projetos.isEmpty()) {
            System.err.println("Não há nenhum projeto para finalizar a avaliação.");
        } else {
            System.out.println("Avaliação do projeto " + projetos.deQueue() + " finalizado com sucesso!");
        }
    }
}

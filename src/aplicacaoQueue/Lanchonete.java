package aplicacaoQueue;

import br.unicap.c3.ed1.listas.Queue;
import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {
        Queue pedidos = new Queue();
        Scanner in = new Scanner(System.in);
        int op;
        do {
            System.out.println("MENU:");
            System.out.println("1 - Registrar novo pedido.");
            System.out.println("2 - Atender um pedido.");
            System.out.println("0 - Finalizar programa.");
            System.out.println("Informe a opção desejada:");
            System.out.print("-> ");
            op = in.nextInt();
            switch (op) {
                case 1:
                    novoPedido(pedidos, in);
                    break;
                case 2:
                    atenderPedido(pedidos);
                    break;
                case 0:
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.err.println("Erro, opção invalida!");
            }
        } while (op != 0);
    }

    public static void novoPedido(Queue pedidos, Scanner in) {
        System.out.println("Informe o número do boleto:");
        System.out.print("-> ");
        int num = in.nextInt();
        pedidos.enQueue(num);
        System.out.println("Pedido registrado com sucesso!");
    }

    public static void atenderPedido(Queue pedidos) {
        if (pedidos.isEmpty()) {
            System.err.println("Não há nenhum pedido a ser atendido!");
        } else {
            System.out.println("Pedido: " + pedidos.deQueue());
        }
    }
}

//Classe Aplicação
package aplicacaoQueue;

import br.unicap.c3.ed1.TAD.Queue;
import java.util.Scanner;

public class SenhaAtendimento {

    private static Scanner in = new Scanner(System.in);
    private static Queue fila = new Queue(10);
    private static int contSenhas;
    private static boolean atendendo = false;

    public static void main(String[] args) {
        int op;
        do {
            System.out.println("ATENDIMENTO BANCO SóDinheiro.");
            System.out.println("MENU:");
            System.out.println("1 - Gerar uma senha.");
            System.out.println("2 - Chamar uma senha.");
            System.out.println("3 - Finalizar atendimento.");
            System.out.println("0 - Finalizar programa.");
            System.out.println("Informe a opção desejada:");
            System.out.print("-> ");
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    geraSenha();
                    break;
                case 2:
                    chamaSenha();
                    break;
                case 3:
                    finalizaAtendimento();
                    break;
                case 0:
                    System.out.println("Desenvolvido por Djalma Henrique.");
                    System.out.println("Finalizando programa...");
                default:
                    System.err.println("Erro, opção invalida!");
            }
        } while (op != 0);
    }

    public static void geraSenha() { //gera senhas a partir de 1 e insere na fila
        if (fila.isEmpty() && atendendo == false) { //se a fila estiver vázia e não tiver ninguém sendo atendido
            System.out.println("SóDinheiro - Não há clientes na fila! Você será atendido agora.");
            atendendo = true;
        } else if (fila.isFull()) { //se já tiver 10 pessoas na fila esperando
            System.err.println("ALERTA COVID-19:");
            System.out.println("O banco está com a lotação máxima, por favor, retorne em outro momento!");
        } else { //é gerado a senha e inserida na fila
            contSenhas++;
            fila.enQueue(contSenhas);
            System.out.println("SóDinheiro - Sua senha é a " + contSenhas + ".");
        }
    }

    public static void chamaSenha() { //chama uma senha da fila para atender
        if (atendendo == true) { //se já tiver alguem sendo atendido
            System.err.println("Erro, primeiro finalize o atendimento para chamar outra senha!");
        } else if (fila.isEmpty()) { //se a fila estiver vázia
            System.err.println("Fila vazia, não há nenhum cliente para atender!");
        } else { //chamando uma senha para atendimento
            System.out.println("SóDinheiro - Senha: " + fila.deQueue());
            atendendo = true;
        }
    }

    public static void finalizaAtendimento() { //finaliza o atendimento da senha chamada
        System.out.println("SóDinheiro - Atendimento finalizado.");
        atendendo = false;
    }
}

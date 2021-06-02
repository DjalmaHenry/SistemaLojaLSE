//Classe Aplicação
package aplicacaoDeque;

import br.unicap.c3.ed1.TAD.Deque;
import java.util.Scanner;

public class DequeDeNumeros {

    private static Scanner in = new Scanner(System.in);
    private static Deque numeros = new Deque();

    public static void main(String[] args) {
        int op;
        do {
            System.out.println("MENU:");
            System.out.println("1 - Inserir um número no início.");
            System.out.println("2 - Remover um número do início.");
            System.out.println("3 - Inserir um número no final.");
            System.out.println("4 - Remover um número do final.");
            System.out.println("0 - Finalizar programa.");
            System.out.println("Informe a opção desejada:");
            System.out.print("-> ");
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                case 1:
                    insereInicio();
                    break;
                case 2:
                    removeInicio();
                    break;
                case 3:
                    insereFinal();
                    break;
                case 4:
                    removeFinal();
                    break;
                case 0:
                    System.out.println("Desenvolvido por Djalma Henrique.");
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.err.println("Erro, opção invalida!");
            }
        } while (op != 0);
    }

    public static void insereInicio() {
        int num;
        if (numeros.isFull()) {
            System.err.println("Erro, a Deque está cheia!");
        } else {
            System.out.print("Informe um número: ");
            num = in.nextInt();
            numeros.push(num);
            System.out.println("Número inserido com sucesso!");
        }
    }

    public static void removeInicio() {
        if (numeros.isEmpty()) {
            System.err.println("Erro, a Deque está vázia!");
        } else {
            System.out.println(numeros.pop());
        }
    }

    public static void insereFinal() {
        int num;
        if (numeros.isFull()) {
            System.err.println("Erro, a Deque está cheia!");
        } else {
            System.out.print("Informe um número: ");
            num = in.nextInt();
            numeros.inject(num);
            System.out.println("Número inserido com sucesso!");
        }
    }

    public static void removeFinal() {
        if (numeros.isEmpty()) {
            System.err.println("Erro, a Deque está vázia!");
        } else {
            System.out.println(numeros.eject());
        }
    }

}

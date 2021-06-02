package aplicacaoStack;

import br.unicap.c3.ed1.TAD.Stack;
import java.util.Scanner;

//programa para converter um número de decimal para a base binária
public class ConverteBase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack pilha = new Stack();
        int num, resto;
        System.out.println("Conversor de Decimal para Binário.");
        System.out.println("Informe um número decimal:");
        System.out.print("-> ");
        num = in.nextInt();
        while (num != 0) {
            resto = num % 2;
            num = num / 2;
            pilha.push(resto);
        }
        System.out.println("Seu número em binário:");
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
        System.out.println();
    }
}

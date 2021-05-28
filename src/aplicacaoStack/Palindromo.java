package aplicacaoStack;

import br.unicap.c3.ed1.listas.Stack;
import java.util.Scanner;

//programa para verificar se uma palavra é Palíndroma.
public class Palindromo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean validado = true, palindromo = true;
        String frase;
        char letra;
        System.out.print("Insira uma frase: ");
        frase = in.nextLine();
        System.out.println(frase);
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);
            if (!Character.isLetter(letra) && !Character.isSpace(letra)) {
                validado = false;
            }
        }
        if (validado == false) {
            System.err.println("Erro, Frase inválida");
        } else {
            Stack pilhaA = new Stack();
            Stack pilhaB = new Stack();
            for (int i = 0; i < frase.length(); i++) {
                letra = frase.charAt(i);
                if (Character.isLetter(letra)) {
                    pilhaA.push(letra);
                }
            }
            for (int i = frase.length() - 1; i >= 0; i--) {
                letra = frase.charAt(i);
                if (Character.isLetter(letra)) {
                    pilhaB.push(letra);
                }
            }
            while (!pilhaA.isEmpty()) {
                if (pilhaA.pop() != pilhaB.pop()) {
                    palindromo = false;
                }
            }
        }
        if (palindromo) {
            System.out.println("A frase é um Palíndromo!");
        } else {
            System.out.println("A frase NÃO é um Palíndromo!");
        }
    }
}

// Classe Cadastro
package agenda;

import br.unicap.c3.ed1.listas.LSESemRepetidosOrdenada;
import java.util.Scanner;

public class Agenda {

    private LSESemRepetidosOrdenada<Contato> contatos;

    public Agenda() {
        contatos = new LSESemRepetidosOrdenada();
    }

    public void inserirValor(String nome) {
        Scanner in = new Scanner(System.in);
        String telefone, email;
        boolean result;
        Contato conA = new Contato(nome);
        result = contatos.buscaNum(conA);

        if (result == true) {
            System.err.println("Nome já existe! Inserção não efetuada!");
        } else {
            System.out.println("Informe o Telefone: ");
            System.out.print("-> ");
            telefone = in.next();
            in.nextLine();
            System.out.println("Informe o E-mail: ");
            System.out.print("-> ");
            email = in.next();
            in.nextLine();
            Contato conB = new Contato(nome, telefone, email);
            contatos.inseri(conB);
        }
    }

    public void alterarValor(String nome) {
        Scanner in = new Scanner(System.in);
        String telefone, email;
        Contato con;
        boolean result;
        int op;
        Contato conA = new Contato(nome);
        con = contatos.buscarObjeto(conA);
        if (con == null) {
            System.err.println("Nome NÃO existe!");
        } else {
            do {
                System.out.println("O que deseja alterar?");
                System.out.println("1 - E-mail e Telefone.");
                System.out.println("2 - E-mail.");
                System.out.println("3 - Telefone.");
                System.out.println("0 - Cancelar operação.");
                System.out.println("Informe a opção:");
                System.out.print("-> ");
                op = in.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Informe o E-mail: ");
                        System.out.print("-> ");
                        email = in.next();
                        in.nextLine();
                        System.out.println("Informe o Telefone: ");
                        System.out.print("-> ");
                        telefone = in.next();
                        in.nextLine();
                        con.atualizaEmail(email);
                        con.atualizaTelefone(telefone);
                        System.out.println("Alteração efetuada com sucesso!");
                        break;
                    case 2:
                        System.out.println("Informe o E-mail: ");
                        System.out.print("-> ");
                        email = in.next();
                        in.nextLine();
                        con.atualizaEmail(email);
                        System.out.println("Alteração efetuada com sucesso!");
                        break;
                    case 3:
                        System.out.println("Informe o Telefone: ");
                        System.out.print("-> ");
                        telefone = in.next();
                        in.nextLine();
                        con.atualizaTelefone(telefone);
                        System.out.println("Alteração efetuada com sucesso!");
                        break;
                    case 0:
                        System.out.println("Operação cancelada.");
                        break;
                    default:
                        System.err.println("Erro, opção inválida.");
                        break;
                }
            } while (op != 0 && op != 1 && op != 2 && op != 3);
        }
    }

    public void exibirValor(String nome) {
        Contato aux;
        Contato con = new Contato(nome);
        aux = contatos.buscarObjeto(con);
        if (aux == null) {
            System.err.println("Nome NÃO existe!");
        } else {
            System.out.println(aux);
        }
    }

    public void removerValor(String nome) {
        Contato con = new Contato(nome);
        contatos.removeValor(con);
    }

    public void exibirValores() {
        contatos.exibirValores();
    }

}

// Classe LDE
package br.unicap.c3.ed1.listas;

public class LSECircular<T extends Comparable<T>> {

    private LSENode<T> prim;
    private LSENode<T> ult;
    private int qtd;

    public boolean isEmpty() {
        if (qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirValorInicio(T valor) {
        LSENode<T> novo;
        novo = new LSENode(valor);
        if (isEmpty()) { // lista está vazia
            prim = novo;
            ult = novo;
            ult.setProx(prim);
            qtd++;
            System.out.println("Inserção efetuada com sucesso!");
        } else { // lista não está vazia
            novo.setProx(prim);
            prim = novo;
            ult.setProx(prim);
            qtd++;
            System.out.println("Inserção efetuada com sucesso!");
        }
    }

    public void inserirValorFinal(T valor) {
        LSENode<T> novo;
        novo = new LSENode(valor);
        if (isEmpty()) { // lista está vazia
            prim = novo;
            ult = novo;
            ult.setProx(prim);
            qtd++;
            System.out.println("Inserção efetuada com sucesso!");
        } else { // lista não está vazia
            ult.setProx(novo);
            ult = novo;
            ult.setProx(prim);
            qtd++;
            System.out.println("Inserção efetuada com sucesso!");
        }
    }

    public void RemValorInicio() {
        if (isEmpty()) { // lista está vazia
            System.err.println("Erro, lista vázia.");
        } else if (qtd == 1) {
            prim = null;
            ult = null;
            qtd--;
            System.out.println("Remoção efetuada com sucesso!");
        } else { // lista não está vazia
            prim = prim.getProx();
            qtd--;
            System.out.println("Remoção efetuada com sucesso!");
        }
    }

    public void RemValorFinal() {
        if (isEmpty()) { // lista está vazia
            System.err.println("Erro, lista vázia.");
        } else if (qtd == 1) {
            prim = null;
            ult = null;
            qtd--;
            System.out.println("Remoção efetuada com sucesso!");
        } else { // lista não está vazia
            LSENode aux = prim;
            for (int i = 1; i < qtd - 1; i++) {
                aux = aux.getProx();
            }
            ult = aux;
            ult.setProx(prim);
            qtd--;
            System.out.println("Remoção efetuada com sucesso!");
        }
    }

    public void exibirValores() {
        LSENode<T> aux;
        if (isEmpty()) {
            System.out.println("Lista vazia!!");
        } else {
            aux = prim;
            for (int i = 0; i != qtd; i++) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }
}

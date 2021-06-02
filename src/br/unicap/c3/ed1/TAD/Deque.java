//Classe Deque
package br.unicap.c3.ed1.TAD;

public class Deque<A> {

    private DequeNode<A> inicio;
    private DequeNode<A> fim;

    public void push(A valor) { //insere o elemento A no início
        DequeNode<A> novo = new DequeNode(valor);
        if (isEmpty()) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProx(inicio);
            inicio = novo;
        }
    }

    public A pop() { //remove e retorna o elemento que está no início
        A valor = inicio.getInfo();
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.getProx();
        }
        return valor;
    }

    public void inject(A valor) { //insere o elemento A no final
        DequeNode novo = new DequeNode(valor);
        if (isEmpty()) {
            inicio = novo;
            fim = novo;
        } else {
            fim.setProx(novo);
            fim = novo;
        }
    }

    public A eject() { //remove e retorna o elemento que está no final
        A valor = fim.getInfo();
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            DequeNode<A> aux = inicio;
            while (aux.getProx() != fim) {
                aux = aux.getProx();
            }
            fim = aux;
        }
        return valor;
    }

    public boolean isEmpty() { //verifica se está vázio
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() { //verifica se está cheio
        return false;
    }
}

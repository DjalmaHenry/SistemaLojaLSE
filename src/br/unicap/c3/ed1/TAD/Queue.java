//Classe Queue
package br.unicap.c3.ed1.TAD;

public class Queue<T> {

    private QueueNode<T> inicio;
    private QueueNode<T> fim;
    private int limite;
    private int qtd;

    public Queue(int limite) {
        this.limite = limite;
    }

    public boolean isEmpty() {
        if (qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (qtd == limite) {
            return true;
        } else {
            return false;
        }
    }

    public T head() {
        return inicio.getInfo();
    }

    public void enQueue(T valor) { //inserir no final da fila
        QueueNode novo = new QueueNode(valor);
        if (isEmpty()) {
            inicio = novo;
            fim = novo;
            qtd++;
        } else {
            fim.setProx(novo);
            fim = novo;
            qtd++;
        }
    }

    public T deQueue() { //remover o primeiro
        QueueNode<T> aux = inicio;
        if (inicio == fim) {
            inicio = null;
            fim = null;
            qtd = 0;
        } else {
            inicio = inicio.getProx();
            qtd--;
        }
        return aux.getInfo();
    }
}

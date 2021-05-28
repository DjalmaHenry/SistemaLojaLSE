package br.unicap.c3.ed1.listas;

public class Queue<T> {
    private QueueNode<T> inicio;
    private QueueNode<T> fim;

    public boolean isEmpty(){
        if (inicio == null){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        return false;
    }

    public T head(){
        return inicio.getInfo();
    }

    public void enQueue(T valor){ //inserir no final da fila
        QueueNode novo = new QueueNode(valor);
        if(isEmpty()){
            inicio = novo;
            fim = novo;
        } else {
            fim.setProx(novo);
            fim = novo;
        }
    }

    public T deQueue(){ //remover o primeiro
        QueueNode<T> aux = inicio;
        if(inicio == fim){
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.getProx();
        }
        return aux.getInfo();
    }
}

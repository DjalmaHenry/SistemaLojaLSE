package br.unicap.c3.ed1.listas;

class QueueNode<T> { // esta classe tem visibilidade de pacote

    private T info;
    private StackNode<T> prox;

    QueueNode(T valor) {
        info = valor;
    }

    void setInfo(T valor) {
        info = valor;
    }

    void setProx(QueueNode<T> novoProx) {
        prox = novoProx;
    }

    T getInfo() {
        return info;
    }

    QueueNode<T> getProx() {
        return prox;
    }
}

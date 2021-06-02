//Classe DequeNode
package br.unicap.c3.ed1.TAD;

class DequeNode<A> { // esta classe tem visibilidade de pacote

    private A info;
    private DequeNode<A> prox;

    DequeNode(A valor) {
        info = valor;
    }

    void setInfo(A valor) {
        info = valor;
    }

    void setProx(DequeNode<A> novoProx) {
        prox = novoProx;
    }

    A getInfo() {
        return info;
    }

    DequeNode<A> getProx() {
        return prox;
    }
}

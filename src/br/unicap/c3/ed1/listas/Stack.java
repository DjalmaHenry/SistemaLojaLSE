package br.unicap.c3.ed1.listas;

public class Stack<T> {

    private StackNode<T> topo;

    public boolean isEmpty() {
        if (topo == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        return false;
    }

    public void push(T valor) {
        StackNode<T> novo = new StackNode(valor);
        if (isEmpty()) {
            topo = novo;
        } else {
            novo.setProx(topo);
            topo = novo;
        }
    }

    public T pop() {
        T valor;
        valor = topo.getInfo();
        topo = topo.getProx();
        return valor;
    }

    public T top() {
        T valor = topo.getInfo();
        return valor;
    }
}

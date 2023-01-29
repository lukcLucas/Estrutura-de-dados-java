package PILHA;

import LSE.Item;

public class PilhaInt {

    private NoInt topo;
    private int nElem;

    public PilhaInt() {
        this.nElem = 0;
    }

    // verificar se a pilha esta vazia

    public boolean eVazia() {
        if (this.nElem == 0) {

            return true;
        } else {
            return false;
        }

    }

    // retornar o tamanho da pilha

    public int tamanho() {
        return this.nElem;
    }

    // retorna o elemento(topo da pilha)

    public NoInt topo() {
        return this.topo;
    }

    public int topoInfo() {
        return this.topo.getInfo();
    }

    public void push(int info) {
        NoInt novoNo = new NoInt(info);
        if (!this.eVazia()) {
            novoNo.setProx(topo);
        }
        topo = novoNo;
        this.nElem++;
    }

    public NoInt pop() {
        if (this.eVazia()) {
            return null;
        } else {
            NoInt aux = topo;
            this.topo = this.topo.getProx();
            this.nElem--;
            return aux;
        }
    }

}

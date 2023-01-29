package FILA;

import PILHA.NoInt;

public class Fila {
    private NoInt head, tail;
    private int nElem;

    public Fila() {
        this.nElem = 0;
    }

    // verificar se a fila esta vazia

    public boolean eVazia() {
        if (this.nElem == 0) {
            return true;
        } else {
            return false;
        }

    }

    // retornar o tamanho da fila
    public int tamanho() {
        return this.nElem;
    }

    // Retorna o elemento do inicio da fila

    public NoInt head() {
        return this.head;
    }

    public int headInfo() {
        return this.head.getInfo();
    }

    /*
     * enqueue (Inserir um elemento no final da fila)
     */
    public void enqueue(int info) {
        NoInt novoNo = new NoInt(info);
        if (eVazia()) {
            this.head = novoNo;
        } else {
            tail.setProx(novoNo);
        }
        this.tail = novoNo;
        this.nElem++;
    }

    /*
     * dequeue (Remover o elemento do inicio da fila)
     */
    public NoInt dequeue() {
        NoInt no;
        if (this.eVazia()) {
            return null;
        } else {
            if (this.nElem == 1) {
                this.tail = null;
            }
            no = this.head;
            this.head = this.head.getProx();
            this.nElem--;
            return no;
        }
    }

}

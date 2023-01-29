package PILHA;

import LSE.Item;

public class NoInt {
    private int info;
    private NoInt prox;

    /**
     * @param info
     */
    public NoInt(int info) {
        this.info = info;
        this.prox = null; // essa linha e facultativa pq
                          // ponteiro inicializa com null
                          // automaticamente

    }

    public int getInfo() {
        return info;

    }

    public void setInfo(int info) {
        this.info = info;

    }

    public NoInt getProx() {
        return prox;
    }

    public void setProx(NoInt prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "NoInt[info=" + info + "]";
    }

}

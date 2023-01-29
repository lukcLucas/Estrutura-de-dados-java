package LSE;

public class Lse {

    private No prim, ult;
    private int nElem;

    public Lse() {
        this.prim = null;
        this.ult = null;
        this.nElem = 0;
    }

    public No getPrim() {
        return prim;
    }

    public void setPrim(No prim) {
        this.prim = prim;
    }

    public No getUlt() {
        return ult;
    }

    public void setUlt(No ult) {
        this.ult = ult;
    }

    public boolean eVazia() {
        if (this.nElem == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void insereFim(Item info) {
        No novoNo = new No(info);
        if (this.eVazia()) {
            this.prim = novoNo;
        } else {
            this.ult.setProx(novoNo);
        }
        this.ult = novoNo;
        this.nElem++;
    }

    public void insereInicio(Item info) {
        No novoNo = new No(info);
        if (this.eVazia()) {
            this.ult = novoNo;
        } else {
            novoNo.setProx(this.prim);
        }
        this.prim = novoNo;
        this.nElem++;
    }

    public No pesquisa(int chave) {
        No atual;
        if (this.eVazia()) {
            return null;
        }
        atual = this.prim;
        while (atual != null && atual.getInfo().getChave() != chave) {
            atual = atual.getProx();
        }
        return atual;
    }

    public boolean remove(int chave) {
        No atual, ant;
        if (this.eVazia()) {
            return false;
        }
        // hipotese 1 - chave e o primeiro
        if (this.prim.getInfo().getChave() == chave) {
            this.prim = this.prim.getProx();
            this.nElem--;
            return true;
        } else {
            // hipotese 2 e 3: chave esta no meio ou no ultimo
            ant = this.prim;
            atual = this.prim.getProx();
            while (atual != null && atual.getInfo().getChave() != chave) {
                // caminhando na lista
                ant = atual;
                atual = atual.getProx();
            }
            if (atual == null) {// se a chave nao existe
                return false;
            } else {
                ant.setProx(atual.getProx());
                if (atual == this.ult) {// se for o ultimo
                    this.ult = ant;
                }
                atual = null;
                this.nElem--;
                return true;
            }
        }
    }

    public String toString() {
        String aux = "";
        No atual = this.prim;
        for (int i = 0; i < this.nElem; i++) {

            aux += atual.getInfo().getChave() + "";
            atual = atual.getProx();

        }
        return aux;
    }

}

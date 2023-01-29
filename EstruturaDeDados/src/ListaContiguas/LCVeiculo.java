package ListaContiguas;

public class LCVeiculo {
    private Veiculo[] listaVeiculos;
    private int nElem;

    public LCVeiculo(int tamanho) {
        this.listaVeiculos = new Veiculo[tamanho];
        this.nElem = 0;

    }

    public Veiculo getVeiculo(int pos) {
        if (pos < this.nElem) {

            return this.listaVeiculos[pos];

        } else {
            return null;
        }
    }

    public int getNElem() {
        return this.nElem;
    }

    public boolean eVazio() {
        if (this.nElem == 0) {
            return true;
        }
        return false;
    }

    public boolean eCheio() {
        if (this.nElem == this.listaVeiculos.length) {
            return true;
        }
        return false;
    }
    // insere(veiculo, posicao)

    public int inserir(Veiculo veiculo, int pos) {
        if (this.eCheio()) {
            return -1;
        } else if (pos > this.nElem || pos < 0) {
            return -2;
        } else {
            for (int i = this.nElem - 1; i >= pos; i--) {
                this.listaVeiculos[i + 1] = this.listaVeiculos[i];

            }
            this.listaVeiculos[pos] = veiculo;
            this.nElem++;
            return 0;
        }
    }

    // pesquisa (placa)

    public int pesquisa(String placa) {

        for (int i = 0; i < this.nElem; i++) {
            if (this.listaVeiculos[i].getPlaca().equalsIgnoreCase(placa)) {
                return i;
            }
        }

        return -1;
    }

    // insereFim(veiculo)

    public boolean insereFim(Veiculo veiculo) {
        if (this.eCheio()) {
            return false;
        } else {
            this.listaVeiculos[this.nElem] = veiculo;
            this.nElem++;
            return true;
        }
    }

    public int remove(int pos) {
        if (this.eVazio()) {
            return -1;
        } else if (pos >= this.nElem || pos < 0) {
            return -2;
        } else {
            this.listaVeiculos[pos] = this.listaVeiculos[this.nElem - 1];
            this.listaVeiculos[this.nElem - 1] = null;// Essa linha e opcional
            this.nElem--;
            return 0;
        }
    }

    // remove(placa)

    public int remove(String placa) {
        if (this.eVazio()) {

            return -1;
        } else {
            int pos = this.pesquisa(placa);
            if (pos == -1) {
                return -2;
            } else {
                return (this.remove(pos));
            }
        }
    }
    // pesquisa(marca)

    public LCVeiculo pesquisaMarca(String Marca) {
        LCVeiculo lista = new LCVeiculo(this.nElem);

        for (int i = 0; i < this.nElem; i++) {
            if (this.listaVeiculos[i].getMarca().equalsIgnoreCase(Marca)) {
                lista.insereFim(this.listaVeiculos[i]);
            }
        }

        return lista;
    }

    public void aumenta() {
        Veiculo[] aux = new Veiculo[this.listaVeiculos.length * 2];
        for (int i = 0; i < this.nElem; i++) {
            aux[i] = this.listaVeiculos[i];
        }
        this.listaVeiculos = aux;
    }
}

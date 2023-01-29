package ListaContiguas;

public class Veiculo {
    /*
     * Essa classe tem como atributos: nome, marca, cor, placa.
     * Essa classe possui os apenas os métodos gets, sets e toString.
     */
    private String nome, marca, cor, placa;

    /**
     * @param nome
     * @param marca
     * @param cor
     * @param placa
     */
    public Veiculo(String nome, String marca, String cor, String placa) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo [nome=" + nome + ", marca=" + marca + ", cor=" + cor +
                ", placa=" + placa + "]";
    }
}

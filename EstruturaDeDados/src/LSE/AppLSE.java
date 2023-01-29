package LSE;

import io.InOut;

public class AppLSE {

    public static void main(String[] args) {

        // instancia a lista vazia

        Lse lista = new Lse();
        int op;
        do {
            op = InOut.leInt("Escolha uma opcao:\n"
                    + "1. Inserir nodo final da lista\n"
                    + "2. Pesquisar um valor na lista\n"
                    + "3. Remover um nodo da lista\n"
                    + "4. Sair do programa");
            switch (op) {
                case 1:

                    inserir(lista);
                    break;

                case 2:
                    pesquisar(lista);
                    break;

                case 3:
                    remover(lista);
                    break;

                case 4:
                    InOut.MsgDeAviso("", "FIM");
                    break;

                default:
                    InOut.MsgDeErro("ERRO", "OPCAO INVALIDA");
                    break;
            }
        } while (op != 4);
    }

    public static void inserir(Lse lse) {
        int valor = InOut.leInt("Digite um valor inteiro:");
        Item elem = new Item(valor);
        lse.insereFim(elem);
        InOut.MsgDeInformacao("OPERACAO REALIZADA COM SUCESSO!", lse.toString());
    }

    public static void pesquisar(Lse lse) {
        int valor;
        valor = InOut.leInt("Digite o valor inteiro a ser procurado " +
                "na lista:");
        if (lse.pesquisa(valor) != null) {
            InOut.MsgDeInformacao("O VALOR ESTA NA LISTA", lse.toString());
        } else {
            InOut.MsgDeErro("O VALOR NAO ESTA NA LISTA", lse.toString());
        }
    }

    public static void remover(Lse lse) {
        int valor;
        valor = InOut.leInt("Digite o valor inteiro a ser procurado " +
                "na lista:");
        if (lse.remove(valor)) {
            InOut.MsgDeInformacao("O VALOR FOI REMOVIDO COM SUCESSO!", lse.toString());
        } else {
            InOut.MsgDeErro("O VALOR NAO ESTA NA LISTA", lse.toString());
        }
    }

}

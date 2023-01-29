package LDE;

import io.InOut;

public class AppListaDupla {
    public static void main(String[] args) {

        ListaDuplaInt lista = new ListaDuplaInt();
        int op;

        do {

            op = InOut.leInt("1 - Inserir nó no final da lista\n" +
                    "2 - Pesquisar na lista\n" +
                    "3 - Remover da lista\n" +
                    "4 - Imprimir a lista ao contrario\n" +
                    "5 - Sair");

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
                    imprimirAoContrario(lista);
                    break;
                case 5:
                    break;
                default:
                    InOut.MsgDeErro("ERRO", "OPCAO INVALIDA");
                    break;
            }

        } while (op != 5);

    }

    private static void inserir(ListaDuplaInt lista) {
        int numero = InOut.leInt("Entre com um inteiro");
        lista.insereFim(numero);
    }

    private static void pesquisar(ListaDuplaInt lista) {
        int numero = InOut.leInt("Entre com um inteiro");
        NoDuplaInt aux = lista.pesquisa(numero);
        if (aux == null) {
            InOut.MsgDeErro("ERRO", numero + " NAO ENCONTRADO");
        } else {
            InOut.MsgDeInformacao("SUCESSO", numero + " ENCONTRADO");
        }
    }

    private static void remover(ListaDuplaInt lista) {
        // TODO Auto-generated method stub
    }

    private static void imprimirAoContrario(ListaDuplaInt lista) {
        // TODO Auto-generated method stub
    }

}

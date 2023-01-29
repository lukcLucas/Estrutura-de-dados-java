package FILA;

import io.InOut;

public class AppFila {
    /*
     * Faça um aplicativo para armazenar na fila vários valores inteiros* (o
     * programa deve parar de armazenar quando o usuário digitar 0 – zero)
     * ,
     * depois o programa deve mostrar o valor que está no início da fila,
     * remover todos os elementos da fila e, em seguida, mostrar na tela
     * todos os elementos removidos.
     */

    public static void main(String[] args) {
        Fila fila = new Fila();
        cadastrar(fila);
        InOut.MsgDeAviso("PRIMEIRO DA FILA", "Primeiro = " + fila.headInfo());
        desenfileirar(fila);
    }

    public static void cadastrar(Fila fila) {
        int num = InOut.leInt("Entre com um inteiro diferente de zero ou" + "zero para terminar");
        while (num != 0) {
            fila.enqueue(num);
            num = InOut.leInt("Entre com um inteiro diferente de zero ou" + "zero para terminar");
        }
    }

    public static void desenfileirar(Fila fila) {
        String str = "";
        while (!fila.eVazia()) {
            str += fila.dequeue().getInfo() + " ";
        }
        InOut.MsgDeInformacao("FILA", str);
    }
}

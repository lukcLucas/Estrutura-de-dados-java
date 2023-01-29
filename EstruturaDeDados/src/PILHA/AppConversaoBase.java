package PILHA;

import io.InOut;

public class AppConversaoBase {
    /*
     * Faça um programa, usando a pilhaInt, para converter
     * um numero da base 10 para a base 2.
     */

    public static void main(String[] args) {

        int numbase10, aux, resto;
        String str;
        PilhaInt pilha = new PilhaInt();

        numbase10 = InOut.leInt("Entre com um inteiro positivo");
        aux = numbase10;

        // decompoe o valor e empilha os resultado

        while (aux > 0) {
            resto = aux % 2;
            pilha.push(resto);
            aux = aux / 2;

        }

        // desempilha para imprimir o resultado
        str = numbase10 + "= ";

        while (!pilha.eVazia()) {
            str += pilha.pop().getInfo();
        }
        InOut.MsgDeInformacao("conversao", str);
    }

}

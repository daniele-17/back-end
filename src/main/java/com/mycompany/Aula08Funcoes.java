    package com.mycompany;

    public class Aula08Funcoes
    public static void main(String[] args) {
    int numero = 5;

    System.out.println(" --- Tabuada do " + numero

    for (int i = 1; i <= 10; i++) {
    System.out.println(numero + " x" + i + " = " + multiplicacao(numero, i);
    }

    System.out.println(fatorial(n:5))
 }


    /**
    * Não posso declarar méto
    *
    Toda funcao deve ter um retorno, quando nao ha retorno utilizamos void.
    *
    Uma funcao pode nao ter parametros, ou ter 1 ou mais.
    */
    public static int multiplicacao(int num, int num2) {
    return num * num2;
    }

    /**
     * Funcao recursivas
     * 
     * uma funcao recursiva faz uma chanmada para ela propria
     * 
     * porém, toda recursividade deve ter um ponto de parada,
     * caso contrario pode resultar em um loop infinito
     */
    public static int fatorial(int n) {
        if (n != 0) {
            return n * fatorial(n - 1);
        } else {
            return 1;
        }
    }
}
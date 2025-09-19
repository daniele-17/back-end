package com.mycompany;

import java.util.Scanner;

public class Aula05Repeticao {
    public static void main(String[] args) throws InterruptedException {
        /**
         * For (Para)
         * 
         * Para cada elemento repita
         * 
         * 1° variável de iteração
         * 2° condição de parada
         * 3° incremento ou decremento
         */
        // Incremento
        for(int i = 0;i < 10; i = i +2) {
            System.out.println(i);
        }

        // Decremento
        System.out.println("Contagem regressiva...");
        for (int i = 10; i >= 0; i--) {
            Thread.sleep(1000L);
            System.out.println(i + "...");
        }
        System.out.println("Booom !!");

        /**
         *  Classe Scanner 
         * 
         *  É utilizado para ler valores do usuario inseridos pelo prompt.
         */
        Scanner scan = new Scanner(System.in); // Cria o scanner
        System.out.println("Digite um número: ");

        int numero = scan.nextInt(); // Le o valor digitado e capturado pelo scanner
        System.out.println("Voce digitou" + numero + " !! ");
    }

}
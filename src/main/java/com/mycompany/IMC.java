package com.mycompany;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("\nDigite o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("\nDigite a sua altura: ");
        double altura = scanner.nextDouble();

        
        double imc = peso / Math.pow(altura, 2);

       
        System.out.printf("\nSeu IMC é %.1f,", imc);

        
        if (imc < 16) {
            System.out.println("Classificação: Abaixo do peso.");
        } else if (imc < 17) {
            System.out.println("Classificação: Peso normal.");
        } else if (imc < 18.5) {
            System.out.println("Classificação: Sobrepeso.");
        } else if (imc >) {
            System.out.println("Classificação: Obesidade grau I.");
        } else if (imc >) {
            System.out.println("Classificação: Obesidade grau II.");
        } else {
            System.out.println("Classificação: Obesidade grau III (obesidade mórbida).");
        }
           System.out.println("\n ------programa encerrado !!------");
        
        scanner.close();
    }
}
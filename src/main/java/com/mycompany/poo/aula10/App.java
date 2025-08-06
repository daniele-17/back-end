package com.mycompany.poo.aula10;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Dani";
        pessoa.idade = 17;
        // pessoa.salario = 1.000; atributos privados não são visiveis

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Renan";
        pessoa1.idade = 20;
        pessoa1.altura = 1.60;

        pessoa2.nome = "Jean";
        pessoa2.idade = 26;
        pessoa2.altura = 1.70;

        pessoa1.exibirDados();
        pessoa2.exibirDados();

        pessoa1.atribuirSalario(2000.0, 500);
        pessoa2.atribuirSalario(3500.0);

        /*System.out.println(" --- Dados da pessoa --- ");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("Altura (m):" + pessoa1.altura);

        System.out.println("--- Dados da pessoa ---");
        System.out.println("Nome :  " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade);
        System.out.println("Altura (m):" + pessoa2.altura);*/

    }

}
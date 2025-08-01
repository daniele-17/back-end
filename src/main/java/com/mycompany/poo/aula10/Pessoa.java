package com.mycompany.poo.aula10;

public class Pessoa {
    /*
     * Modificadores de Acesso
     *
     * Quando trabalhamos com o conceito de POO, utilizamos modificadores de acesso,
     * para dar seguranca para nossas classes.
     * Utilizamos elas como prefixo para:
     * -Classes
     * -Interfaces
     * - Atributos
     * -Métodos
     */
    public String nome; // Público, é visivel em qualquer classe.
    protected int idade; // Protegido, é visivil somente em classes filhas (Herança).
    private double salario; // Privado, é visivel somente dentro da própria classe.
    double altura; // Friendly ou Púbico, apesar de não estar explicitado, ele também é visivel.

    public void exibirDados() {
        System.out.println(" ... Dados da pessoa ... ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura (m): "+ altura);
   }
}


package com.mycompany.poo.aula10.aula11;

public class Pessoa {
    /**
     * Encapsulamento(Métodos Acessories/Modificadores)
     *
     * Em projetos em grande escala, paramantermos a segurança de nossas classes,
     * Utilizamos o modificador de acesso privado, com uma maior frequência.
     *
     * Em muitas situações precisamos buscar e alterar uma ou mais informações,
     * e é nesse cenário que utilizamos os métodos:
     * -Getter:acessar/buscar
     * -Setter:modificar/alterar
     */

     private String nome;
     private int Idade;
     private double Salario;
     private double Altura;

     // declaramos sempre após a declaração dos atributos

     //Método acessor, sempre começa com get
     public String getNome() {
        return nome;
     }

     //método modificador, sempre começa com set
     public void setNome(String nome) {
        this.nome = nome;
     }

      //Método acessor, sempre começa com get
     public int getIdade() {
        return Idade;
     }

     //método modificador, sempre começa com set
     public void setIdade(int idade) {
        this.Idade = Idade;
     }

      //Método acessor, sempre começa com get
     public double getSalario() {
        return Salario;
     }

     //método modificador, sempre começa com set
     public void setSalario(double Salario) {
        this.Salario = Salario;
     }

      //Método acessor, sempre começa com get
     public double getAltura() {
        return Altura;
     }

     //método modificador, sempre começa com set
     public void setAltura(double Altura) {
        this.Altura = Altura;
     }

}

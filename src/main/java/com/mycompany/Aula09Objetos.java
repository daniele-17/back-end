package com.mycompany;

public class Aula09Objetos {

    public static void main(String[] args) {
      /*
       * Em java, toda classe ou tipo abstrato é um objeto, pois possuem caracteristicas
       * e funcionalidades
       * 
       * Eles herdam funcoes da classe mae java. lang.Object, e correto afirmar que java. lang.object e uma super classe
       * de qualquer outra classe ou tipo abstrato.
       */
       Integer numero = 10; // Tipo abstrato
       int numero2 = 10; // Tipo primitivo

       // Retorna se a variavel/classe e uma instancia de outra classe
       System.out.println(numero instanceof Object);

       // Metodo compareTo pertence ao tipo abstrato Integer
       numero.compareTo(numero2);

       // Instanciado uma classe 
       Carro carro = new Carro(:"Celta", :"Chevrolet");
       carro.andar(:60);
       carro.parar();

       Carro carro2 = new Carro(:"Celta", :"Chevrolet");
     
       System.out.println(carro == carro2);

       System.out.println(carro instanceof Carro);
       System.out.println(carro instanceof Object);
      }

      /*
       * Criando uma classe dentro de outra classe
       *  
       * é necessário utilizar a instrução static
       * entre public e classe
       */
      public static class Carro {
        // Atributos
        String modelo;
        String marca;
        int ano;
        int quilometragem = 0;

        /**
         * Método construtor
         * 
         * ele é chamado quando criamos uma nova instancia
         * da classe
         */
        public Carro(String modelo, String marca) {
          this.modelo = modelo;
          this.marca = marca;
        }

        // Ações de classe
        void andar(int km) {
          this.quilometragem += km;
          System.out.println("O carro está percorrendo" + km + "km");
        }

        void parar() {
          System.out.println(" O veículo parou !! e percorreu um total de " + this.quilometragem + "km");
        }
      }
}
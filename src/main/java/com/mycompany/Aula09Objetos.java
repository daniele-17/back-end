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


    }
}
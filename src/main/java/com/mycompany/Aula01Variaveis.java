package com.mycompany;

public class Aula01Variaveis {

    public static void main(String[] args) {
        // Varíavel logica

        // Tipo primitivo
        boolean valorLogicoPrimitivo = true;
        // Exibir o valor
        System.out.println(valorLogicoPrimitivo);

        // Tipo abstrato
        boolean valorLogicoAbstrato = false;
        // Exibe o texto
        System.out.println(" O valor da variavel valorLogicoAbstrato é: " + valorLogicoPrimitivo);

        // Variaveis inteiras

        // Tipo primitivo
        int valorInteiro = 10; // 32bits
        long valorInteiroLogo = 10L; // 64bits

        // Tipo abstrato
        Integer valorInteirosAbs = 20;
        Long valorLongosAbs = 20L;

        System.out.println(" O valor de valorInteiro é: " + valorInteiro + ", e o valor de valorInteiroLongo é: " + valorInteiroLogo);

        // Variaveis Decimais

        // Tipo primitivo
        float numerofloat = 10.5f; //32bits
        double numeroDouble = 10.5; //64bits

        //Tipo abstrato
        Float numeroFloatAbs = 10.5f;
        Double numerodDouble = 10.5;

        System.out.println(" O valor de numeroFloat é:" + numerofloat + ", e o valor de numeroDouble é:" + numeroDouble);
        
    }
}

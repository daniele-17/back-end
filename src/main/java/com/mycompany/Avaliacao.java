package com.mycompany;

public class Avaliacao {

    public static void main(String[] args) {
    
       1) // Idades dos membros da família
        int pai = 46;
        int mãe = 45;
        int filho = 20;
        int filha = 9;

        // Culculando a média
        double mediaIdade = (pai + mãe + filho + filha) / 4.0;

        // Exibindo o resultado
        System.out.println(" A média de idade da família é:"  + mediaIdade + " anos.");
    }


        2) public class CalculoRaioCirculo {
            public static void main(String[] args) {
                // Definir a área do círculo
                double area = 25.0;
        
                // Usar o valor de PI (pode ser 3.14 ou Math.PI)
                double pi = Math.PI;
        
                // Calculando o raio com a fórmula A = π * r², logo r = √(A / π)
                double raio = Math.sqrt(area / pi);
        
                // Exibindo o resultado
                System.out.println("O raio do círculo com área de " + area + " cm² é: " + raio + " cm.");
            }


        3)public class CalculoRaioCirculo {
            public static void main(String[] args) {
                // Definir a área do círculo
                double area = 25.0;
        
                // Usar o valor de PI (pode ser 3.14 ou Math.PI)
                double pi = Math.PI;
        
                // Calculando o raio com a fórmula A = π * r², logo r = √(A / π)
                double raio = Math.sqrt(area / pi);
        
                // Exibindo o resultado
                System.out.println("O raio do círculo com área de " + area + " cm² é: " + raio + " cm.");
            }
              
      4)public class DescontoProduto {
                    public static void main(String[] args) {
                        // Definir o preço inicial do produto
                        double precoInicial = 850.00;
                
                        // Definir o percentual de desconto
                        double percentualDesconto = 30.0;
                
                        // Calcular o valor do desconto
                        double desconto = (percentualDesconto / 100) * precoInicial;
                
                        // Calcular o novo preço após o desconto
                        double novoPreco = precoInicial - desconto;
                
                        // Exibir o resultado
                        System.out.println("Preço inicial: R$ " + precoInicial);
                        System.out.println("Desconto de " + percentualDesconto + "%: R$ " + desconto);
                        System.out.println("Novo preço do produto: R$ " + novoPreco);
      
    
}
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar altura
        System.out.print("Digite sua altura em metros (exemplo 1.75): ");
        double altura = scanner.nextDouble();

        // Solicitar peso
        System.out.print("Digite seu peso em kg (exemplo 70.5): ");
        double peso = scanner.nextDouble();

        // Calcular IMC
        double imc = peso / (altura * altura);

        // Exibir o IMC
        System.out.printf("Seu IMC é: %.2f\n", imc);

        // Classificação do IMC
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

        scanner.close();
    }
}
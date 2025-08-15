package com.mycompany.avaliacao;

import com.mycompany.avaliacao.ContaBancaria;

public class App {
    public static void main(String[] args) {
        // Crie duas contas para demonstração
        ContaBancaria conta1 = new ContaBancaria(1001, "João Silva");
        ContaBancaria conta2 = new ContaBancaria(2002, "Maria Oliveira");

        System.out.println("--- Criando Contas ---");
        System.out.println("Conta 1: " + conta1.getTitular());
        System.out.println("Conta 2: " + conta2.getTitular());
        System.out.println("---------------------\n");

        // Realizar Depósitos
        System.out.println("--- Depósitos ---");
        conta1.depositar(500.0);
        conta2.depositar(250.0);
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        System.out.println("-----------------\n");

        // Realizar Saques
        System.out.println("--- Saques ---");
        conta1.sacar(150.0);
        conta2.sacar(300.0); // Este saque deve falhar, pois o saldo é insuficiente
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        System.out.println("----------------\n");

        // Realizar Transferência
        System.out.println("--- Transferência ---");
        conta1.transferir(conta2, 100.0);
        conta1.mostrarSaldo();
        conta2.mostrarSaldo();
        System.out.println("---------------------\n");

        // Mostrar Extratos
        conta1.mostrarExtrato();
        conta2.mostrarExtrato();

        // Tentar Fechar Conta (com saldo)
        System.out.println("--- Tentativa de Fechar Conta 2 com Saldo ---");
        conta2.fecharConta();

        // Fechar Conta (com saldo zerado)
        System.out.println("\n--- Fechando Conta 1 (Saldo não zerado) ---");
        conta1.mostrarSaldo();
        conta1.sacar(250.0); // Saca o saldo restante para zerar a conta
        conta1.mostrarSaldo();
        conta1.fecharConta(); // Agora deve fechar com sucesso
    }
}
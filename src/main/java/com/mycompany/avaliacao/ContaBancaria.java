package com.mycompany.avaliacao;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    private List<String> extrato;

    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
        this.extrato = new ArrayList<>();
        this.extrato.add("Conta criada.");
    }

    // Getters para acessar as informações da conta
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos para as operações bancárias

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            this.extrato.add("Depósito de R$" + valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.extrato.add("Saque de R$" + valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Erro: Saque não permitido. Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    public boolean transferir(ContaBancaria destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            this.extrato.add("Transferência de R$" + valor + " para conta " + destino.getNumero());
            System.out.println("Transferência de R$" + valor + " para " + destino.getTitular() + " realizada com sucesso.");
            return true;
        } else {
            System.out.println("Erro: Transferência não realizada. Saldo insuficiente.");
            return false;
        }
    }

    public boolean fecharConta() {
        if (this.saldo == 0) {
            this.extrato.add("Conta fechada.");
            System.out.println("Conta " + this.numero + " fechada com sucesso.");
            return true;
        } else {
            System.out.println("Erro: Não é possível fechar a conta. O saldo deve estar zerado.");
            return false;
        }
    }

    public void mostrarExtrato() {
        System.out.println("\n--- Extrato da Conta " + this.numero + " ---");
        for (String operacao : extrato) {
            System.out.println(operacao);
        }
        System.out.println("Saldo atual: R$" + this.saldo);
        System.out.println("------------------------------------");
    }

    public void mostrarSaldo() {
        System.out.println("Saldo da conta " + this.numero + ": R$" + this.saldo);
    }
} 
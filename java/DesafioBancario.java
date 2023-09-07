package java;

import java.util.Scanner;

public class DesafioBancario {
     static float saldoAtual =0;
     static float valorSaque =0;
     static float valorDeposito=0;

    public static void main(String[] args) {

        Scanner leitorDeEntradas = new Scanner(System.in);

        saldoAtual = leitorDeEntradas.nextFloat();
        valorSaque = leitorDeEntradas.nextFloat();
        valorDeposito = leitorDeEntradas.nextFloat();

       depositar(saldoAtual, valorDeposito);
       sacar(saldoAtual, valorSaque);

        imprimir();
        leitorDeEntradas.close();

    }

    public static void depositar(float saldoAtual, float valorDeposito) {
        saldoAtual = saldoAtual + valorDeposito;
    }

    public static void sacar(float saldoAtual, float valorSaque) {
        saldoAtual = saldoAtual - valorSaque;
    }

    public static void imprimir() {
        System.out.println(String.format("%s", "%.2f", "Saldo atual ", saldoAtual));
    }

}

/**
 * 
 * Descrição
 * Para esse desafio, considere que você foi contratado por uma empresa bancária
 * para auxiliar nas implementações e melhorias do sistema empresarial. Em uma
 * análise inicial, foi identificado pela equipe financeira a necessidade de
 * desenvolver uma solução que permita ao cliente equilibrar seu saldo bancário.
 * Dessa forma, o programa deve solicitar uma entrada que representa o saldo
 * atual do funcionário, e após, seja informado o valor de duas transações,
 * sendo elas: um depósito e um saque. O programa deve atualizar o saldo com
 * base nas transações e exibir o saldo final.
 * 
 * Informação: As transações de depósito e retirada devem ser tratadas como
 * valores positivos e negativos, respectivamente, para garantir que o cálculo
 * do saldo final seja realizado corretamente.
 * 
 * 
 * Entrada
 * saldoAtual: um número decimal representando o saldo atual da conta bancária.
 * valorDeposito: um número decimal representando o valor a ser depositado na
 * conta.
 */
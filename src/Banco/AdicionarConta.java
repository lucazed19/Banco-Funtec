package Banco;

import java.util.Scanner;

import contas.ContaCorrente;
import contas.ContaPoupanca;

public class AdicionarConta {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ContaCorrente cc;
		ContaPoupanca cp;
		
		System.out.println("Bem-Vindo a Criação da Sua Conta Bancária");
		System.out.println("Em qual agência abrirá sua conta?");
		String agencia = scan.next();
		
		System.out.println("Digite 1 para criar uma CONTA CORRENTE");
		System.out.println("Digite 2 para criar uma CONTA POUPANÇA");
		int opcao = scan.nextInt();
		
		if (opcao == 1) {
			cc = new ContaCorrente(agencia, "Conta Corrente");
		} else {
			cp = new ContaPoupanca(agencia, "Conta Poupança");
		}
		
		System.out.println();
		
	}
}

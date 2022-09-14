package Banco.metodos;

import java.util.Scanner;

import contas.Contas;

public class OperarConta{
	public void operarConta(Contas conta){
		Scanner scan = new Scanner(System.in);
		String opcao="";
		
		while(!opcao.equals("5")) {
			System.out.println("Qual operação deseja realizar em sua conta?");
			System.out.println("Sacar (1)  -  Depositar (2)  -  Transferir (3)  -  Imprimir Extrato (4)  -  Sair (5)");
			opcao = scan.next();
			switch (opcao) {
			case "1":
				System.out.println("\nDigite a quantidade para sacar: ");
				double valorSaque = scan.nextDouble();
				if(valorSaque <= conta.getSaldo()) {
					conta.sacar(valorSaque);					
				}else System.out.println("Saldo inválido");
				break;
			case "2":
				System.out.println("\nDigite a quantidade para depositar: ");
				double valorDeposito = scan.nextDouble();
				conta.depositar(valorDeposito);
				break;
			case "3":
				System.out.println("\nDigite o valor da Transferência: ");
				double valorTransferencia = scan.nextDouble();
				System.out.println("Digite o número da conta a transferir: ");
				int contaTransferencia = scan.nextInt();
				conta.transferir(valorTransferencia, conta);
				break;
			case "4":
				conta.imprimirExtrato();
				break;
			case "5":
				System.out.println("Obrigado, até a próxima");
				break;
			default:
				System.out.println("Comando inválido!! Favor selecionar outra operação");
				break;
			}
		}		
	}

}

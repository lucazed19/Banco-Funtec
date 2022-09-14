package Banco;

import java.util.Scanner;

import Banco.metodos.AdicionarConta;
import Banco.metodos.OperarConta;
import contas.Contas;

public class Banco {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AdicionarConta addConta = new AdicionarConta();
		OperarConta opConta = new OperarConta();
		String operacao = "0";
		Contas[] conta = new Contas[100];
		
		while(!operacao.equals("3")) {			
			System.out.println("Deseja Realizar alguma operação?");
			System.out.println("Abrir Conta (1)  -  Operar Conta (2)  -  Sair (3)");
			operacao = scan.next();
			switch (operacao) {
			case "1":
				for (int i = 0; i <conta.length; i++) {
					if (conta[i] == null) {
						conta[i] = addConta.adicionarConta();
						break;
					}
				}
				break;
				
			case "2":
				if (conta[0] == null) {
					System.out.println("Nenhuma conta existente, crie uma!\n");
				}else {
					System.out.println("Selecione o número da Conta para operar");
					for (int i = 0; i < conta.length; i++) {
						if(conta[i]==null) {
							break;
						}
						System.out.print(conta[i].getNumero());
						System.out.println("  - Titular: "+conta[i].getTitular());
					}
					int selecionarConta = scan.nextInt();
					opConta.operarConta(conta[selecionarConta]);
				}
				break;
				
			case "3":
				System.out.println("Tenha um bom-dia, obrigado pela presença");
				break;
			default:
				System.out.println("Operação inexistente, digite outra!!\n");
				break;
			}
		}
	}	
}

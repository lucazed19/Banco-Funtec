package contas;

public class Contas implements IContas{
	private static int SEQUENCIA = 0;
	protected String agencia;
	protected int numero;
	protected double saldo = 0;
	protected String tipo;
	
	public Contas(String agencia, String tipo) {
		this.numero = SEQUENCIA++;
		this.agencia = agencia;
		if (tipo =="Corrente") {
			this.tipo = "Conta Corrente";
		} else if(tipo =="Poupança") {
			this.tipo = "Conta Poupança";
		}
	}
	
	public String getTipo() {
		return tipo;
	}


	public String getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void transferir(double valor, Contas contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void imprimirExtrato() {
		System.out.println("Agencia: "+ this.agencia);
		System.out.println("Numero: "+ this.numero);
		System.out.println("Saldo: "+ this.saldo);
	}
	
}

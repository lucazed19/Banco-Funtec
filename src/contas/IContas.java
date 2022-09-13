package contas;

public interface IContas {
	public void sacar(double valor);
	
	public void depositar(double valor);
	
	public void transferir(double valor, Contas contaDestino);
	
	public void imprimirExtrato();
}

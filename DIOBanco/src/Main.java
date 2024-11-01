
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Frank Santos");
		
		Conta cc = new ContaCorrente(cliente);
		Conta cp = new ContaPoupanca(cliente);

		cc.depositar(500.0);
		cc.transferir(2100.5, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

		cc.imprimirInfosComuns();
	}

}

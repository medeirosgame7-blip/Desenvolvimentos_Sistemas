package contaBancaria;

public class Principal {

	public static void main(String[] args) {

		ContaBancaria cliente1 = new ContaBancaria();

		cliente1.setNumeroConta(1335454445);
		cliente1.setNomeCliente("Geraldo Fransico");
		cliente1.setSaldo(15000.90);

		cliente1.exibirConta();

		ContaBancaria cliente2 = new ContaBancaria();

		cliente2.setNumeroConta(1335454445);
		cliente2.setNomeCliente("Geraldo Fransico");
		cliente2.setSaldo(15000.90);

		cliente2.exibirConta();
		
	}
	
}

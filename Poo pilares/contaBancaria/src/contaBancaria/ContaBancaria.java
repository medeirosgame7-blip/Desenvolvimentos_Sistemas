package contaBancaria;

public class ContaBancaria {
	private int numeroConta;
	private String nomeCliente;
	private double saldo;

	public ContaBancaria() {

	}

	public ContaBancaria(int numeroConta, String nomeCliente, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		} else {
			System.out.println("Saldo insuficiente");
		}

	}

	public void exibirConta() {
		System.out.println("Identificação da conta: " + numeroConta);
		System.out.println("Nome do cliente: " + nomeCliente);
		System.out.printf("Seu saldo é de: R$%.2f", saldo);
	}

}

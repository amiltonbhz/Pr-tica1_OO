package br.com.conta;

public class Main {

	public static void main(String[] args) {
		Conta cp = new ContaPoupanca(0);
		cp.setSaldo(2021);
		cp.imprimeExtrato();
	}

}

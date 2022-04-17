package br.com.conta;
import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class Conta {
	private double saldo;


	public Conta(double saldo) {
		this.saldo = saldo;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void imprimeExtrato() {
	
	}

}
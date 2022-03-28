package br.com.carnaval;

public class VIP extends Ingresso {
	private float valorAdicional;
	
	//CONSTRUCTOR
	public VIP (float valorIngresso, float valorAdicional) {
		super (valorIngresso);
		this.valorAdicional = valorAdicional;
		
	}
	
	//GETTERS AND SETTERS
	public float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	
	//METHODS
	public void imprimeIngressoVIP() {
		System.out.println("Ingresso VIP:");
		System.out.printf("Valor do ingresso: %.2f ", getValorIngresso() + valorAdicional);
	}

}

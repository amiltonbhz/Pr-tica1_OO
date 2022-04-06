package br.com.carnaval;

public class Camarote extends Ingresso {
	private float valorAdicional;
	private String camarote;

	
	//CONSTRUCTOR
	public Camarote(float valorIngresso, float valorAdicional, String camarote) {
		super(valorIngresso);
		this.valorAdicional = valorAdicional;
		this.camarote = camarote;
	}

	//GETTERS AND SETTERS
	public float getValorAdicional() {
		return valorAdicional;
	}


	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}


	public String getCamarote() {
		return camarote;
	}

	
	public void setCamarote(String localidade) {
		this.camarote = camarote;
	}
	
	//METHODS
	public void imprimeCamarote() {
		System.out.println("Ingresso CAMAROTE:");
		System.out.printf("Valor do ingresso: %.2f \n", getValorIngresso() + valorAdicional);
		System.out.println("Localização: "+ getCamarote());
	}
	

}

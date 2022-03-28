package br.com.carnaval;

public class Camarote extends Ingresso {
	private float valorAdicional;
	private String localidade;

	
	//CONSTRUCTOR
	public Camarote(float valorIngresso, float valorAdicional, String localidade) {
		super(valorIngresso);
		this.valorAdicional = valorAdicional;
		this.localidade = localidade;
	}

	//GETTERS AND SETTERS
	public float getValorAdicional() {
		return valorAdicional;
	}


	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}


	public String getLocalidade() {
		return localidade;
	}

	
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	
	//METHODS
	public void imprimeCamarote() {
		System.out.println("Ingresso CAMAROTE:");
		System.out.printf("Valor do ingresso: %.2f \n", getValorIngresso() + valorAdicional);
		System.out.println("Localização: "+ getLocalidade());
	}
	

}

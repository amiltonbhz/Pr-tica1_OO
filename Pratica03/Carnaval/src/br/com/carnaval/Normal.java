package br.com.carnaval;

public class Normal extends Ingresso{
	public Normal (float valorIngresso) {
		super (valorIngresso);
	}
		
		public void imprimeIngresso() {
			System.out.println("Ingresso normal:");
			System.out.printf("Valor do ingresso:%.2f ", getValorIngresso());
		}
}
		

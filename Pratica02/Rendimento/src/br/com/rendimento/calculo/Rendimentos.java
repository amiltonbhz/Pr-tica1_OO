package br.com.rendimento.calculo;

public class Rendimentos {
	private float investimentoInicial;
	private float taxaMes;
	private int numeroMeses;
	/**
	 * @param investimentoInicial
	 * @param taxaMes
	 * @param numeroMeses
	 */
	public Rendimentos(float investimentoInicial, float taxaMes, int numeroMeses) {
		this.investimentoInicial = investimentoInicial;
		this.taxaMes = taxaMes;
		this.numeroMeses = numeroMeses;
	}
	
	
	public float getInvestimentoInicial() {
		return investimentoInicial;
	}


	public void setInvestimentoInicial(float investimentoInicial) {
		this.investimentoInicial = investimentoInicial;
	}


	public float getTaxaMes() {
		return taxaMes;
	}


	public void setTaxaMes(float taxaMes) {
		this.taxaMes = taxaMes;
	}


	public int getNumeroMeses() {
		return numeroMeses;
	}


	public void setNumeroMeses(int numeroMeses) {
		this.numeroMeses = numeroMeses;
	}


	public void verficaCarga() {
		System.out.println();
		System.out.println("REGISTRO DO INVESTIMENTO");
		System.out.println("------------------------");
		System.out.println("Inicial: "+this.investimentoInicial);
		System.out.println("Taxa mensal: "+this.taxaMes);
		System.out.println("Número de meses: "+this.numeroMeses);
		
	}
	
	public void calculaRendimentos(){
		
		int i = 1;
		int meses = this.getNumeroMeses();
		float valor = this.getInvestimentoInicial();
		
		
		System.out.println("\nPROJEÇÃO DE RENDA - "+meses+ " Meses");
		System.out.println("----------------------------");
		
		while(i<=meses) {
			valor = valor + (valor*2/100);
			System.out.printf("Mês %d",i);
			System.out.printf(": %.2f",valor);
			System.out.println();
			
			i++;
		}
	}
}

			

	


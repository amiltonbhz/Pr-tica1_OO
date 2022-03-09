package br.com.loja.estoque;

public class Main {

	public static void main(String[] args) {

		Estoque estoque = new Estoque("Caneta", 20, 3);

		// Teste 1 - MOSTRAR ESTOQUE
		System.out.println("----------------------------------------");
		System.out.println("      TESTE 1 - MOSTRAR ESTOQUE");
		System.out.println("----------------------------------------");
		estoque.mostra();
		System.out.println();


		
		
		// Teste 2 - REPOR ESTOQUE - FALSO
		System.out.println("----------------------------------------");
		System.out.println("    TESTE 2 - REPOR ESTOQUE - FALSO");
		System.out.println("----------------------------------------");
		if (estoque.precisaRepor() == true) {
			System.out.println("Estoque atual está abaixo do mínimo.");
		} else {
			System.out.println("Não é necessário repor estoque.");
		}
		System.out.println();


		// Teste 3 - DAR BAIXA - TRUE
		System.out.println("----------------------------------------");
		System.out.println("   TESTE 3 - DAR BAIXA - POSSÍVEL");
		System.out.println("----------------------------------------");
		estoque.darBaixa(16);
		System.out.println();

		
		//Teste 4 - DAR BAIXA - FALSE
		System.out.println("----------------------------------------");
		System.out.println("    TESTE 4 - DAR BAIXA - IMPOSSÍVEL");
		System.out.println("----------------------------------------");
		estoque.darBaixa(8);
		System.out.println();

		
		//Teste 5 - PRECISA REPOR - FALSE
		System.out.println("----------------------------------------");
		System.out.println("      TESTE 5 - PRECISA REPOR - NAO");
		System.out.println("----------------------------------------");
		if (estoque.precisaRepor() == true) {
			System.out.println("Estoque atual está abaixo do mínimo.");
		} else {
			System.out.println("Não é necessário repor estoque.");
		}
		System.out.println();

		
		//Teste 6 - PRECISA REPOR - TRUE
		System.out.println("----------------------------------------");
		System.out.println("      TESTE 5 - PRECISA REPOR - SIM");
		System.out.println("----------------------------------------");
		
		estoque.darBaixa(2);
		
		if (estoque.precisaRepor() == true) {
			System.out.println("Estoque atual está abaixo do mínimo.");
		} else {
			System.out.println("Não é necessário repor estoque.");
		}
		
	}
}

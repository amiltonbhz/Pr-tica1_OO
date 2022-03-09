package br.com.loja.estoque;

public class Estoque {
	private String nome;
	private int qtdAtual;
	private int qtdMinima;
	/**
	 * @param nome
	 * @param qtdAtual
	 * @param qtdMinima
	 */
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}
	
	//Métodos
	
	
	public void darBaixa(int qtde) {
		if (this.qtdAtual - qtde >0) {
			this.qtdAtual = this.qtdAtual-qtde;
			System.out.println ("Baixa feita com sucesso");
			System.out.println("O estoque atual é: "+this.qtdAtual);
		} else {
			System.out.println("Estoque insuficiente para baixa.");
		}
	}
	
	public void mostra() {
		System.out.println("Nome do produto: "+this.nome);
		System.out.println("Quantidade mínima: "+this.qtdMinima);
		System.out.println("Quantidade atual: "+this.qtdAtual);
		
	}
	
	public boolean precisaRepor(){
		if (this.qtdAtual<=this.qtdMinima) {
			return true;
			
		} else { 
			return false;
		}
		
	}
}

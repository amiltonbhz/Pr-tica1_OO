package br.com.concecionaria;

public class Transacao {
	String codCarro;
	double valorCompra;
	double valorVenda;
	double valorEntrada;
	double valorFinanciado;
	int numParcelas;
	float taxaFinanciamento;
	double valorParcela;
	
	//Construtor
	Transacao(String codC, double valorC, double valorV, double valorE, double valorF, int numP, float taxaF, double valorP){
		valorCompra = valorC;
		valorVenda = valorV;
		valorEntrada = valorE;
		valorFinanciado = valorF;
		numParcelas = numP;
		taxaFinanciamento = taxaF;
		valorParcela = valorP;
	}
	

}

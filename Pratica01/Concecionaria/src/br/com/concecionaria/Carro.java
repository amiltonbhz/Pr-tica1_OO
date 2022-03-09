package br.com.concecionaria;

public class Carro {
	String modelo;
	int anomodelo;
	String fabricante;
	int portas;
	String chassi;
	float precoFip;
	float precoVenda;

//Construtor
	Carro(String modeloCarro, int anoModeloCarro, int numPortas, String chassiCarro, float pFip, float pvenda, String fabCarro) {
		modelo = modeloCarro;
		anomodelo = anoModeloCarro;
		fabricante = fabCarro;
		portas = numPortas;
		chassi = chassiCarro;
		precoVenda = pvenda;
		precoFip = pFip;
	}
}

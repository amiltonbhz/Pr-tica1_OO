package br.com.veiculo;

public class Main {

	public static void main(String[] args) {
		Veiculo carro1 = new Veiculo("ZAB-4613", 2008);
		carro1.exibirDados();
		
		Onibus onibus1 = new Onibus("ZAB-4614", 2009, 44);
		onibus1.exibirDados();
		
		Caminhao caminhao1 = new Caminhao("ZAB-4614", 2009, 2);
		caminhao1.exibirDados();
		
		
		
	}

}
	
		

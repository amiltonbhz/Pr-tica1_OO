package br.com.cookinng.lazagna;

public class Main {

	public static void main(String[] args) {
		
		// Instanciação
		Lazanha lazanha = new Lazanha();
		
		System.out.println("Tempo estimado de preparo: "+lazanha.tempoEstimadoForno() +" Mins.");
		System.out.println("Tempo restante no forno (após 30 mins): "+lazanha.tempoAteTermino(30) + " Mins.");
		System.out.println("Tempo de preparo (2 camadas): "+lazanha.tempoPreparoMinutos(2) + " Mins.");
		System.out.println("Tempo até o cozimento (3 camadas, após 20 Mins): "+lazanha.tempoTotalMinutos(3, 20) + " Mins.");
	}

}

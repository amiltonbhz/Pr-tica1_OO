package br.com.eltonscar;

public class Main {

	public static void main(String[] args) {
		int i=1;
		
		System.out.println("Estado inicial do carro.");
		ElonsCar carro = new ElonsCar();
		
		
		System.out.println(carro.mostrarDistancia());
		System.out.println(carro.mostrarBateria());
		System.out.println();
		
		System.out.println("Depois de andar com o carro 2 vezes.");
		carro.dirigir();
		carro.dirigir();
		System.out.println(carro.mostrarDistancia());
		System.out.println(carro.mostrarBateria());
		System.out.println();
		
		
	//Esgotando a bateria do carro
		while(i<99) { 
			carro.dirigir();
			i++;
			}
		
		System.out.println("Tentando dirigir sem bateria.");
		carro.dirigir();
		System.out.println(carro.mostrarDistancia());
		System.out.println(carro.mostrarBateria());
		System.out.println();

	}

}

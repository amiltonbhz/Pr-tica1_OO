package br.com.folha;

public class Main {

	public static void main(String[] args) {
		Fpadrao f1 = new Fpadrao(123, "Pedro Bosta", 1230.23);
		System.out.print(f1.toString());
		
		Fcomissionado f2 = new Fcomissionado(143, "Maria Tonta", 5312.74, 4, 170.80);
		System.out.println(f2.toString());
		
		FProdutividade f3 = new FProdutividade (158, "José Perdido", 2803.59, 3, 520);
		System.out.print(f3.toString());
			
	}

}

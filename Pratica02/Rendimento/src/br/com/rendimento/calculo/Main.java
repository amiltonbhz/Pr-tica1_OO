package br.com.rendimento.calculo;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		float investIn, taxaMes;
		int numMes;

	//ENTRADAS
		System.out.printf("Digite o valor inicial a ser investido: ");
		investIn = sc.nextFloat();
		System.out.printf("Digite a taxa de rendimento mensal: ");
		taxaMes = sc.nextFloat();
		System.out.printf("Digite o número de meses: ");
		numMes = sc.nextInt();
		
	//INSTANCIAÇÃO E CARGA
		Rendimentos investimento1 = new Rendimentos(investIn, taxaMes, numMes);
		
	//VERIFICA CARGA
		investimento1.verficaCarga();
		
	//CALCULA RENDIMENTOS
		investimento1.calculaRendimentos();
		
	
	}

}

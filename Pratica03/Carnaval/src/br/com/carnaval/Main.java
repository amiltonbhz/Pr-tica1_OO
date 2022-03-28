package br.com.carnaval;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int op=0;
		Scanner sc = new Scanner(System.in);
		
		do { 
			System.out.println(" \nEmissão de Ingresso: ");
			System.out.println("---------------------");
			System.out.println("1 - Ingresso normal");
			System.out.println("2 - Ingresso VIP");
			System.out.println("3 - Camarote");
			System.out.println("4 - Sair");
			System.out.println("---------------------");
			System.out.printf("Digite a opção: ");
			op = sc.nextInt();
			
			switch (op) {
			
			case 1:
				Normal ingressoN = new Normal(200);
				ingressoN.imprimeIngresso();
				System.out.println();
				break;
				
			case 2:
				VIP vipN = new VIP(200, 200);
				vipN.imprimeIngressoVIP();
				System.out.println();
				break;
				
			case 3:
				Camarote camaroteN = new Camarote(200, 300, "Camarote 01");
				camaroteN.imprimeCamarote();
				System.out.println();
				break;
			
			case 4:
				System.out.println("Saindo do sistema.");
				break;
			
			default:
				System.out.println("\nOpção inválida. Tente novamente\n\n");
			}
		} while (op!=4);
	}
}

	


package br.com.carnaval;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int op = 0;
		float valorNormal = 0;
		float valorAdicional = 0;
		String camarote;
		
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
				System.out.printf("Digite o valor do ingresso: ");
				valorNormal = sc.nextFloat();
				
				Normal ingressoN = new Normal(valorNormal);
				ingressoN.imprimeIngresso();
				System.out.println();
				break;
				
			case 2:
				System.out.printf("Digite o valor BASE do ingresso: ");
				valorNormal = sc.nextFloat();
			
				System.out.printf("Digite o valor ADICIONAL: ");
				valorAdicional = sc.nextFloat();
				
				VIP vipN = new VIP(valorNormal, valorAdicional);
				vipN.imprimeIngressoVIP();
				System.out.println();
				break;
				
			case 3:
				System.out.print("Digite o valor BASE do ingresso: ");
				valorNormal = sc.nextFloat();
			
				System.out.print("Digite o valor ADICIONAL: ");
				valorAdicional = sc.nextInt();
				
				System.out.print("Digite o CAMAROTE: ");
				camarote = sc.next();
								
				Camarote camaroteN = new Camarote(valorNormal, valorAdicional, camarote);
				System.out.println();
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

	


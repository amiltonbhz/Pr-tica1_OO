package br.com.automovel;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner (System.in);
        int op=5;
        
        float precoBase;
        int desconto;
        boolean abs=false, airbag=false, alarme=false, som=false, conjuntoEletrico=false, computadorBordo=false;
        final int MaxCars = 100;
        int contaCarros = 0;

        
        Popular [] Vetor_carros = new Popular [MaxCars];
        
        while (op !=3) {
            System.out.println ("   CONCESSION�RIA TABAJARA");
            System.out.println ("-----------------------------");
            System.out.println ("1 - Cadastrar carro");
            System.out.println ("2 - Calcular pre�o");
            System.out.println ("3 - Sair");
            System.out.println ("-----------------------------");
            System.out.print("Digite a op��o: ");
            
            op = sc.nextInt();
        	switch (op) {
        	case 1:
                System.out.println("\n\n   CADASTRO DE AUTOM�VEL:");
                System.out.println("------------------------------");

                System.out.print("Digite o valor BRUTO: ");
                precoBase = sc.nextFloat(); 
                
                System.out.print("Percentual de DESCONTO: ");
                desconto = sc.nextInt();        
                
                System.out.println("------------------------------");
                System.out.println("\n   ADICIONAR ACESS�RIO  \n       1 - SIM\n       0 - N�O");
                System.out.println("------------------------------");

                
                System.out.printf("ABS: \t\t\t| ");
                op = sc.nextInt();
                if (op==1){
                	abs = true;
                }

                System.out.printf("AirBag: \t\t| ");
                op = sc.nextInt();
                if (op==1){
                	airbag = true;
                }

                System.out.printf("Alarme: \t\t| ");
                op = sc.nextInt();
                if (op==1){
                	alarme=true;
                }

                System.out.printf("Som: \t\t\t| ");
                op = sc.nextInt();
                if (op==1){
                	som=true;

                }
                System.out.printf("Conjunto El�trico: \t| ");
                op = sc.nextInt();
                if (op==1){
                	conjuntoEletrico=true;

                }
                System.out.printf("Computador de Bordo: \t| ");
                op = sc.nextInt();
                if (op==1){
                	computadorBordo=true;
                }
                Vetor_carros[contaCarros] = new Popular(abs, airbag, alarme, som, conjuntoEletrico, computadorBordo, precoBase, desconto);
                contaCarros++;
                System.out.println("Cadastro realizado com sucesso na posi��o "+contaCarros+"\n\n");
        		break;
        		
        	case 2:
        		break;
        	
        	case 3:
        		System.out.println("Execu��o finalizada.");
        		break;
        	
        	default: System.out.println("Op��o Inv�lida. Escolha novamente.");
        	}
        }
        
       

   //     Popular carro1 = new Popular(abs, airbag, alarme, som, conjuntoEletrico, computadorBordo, precoBase);
 //       carro1.calcularPrecoFinal(abs, airbag, alarme, som, conjuntoEletrico, precoBase,desconto);

        sc.close();
    }
 }
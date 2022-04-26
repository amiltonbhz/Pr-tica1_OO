package br.com.automovel;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner (System.in);
        int op=5;
        int reg=0;
       
        
        float precoBase = 0;
        int desconto=0;
        boolean abs=false, airbag=false, alarme=false, som=false, conjuntoEletrico=false, computadorBordo=false;
        final int MaxCars = 100;
        int contaCarros = 0;

        
        Popular [] Vetor_carros = new Popular [MaxCars];
        
        while (op !=3) {
            System.out.println ("   CONCESSIONÁRIA TABAJARA");
            System.out.println ("-----------------------------");
            System.out.println ("1 - Cadastrar carro");
            System.out.println ("2 - Calcular preço");
            System.out.println ("3 - Sair");
            System.out.println ("-----------------------------");
            System.out.print("Digite a opção: ");
            
            op = sc.nextInt();
        	switch (op) {
        	case 1:
                System.out.println("\n\n   CADASTRO DE AUTOMÓVEL:");
                System.out.println("------------------------------");

                System.out.print("Digite o valor BRUTO: ");
                precoBase = sc.nextFloat(); 
                
                System.out.print("Percentual de DESCONTO: ");
                desconto = sc.nextInt();        
                
                System.out.println("------------------------------");
                System.out.println("\n   ADICIONAR ACESSÓRIO  \n       1 - SIM\n       0 - N�O");
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
                System.out.printf("Conjunto Elétrico: \t| ");
                op = sc.nextInt();
                if (op==1){
                	conjuntoEletrico=true;

                }
                System.out.printf("Computador de Bordo: \t| ");
                op = sc.nextInt();
                if (op==1){
                	computadorBordo=true;
                }
                
                Vetor_carros[contaCarros] = new Popular(abs, airbag, alarme, som, conjuntoEletrico, computadorBordo, precoBase,desconto);
                contaCarros++;
                System.out.println("\nCadastro realizado. \nREGISTRO: "+contaCarros+"\n\n");
        		break;
        

        	case 2:
            System.out.println("\n\n--------- CONSULTA DE PREÇOS --------------");
            if (contaCarros==0){
                System.out.println("INFO: \tNão há carros registrados. \n\tCadastre um carro.\n\n");
                break;

            }else{
                System.out.printf("\nHá %d carro(s) no sistema.",contaCarros);

               System.out.print("\nDigite o número do registro a consultar: ");
                reg = sc.nextInt()-1;
    

                if (reg>contaCarros-1){
                    System.out.println("INFO: Registro inválido. Tente novamente.\n\n");
                    break;
                }else{
                    Vetor_carros[reg].calcularPrecoFinal(abs, alarme, som, conjuntoEletrico, computadorBordo, precoBase, desconto);
                }
        		break;
        }
        	
        	case 3:
        		System.out.println("Execução finalizada.");
        		break;
        	
        	default: System.out.println("Opção Inválida. Escolha novamente.");
        	}
        }
        sc.close();
    }
 }
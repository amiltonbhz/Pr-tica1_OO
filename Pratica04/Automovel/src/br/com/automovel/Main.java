package br.com.automovel;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner sc = new Scanner (System.in);
        int op;
        float precoBase;
        boolean abs=false, airbag=false, alarme=false, som=false, conjuntoEletrico=false, computadorBordo=false;

       
        System.out.println("CUSTO FINAL DE AUTOMÓVEL:");
        System.out.println("------------------------");

        System.out.print("Digite o valor de base: ");
        precoBase = sc.nextFloat();        
        
        System.out.println("ADICIONAR ACESSÓRIOS?  \n   1 - SIM\n   2 - NÃO");
        System.out.println("-------------------------");

        
        System.out.printf("ABS: ");
        op = sc.nextInt();
        if (op==1){
        	abs = true;
        }

        System.out.printf("AirBag: ");
        op = sc.nextInt();
        if (op==1){
        	airbag = true;
        }

        System.out.printf("Alarme: ");
        op = sc.nextInt();
        if (op==1){
        	alarme=true;
        }

        System.out.printf("Som: ");
        op = sc.nextInt();
        if (op==1){
        	som=true;

        }
        System.out.printf("Conjunto Elétrico: ");
        op = sc.nextInt();
        if (op==1){
        	conjuntoEletrico=true;

        }
        System.out.printf("Computador de Bordo: ");
        op = sc.nextInt();
        if (op==1){
        	computadorBordo=true;
        }    

        Popular carro1 = new Popular(abs, airbag, alarme, som, conjuntoEletrico, computadorBordo, precoBase);
        carro1.calcularPrecoFinal(abs, airbag, alarme, som, conjuntoEletrico, precoBase);

        sc.close();
    }
 }

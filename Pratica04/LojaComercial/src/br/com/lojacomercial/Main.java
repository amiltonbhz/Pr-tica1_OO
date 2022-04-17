package br.com.lojacomercial;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        Scanner sc = new Scanner (System.in);
        int op=0;
        String rg;
        double salario;
        double vendas;
        int horaExtra;

        while (op !=3){
            System.out.println("CÁLCULO DE PAGAMENTO DE FUNCIONÁRIO");
            System.out.println("-----------------------------------");
            System.out.println("1 - Vendedor");
            System.out.println("2 - Administrador");
            System.out.println("3 - Sair");
            System.out.println("-----------------------------------");
            System.out.print ("Digite a opção desejada: ");

            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.printf("Digite o RG do vendedor: ");
                    rg = sc.next();

                    System.out.printf("Digige o Salário base: ");
                    salario = sc.nextDouble();

                    System.out.printf("Digige vendas no mês: ");
                    vendas = sc.nextDouble();

                    Vendedor vendedor1 = new Vendedor (rg, salario, vendas);
                    vendedor1.SalarioTotal();
                    System.out.println();


                break;

                case 2:
                System.out.print("Digite o RG do Administrador: ");
                rg = sc.next();

                System.out.print("Digige o Salário base: ");
                salario = sc.nextDouble();

                System.out.print("Digige o número de horas extras: ");
                horaExtra = sc.nextInt();

                Administrador administrador1 = new Administrador(rg, salario, horaExtra);
                administrador1.SalarioTotal();
                System.out.println();

                break;

                case 3:
                System.out.println("Finalizando a execução.");
                break;

                default:
                System.out.println("OPÇÃO INVÁLIDA. Digite Novamente.\n\n");

            }


            
        }
        
        sc.close();
        
    }
    
}

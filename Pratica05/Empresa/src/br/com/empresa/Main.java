package br.com.empresa;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        Scanner sc = new Scanner (System.in);

        //Questão 33
        Pessoa pessoa1 = new Pessoa("José das Couves", 27, 1.87f, 77f);
        Pessoa pessoa2 = new Pessoa ("Carla Zambelli", 34, 1.65f, 62f);


        // Questão 34
        System.out.println ("----------- QUESTÃO 34 -------------");
        System.out.println("Imprimir o vetor com 10 pessoas cadastradas.\n");

        Pessoa [] vetor_Pessoas = new Pessoa [10];
        vetor_Pessoas[0] = new Pessoa("Maria Eduarda", 19, 1.76f, 55.3f);
        vetor_Pessoas[1] = new Pessoa("Carlos Lemos",21, 1.81f , 90.3f);
        vetor_Pessoas[2] = new Pessoa("Michelle Hanna",32, 1.73f , 65.3f);
        vetor_Pessoas[3] = new Pessoa("Amilton Oliveira",46,1.79f , 81.0f);
        vetor_Pessoas[4] = new Pessoa("Guilherme Fontes",37,1.80f , 87f);
        vetor_Pessoas[5] = new Pessoa("Gizelle Braga",45,1.68f , 65f);
        vetor_Pessoas[6] = new Pessoa("Luiza Villela",24,1.75f , 73.2f);
        vetor_Pessoas[7] = new Pessoa("Marise Rache",52,1.71f , 63.2f);
        vetor_Pessoas[8] = new Pessoa("Vinicius Andrade",44,1.80f , 86.1f);
        vetor_Pessoas[9] = new Pessoa("Fran Andrade",28,1.70f , 67f);

        for (int i=0; i<10; i++){
            System.out.printf("PESSOA  %d \n", i+1);
            vetor_Pessoas[i].imprimirPessoa();
        }

        //Questão 35

        //Questão 36
        Funcionario [] vetor_Funcionarios = new Funcionario[100];

        //Questão 37
        System.out.println ("----------- QUESTÃO 37 -------------");
        System.out.println("01 - Criar um funcionário e digitar um bônus a ser adicionado ao salário.\n");

        Funcionario funcionario1 = new Funcionario("João Pedro Costa", "Gerência", 5813.20, "11/05/22", "MG2-001.834", true);
        funcionario1.mostraDados();
       
        System.out.print("Digite o valor do bônus a ser aplicado: ");
        double bonus = sc.nextDouble();
        funcionario1.bonificar(bonus);
        System.out.println();
        funcionario1.mostraDados();

        System.out.println("02 - Criar um funcionário em seguida, demití-lo. Mostrar a mundaça do status.\n");
        Funcionario funcionario2 = new Funcionario("Daniela Albuquerque", "Apresentadores",12303.98, "02/02/2017", "SP15-139.327", true);
        funcionario2.mostraDados();
        System.out.println();
        funcionario2.demitir();
        funcionario2.mostraDados();
        System.out.println();

        

        //Questão 38
        System.out.println ("----------- QUESTÃO 38 -------------");

        Funcionario funcionario3 = new Funcionario("Felippe Oliveira", "Dentista",6000.38, "01/01/2019", "MG3-129.557", true);
        Funcionario funcionario4 = new Funcionario("Felippe Oliveira", "Dentista",6000.38, "01/01/2019", "MG3-129.557", true);


        if (funcionario3 == funcionario4){
            System.out.println("Os dois funcionarios são iguais");
        }else{ 
            System.out.println("Os dois funcionarios são diferentes.");
         }
       
         System.out.println();

         
        //Questão 39
        System.out.println ("----------- QUESTÃO 39 -------------");
        System.out.println("01 - Definir a idade de uma pessoa no banco de dados.\n");
        pessoa1.setIdade(35);
        pessoa1.imprimirPessoa();
        
        System.out.println("02 - Definir uma função aniversário e executá-la algumas vezes.\n");
        pessoa1.aniversario();
        pessoa1.aniversario();
        pessoa1.aniversario();
        System.out.println("Resultado após 3 aniversários.\n");
        pessoa1.imprimirPessoa();


        
        //Questão 44
        Empresa empresa1 = new Empresa("Funerária Caxambu", "100-000-112",100);
        Funcionario funcionario5 = new Funcionario("Pedro Paulo Rangel", "Vendas", 1500.00, "12/01/21", "SP10-234.198", true);

        //adicionando funcionarios à empresa
        empresa1.contratar(funcionario1);
        empresa1.contratar(funcionario2);
        empresa1.contratar(funcionario3);
        empresa1.contratar(funcionario5);

        System.out.println ("----------- QUESTÃO 44 -------------");
        System.out.println("Mostrando dados de funcionarios CONTRATADOS\n");
        empresa1.mostraDados(funcionario1);
        System.out.println();
        empresa1.mostraDados(funcionario2);
        System.out.println();
        empresa1.mostraDados(funcionario3);
        System.out.println();
        empresa1.mostraDados(funcionario5);
        System.out.println();
        System.out.println("------------------------------------------");



        System.out.println("Mostrando DEMITIDOS - Funcionarios 1 e 2\n");
        empresa1.demitir(funcionario1);
        empresa1.demitir(funcionario2);

        empresa1.mostraDados(funcionario1);
        System.out.println();
        empresa1.mostraDados(funcionario2);
        System.out.println();
        empresa1.mostraDados(funcionario3);
        System.out.println();
        empresa1.mostraDados(funcionario5);
        System.out.println();

        sc.close();

    }
    
}

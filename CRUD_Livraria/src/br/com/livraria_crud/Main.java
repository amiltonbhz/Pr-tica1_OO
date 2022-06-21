package br.com.livraria_crud;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) throws Exception {

        BdManagement  bd = new BdManagement();
        int op = 0;
        int op2 = 0;
        int idCliente;
        String nomeCliente;
        String nomeLivro, isbnLivro, autorLivro, dataPublLivro; 
		int idEditora, idCategoria, numEdicao, numVolume;
		float valorLivro; 

        Scanner sc = new Scanner(System.in);
        try{
            bd.connect();
           
			while (op !=5){
				System.out.println("\n\nBANCO DE DADOS LIVRARIA");
				System.out.println("-----------------------------------");
				System.out.println("1 - Cadastrar livro");
				System.out.println("2 - Pesquisar livro");
				System.out.println("3 - Excluir livro");
				System.out.println("4 - Atualizar livro");
                System.out.println("5 - Sair");
				System.out.println("-----------------------------------");
				System.out.print ("Digite a opção desejada: ");
	
				op = sc.nextInt();
	
				switch (op){
					case 1:
						System.out.println("\n- CADASTRO DE LIVROS -\n");
                        System.out.println("-----------------------------------");
						System.out.printf("Digite o nome do livro: ");
                        nomeLivro = sc.next();
                        System.out.printf("\nDigite o ISBN: ");
                        isbnLivro = sc.nextLine();
						
						System.out.println("- - - - Categorias - - - - :");
						System.out.println("1 - Informática");
						System.out.println("2 - Engenharia");
						System.out.println("3 - Turismo");
						System.out.println("4 - Direito");
						System.out.println("5 - Literatura");
						System.out.print("Digite o código: ");
						idCategoria = sc.nextInt();

						System.out.println("- - - - Editoras - - - - :");
						System.out.println("1 - Makron Books");
						System.out.println("2 - Campus");
						System.out.println("3 - Bookman");
						System.out.println("4 - Prentice Hall");
						System.out.println("5 - Saraiva");
						System.out.println("6 - Globo");
						System.out.print("Digite o código: ");
						idEditora = sc.nextInt();

						System.out.print("Digite o número da edição: ");
						numEdicao = sc.nextInt();

						System.out.print("Digite a data de publicação: ");
						dataPublLivro = sc.next();
						SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
						formatter.parse(dataPublLivro); 

						System.out.print("Digite o número do volume: ");
						numVolume = sc.nextInt();

						System.out.print("Digite o preço do livro: ");
						valorLivro = sc.nextFloat();



						System.out.println();
					break;
	
					case 2:
						System.out.println("\n- PESQUISA DE LIVROS -\n");

						System.out.println();
					break;
	


					case 3:
						System.out.println("\n- EXCLUSÃO DE LIVROS -\n");
						System.out.println("-----------------------------------");
						System.out.println("1 - Pesquisar por nome do livro.");
						System.out.println("2 - Pesquisar por ISBN do livro.");
						System.out.println("-----------------------------------");
						System.out.print ("Digite a opção desejada: ");

						op2 = sc.nextInt();

						switch (op2){
							case 1:
								System.out.println("\n - Pesquisa por NOME  - ");
								System.out.println("-----------------------------------");
								System.out.print("Digite o NOME do livro: ");
								idCliente = sc.nextInt();
								System.out.println();

 								System.out.println();
							break;
			
							case 2:
								System.out.println("\n - Pesquisa por ISBN  - ");
								System.out.println("-----------------------------------");
								System.out.print("Digite o ISBN do livro: ");
								nomeCliente = sc.next();
								System.out.println();

								System.out.println();
							break;
							
							default: System.out.println("OPÇÃO INEXISTENTE. VOLTANDO...");
						}
					break;
                    
                    case 4:
					    System.out.println("\n- CADASTRO DE LIVROS -\n");

						System.out.println();
                    break;

					case 5: 
					System.out.println("Finalizando a execução.");
				
	
					default:
					System.out.println("OPÇÃO INVÁLIDA. Digite Novamente.\n\n");
	
				}
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
    }
}

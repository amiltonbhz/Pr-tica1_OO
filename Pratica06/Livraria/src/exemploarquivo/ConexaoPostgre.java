package exemploarquivo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConexaoPostgre {
	 private final String url = "jdbc:postgresql://localhost/BDlivrariaUniversitaria";
	 private final String user = "amilton";
	 private final String password = "lobster";
	 Connection conn = null;

	 
	 private static final String QUERY = "select * from autor where id_autor = ?";
	 private static final String SELECT_ALL_QUERY = "select * from autor";
	 private static final String SELECT_ALL_BOOKS = "select * from livro";
	 private static final String SELECT_ALL_CLIENTS = "select * from cliente";
	 private static final String SELECT_TRANSACTION_BY_NAME = "select * from cliente WHERE nm_cliente LIKE ?";
	 private static final String SELECT_TRANSACTION_BY_ID = "select * from pedido where id_cliente = ?";


	
	 
	 public Connection connect() {
	        
	        try {
	            conn = DriverManager.getConnection(url, user, password);

	            if (conn != null) {
	                System.out.println("Connected to the PostgreSQL server successfully.");
	            } else {
	                System.out.println("Failed to make connection!");
	            }
	            //vers�o do postgreeSQL
	            Statement statement = conn.createStatement();
	            ResultSet resultSet = statement.executeQuery("SELECT VERSION()");
	            if (resultSet.next()) {
	            	System.out.println(resultSet.getString(1));
	            }
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }

	        return conn;
	        //conn.close();
	    }
	 
	    public void getAllUsers() {
	        try {
	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_ALL_QUERY);
	            System.out.println(preparedStatement);
	            // Step 3: Execute the query or update query
	            ResultSet rs = preparedStatement.executeQuery();

	            // Step 4: Process the ResultSet object.
	            while (rs.next()) {
	                int id = rs.getInt("id_autor");
	                String name_autor = rs.getString("nm_autor");
	                System.out.println(id + " - " + name_autor);
	            }
	        } catch (SQLException e) {
	            printSQLException(e);
	        }
	    }

	    public void getUserById() {
	        try {
	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = conn.prepareStatement(QUERY);
	            // Step 3: Execute the query or update query
	            preparedStatement.setInt(1, 5);
	            System.out.println(preparedStatement);
	            ResultSet rs = preparedStatement.executeQuery();
	            // Step 4: Process the ResultSet object.
	            // Step 4: Process the ResultSet object.
	            while (rs.next()) {
	                int id = rs.getInt("id_autor");
	                String name_autor = rs.getString("nm_autor");
	                System.out.println(id + " - " + name_autor);
	            }
	        } catch (SQLException e) {
	            printSQLException(e);
	        }
	    }

		public void getAllBooks() {
	        try {
	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_ALL_BOOKS);
	            // System.out.println(preparedStatement);
	            // Step 3: Execute the query or update query
	            ResultSet rs = preparedStatement.executeQuery();

	            // Step 4: Process the ResultSet object.
	            while (rs.next()) {
	                String id = rs.getString("id_isbn");
	                String name_book = rs.getString("nm_titulo");
	                System.out.println(id + " - " + name_book);
	            }
	        } catch (SQLException e) {
	            printSQLException(e);
	        }
	    }

		public void getAllClients() {
	        try {
	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_ALL_CLIENTS);
	            // System.out.println(preparedStatement);
	            // Step 3: Execute the query or update query
	            ResultSet rs = preparedStatement.executeQuery();

	            // Step 4: Process the ResultSet object.
	            while (rs.next()) {
	                int id = rs.getInt("id_cliente");
	                String name_cliente = rs.getString("nm_cliente");
	                System.out.println(id + " - " + name_cliente);
	            }
	        } catch (SQLException e) {
	            printSQLException(e);
	        }
	    }

		public void getTransactionByName(String nomeCliente) {
	        try {
	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_TRANSACTION_BY_NAME);
	            // Step 3: Execute the query or update query
	            preparedStatement.setString(1,"%"+nomeCliente+"%");
				System.out.println("Nome do Consultado: "+ nomeCliente);
				System.out.println();
	            
	            ResultSet rs = preparedStatement.executeQuery();
	           
				// Step 4: Process the ResultSet object.

				int linha = 0;
				while (rs.next()) {
					linha++;
	                int id = rs.getInt("id_cliente");
	                String name_client = rs.getString("nm_cliente");
	                System.out.println(id + " - " + name_client);
	            }
				if (linha==0){
					System.out.println("INFO: Não foram encontrados Registros");
				}
	     
	        } catch (SQLException e) {
	            printSQLException(e);
	        } 
	    }

		public void getTransactionById(int idCliente) {
	        try {
	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_TRANSACTION_BY_ID);
	            // Step 3: Execute the query or update query
	            preparedStatement.setInt(1, idCliente);
	            ResultSet rs = preparedStatement.executeQuery();
	            // Step 4: Process the ResultSet object.
			int linha = 0;
			while (rs.next()) {
					linha++;
					Date dataPedido = rs.getDate("dt_pedido");
					Float valorPedido = rs.getFloat("vl_total_pago");
					System.out.println(linha + " - " + dataPedido + " - " + valorPedido);
				}

				if (linha==0){
					System.out.println("INFO: Não foram encontrados Registros");
				}
	            
	        } catch (SQLException e) {
	            printSQLException(e);
	        }
	    }
	    
	    public static void printSQLException(SQLException ex) {
	            for (Throwable e: ex) {
	                if (e instanceof SQLException) {
	                    e.printStackTrace(System.err);
	                    System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                    System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                    System.err.println("Message: " + e.getMessage());
	                    Throwable t = ex.getCause();
	                    while (t != null) {
	                        System.out.println("Cause: " + t);
	                        t = t.getCause();
	                    }
	                }
	            }
	        }
	    
	    public static void main(String[] args) {
	    	
	    	ConexaoPostgre app = new ConexaoPostgre();
	        app.connect();

	      /*  System.out.println("\nRealizando o select na tabela Autor");
	        app.getAllUsers();
	        System.out.println("\nRealizando o select na tabela Autor pelo ID");
	        app.getUserById(); */

			Scanner sc = new Scanner (System.in);
			int op = 0;
			int op2 = 0;
			String nomeCliente;
			int idCliente;


			while (op !=4){
				System.out.println("\n\nCONSULTA DE ACERVO DA LIVRARIA");
				System.out.println("-----------------------------------");
				System.out.println("1 - Pesquisar livros");
				System.out.println("2 - Pesquisar Clientes");
				System.out.println("3 - Pesquisar pedidos do Cliente");
				System.out.println("4 - Sair");
				System.out.println("-----------------------------------");
				System.out.print ("Digite a opção desejada: ");
	
				op = sc.nextInt();
	
				switch (op){
					case 1:
						System.out.println("\n- LISTA DE LIVROS -\n");
						app.getAllBooks();
						System.out.println();
					break;
	
					case 2:
						System.out.println("\n- LISTA DE CLIENTES -\n");
						app.getAllClients();
						System.out.println();
					break;
	


					case 3:
						System.out.println("\n- PESQUISA DE PEDIDOS -\n");
						System.out.println("-----------------------------------");
						System.out.println("1 - Pesquisar por ID do cliente.");
						System.out.println("2 - Pesquisar por NOME do cliente");
						System.out.println("-----------------------------------");
						System.out.print ("Digite a opção desejada: ");

						op2 = sc.nextInt();

						switch (op2){
							case 1:
								System.out.println("\n - Pesquisa por ID  - ");
								System.out.println("-----------------------------------");
								System.out.print("Digite o ID do cliente: ");
								idCliente = sc.nextInt();
								System.out.println();
								app.getTransactionById(idCliente);
								System.out.println();
							break;
			
							case 2:
								System.out.println("\n - Pesquisa por NOME  - ");
								System.out.println("-----------------------------------");
								System.out.print("Digite o NOME do cliente: ");
								nomeCliente = sc.next();
								System.out.println();
								app.getTransactionByName(nomeCliente);
								System.out.println();
							break;
							
							default: System.out.println("OPÇÃO INEXISTENTE. VOLTANDO...");
						}
					break;



					case 4: 
					System.out.println("Finalizando a execução.");
				
	
					default:
					System.out.println("OPÇÃO INVÁLIDA. Digite Novamente.\n\n");
	
				}
			}

			sc.close();
	        
	    }
	}



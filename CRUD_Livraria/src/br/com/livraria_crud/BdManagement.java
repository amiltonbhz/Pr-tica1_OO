package br.com.livraria_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BdManagement {
    private final String url = "jdbc:postgresql://localhost/BDlivrariaUniversitaria";
	private final String user = "amilton";
	private final String password = "lobster";
	
    Connection conn = null;
	PreparedStatement statement;

	int id;
	String local, data, nome, obs, tipo;
	String tabela;
	
	
/* ------------------------ GERENCIANDO A CONEXÃO ---------------------------------- */


	public Connection connect() throws SQLException {
	
		conn = DriverManager.getConnection(url, user, password);
		
		if(conn != null){
			System.out.println("Conexão ao Banco de dados feita com sucesso");
		}else {
			System.out.println("Conexão ao Banco de dados falho!!!!");
		}
		
		//versão do postgreeSQL
		Statement statement = (Statement) conn.createStatement();
		ResultSet resultSet = ((java.sql.Statement) statement).executeQuery("SELECT VERSION()");
		if (resultSet.next()) {
			System.out.println(resultSet.getString(1));
		}
		
		return conn;
	}
	
	public Connection closeConn() throws SQLException {
		conn.close();
		return conn;
	}
/* -------------------------------------------------------------------------------------- */
	

}

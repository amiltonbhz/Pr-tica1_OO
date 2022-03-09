package br.com.concecionaria;

public class Cliente {
	String nome;
	String cpf;
	String habilitacao;
	String endereco;
	String telefone;
	String email;
	
	//Contrutor
	Cliente (String nomeC, String cpfC, String habC, String endC, String telC, String emailC){
		nome = nomeC;
		cpf = cpfC;
		habilitacao = habC;
		endereco = endC;
		telefone = telC;
		email = emailC;
	}
}

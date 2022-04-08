package br.com.folha;

public class Fpadrao extends Funcionario {
	Fpadrao(int matricula, String nome, double salario ){
		super(matricula, nome, salario);
	}
	public double calcularProventos() {
		return getSalario();
	}
	
	public String toString() {
		return "Nome: "+getNome() +"\nSalário: " + calcularProventos()+"\n\n";
	}
}

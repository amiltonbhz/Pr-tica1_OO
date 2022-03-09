package br.com.faculdade.empregado;

public class EmpregadoDaFaculdade {
	private String nome;
	private double salario;
	private int horasAula;
	
	//Construtor
	EmpregadoDaFaculdade(String nomeE, double salarioE, int horasAulaE){
		nome = nomeE;
		salario = salarioE;
		horasAula = horasAulaE;
	}

	double getGastos() {
		this.salario = this.salario +(this.horasAula * 40.0);
		return this.salario;
	}

	String getInfo(){
		return "Nome: " + this.nome + ", com salário bruto de R$" + (this.salario - this.horasAula * 40)  + ", recebe um bonus de R$"+ (this.horasAula*40) + " ...Totalizando: "+ this.salario + "R$";
	}

}

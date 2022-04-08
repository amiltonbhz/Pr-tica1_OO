package br.com.folha;

public class FProdutividade extends Funcionario {
	private int producao;
	private int valor;

	FProdutividade(int matricula, String nome, double salario,  int valor, int producao){
		super(matricula, nome, salario);
		this.valor = valor;
		this.producao = producao;
	}

	public int getProducao() {
		return producao;
	}

	public void setProducao(int producao) {
		this.producao = producao;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public double calcularProventos() {
		return getSalario()+ (this.valor*this.producao);
	}
	
	public String toString() {
		return "Nome: "+getNome() +"\nSalário: " + calcularProventos()+"\n\n";
	}
}

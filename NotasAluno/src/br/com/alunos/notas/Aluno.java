package br.com.alunos.notas;

public class Aluno {
	String nome;
	int matricula;
	int notaAV1;
	int notaAV2;
	int notaAE;
	String curso;
	int periodo;

	// Construtor
	Aluno(String nomeA, int matA, int notaAV1A, int notaAV2A, int notaAEA, String cursoA, int periodoA) {
		nome = nomeA;
		matricula = matA;
		notaAV1 = notaAV1A;
		notaAV2 = notaAV2A;
		notaAE = notaAEA;
		curso = cursoA;
		periodo = periodoA;
	}

	// Métodos
	public void alterarNotaAv1(int novaNotaAv1) {
		notaAV1 = novaNotaAv1;
	}

	public void alterarNotaAv2(int novaNotaAv2) {
		notaAV2 = novaNotaAv2;
	}

	public void alterarNotaAe(int novaNotaAe) {
		notaAE = novaNotaAe;
	}

	public void avaliarAluno() {
		
		System.out.println("Aluno:     "+this.nome);
		System.out.println("Matrícula: "+this.matricula);
		System.out.println ("Curso:     "+this.curso);
		System.out.println ("Período:   "+this.periodo);
		System.out.println("");

		if (this.notaAV1 + this.notaAV2 >= 60) {
			System.out.println("Nota AV1:   "+this.notaAV1);
			System.out.println("Nota AV2:   "+this.notaAV2);
			System.out.println("Nota Final: "+(this.notaAV1+this.notaAV2));
			System.out.println("Situação  : APROVADO.");
			System.out.println();
			return;
		} else {
			System.out.println("Nota AV1:   "+this.notaAV1);
			System.out.println("Nota AV2:   "+this.notaAV2);
			System.out.println("Nota Final: "+(this.notaAV1+this.notaAV2));
			System.out.println("Situação  : RECUPERAÇÃO");
			System.out.println();
		}

	}
	public void avaliarRecuperacao() {
		System.out.println("Aluno:     "+this.nome);
		System.out.println("Matrícula: "+this.matricula);
		System.out.println ("Curso:     "+this.curso);
		System.out.println ("Período:   "+this.periodo);
		System.out.println("");

		System.out.println("Nota AV1:   "+this.notaAV1);
		System.out.println("Nota AV2:   "+this.notaAV2);
		System.out.println("Nota AE :   "+this.notaAE);
		int notaAposAE = ((this.notaAV1+this.notaAV2+this.notaAE)/2);
		System.out.println("Média   :   "+notaAposAE);

				
		if (notaAposAE >=60) {
			System.out.println("Resultado : APROVADO APÓS RECUPERAÇÃO.");
		} else {
			System.out.println("Resultado : REPROVADO");	
		}
		System.out.println();
	}

}

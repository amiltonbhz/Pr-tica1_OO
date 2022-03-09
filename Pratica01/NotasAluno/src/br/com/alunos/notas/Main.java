package br.com.alunos.notas;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Amilton S. Oliveira", 12110347, 35, 45, 0,"Prog Orientada a Objetos",4);
		
		System.out.println("-------------------------------");
		System.out.println("Teste 1  - Aprovado");
		System.out.println("-------------------------------");
		aluno.avaliarAluno();
		
		
		System.out.println("-------------------------------");
		System.out.println("Teste 2 - Recuperação");
		System.out.println("-------------------------------");
		aluno.alterarNotaAv2(20); //ALTEREI NOTA de AV2
		aluno.avaliarAluno();
		
		
		System.out.println("-------------------------------");
		System.out.println("Teste 3 - Aprovado após AE");
		System.out.println("-------------------------------");
		aluno.alterarNotaAe(95); //ALTERA/INCLUI nota AE (inicializada em 0)
		aluno.avaliarRecuperacao();
		
		
		System.out.println("-------------------------------");
		System.out.println("Teste 4  - Reprovado após AE");
		System.out.println("-------------------------------");
		aluno.alterarNotaAe(40); //ALTERA-INCLUI nota de AE (inicializada em 0)
		aluno.avaliarRecuperacao();
	}

}

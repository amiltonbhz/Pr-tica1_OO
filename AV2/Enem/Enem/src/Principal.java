import java.util.Scanner;
import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);
        int id, ano, nota,atual;
        int soma = 0;
        int notaatual=0;

        String nome, titulo;
        
        System.out.println("- - - - - Cadastrar aluno - - - - -");
        System.out.print("Digite o ID do aluno: ");
        id = sc.nextInt();
        System.out.print("Digite NOME do aluno: ");
        nome = sc.next();
        System.out.print("Digite o ANO do aluno: ");
        ano = sc.nextInt();
        
        AlunoEnem aluno1 = new AlunoEnem(id, nome, ano);

        ArrayList<ProvaEnem> provas = new ArrayList <> ();

        for (int i = 0; i<5; i++){
            System.out.println("- - - - - Cadastrar Prova - - - - -");
            System.out.print("Digite o ID do da prova: ");
            id = sc.nextInt();
            System.out.print("Digite TITULO da prova: ");
            titulo = sc.next();
            System.out.print("Digite a NOTA da prova: ");
            nota = sc.nextInt();
            provas.add(new ProvaEnem(id, titulo, nota));


    }
    for (ProvaEnem notas: provas) {
        notaatual = notas.getNota();
        soma = soma + notaatual;
    }
    System.out.println("A soma das notas no array é "+ soma);


}
}



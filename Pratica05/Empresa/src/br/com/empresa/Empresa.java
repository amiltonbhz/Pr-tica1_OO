package br.com.empresa;

public class Empresa {
    static int contador = 0;
    private String nome;
    private String cnpj;
    private int numFuncionarios=0;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int numFuncionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        funcionarios = new Funcionario[numFuncionarios];
    }

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numFuncionarios=100;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public void contratar (Funcionario funcionario){
        funcionarios[contador]=funcionario;
        funcionario.setAtivo(true);
        contador++;
    }
    public void demitir(Funcionario funcionario){
        funcionario.setAtivo(false);
        contador--;
    
    }

    public void mostraDados(Funcionario funcionario){
        System.out.println("Nome:\t\t"+funcionario.getNome());
        System.out.println("Dept:\t\t"+funcionario.getDept());

        if (funcionario.isAtivo()) {
            System.out.println("Status:\t\tAtivo");}
        else{System.out.println("Status:\t\tDemitido");
        }
    }
}


package br.com.empresa;

public class Funcionario {
    private String nome;
    private String dept;
    private double salario;
    private String dataEntrada;
    private String rg;
    private boolean ativo=true;

    public Funcionario(String nome, String dept, double salario, String dataEntrada, String rg, boolean ativo) {
        this.nome = nome;
        this.dept = dept;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.ativo = ativo;
    }

    //QUESTÃO 42
/*
    public Funcionario(String nome, String dept) {
        this.nome = nome;
        this.dept = dept;
    }

    public Funcionario(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public Funcionario() {
    }
*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void bonificar(double bonus) {
        this.salario+=bonus;
    }
    public void demitir(){
        this.ativo = false;
    }

    public void mostraDados(){
        System.out.println("Nome:\t\t"+this.getNome());
        System.out.println("RG:\t\t"+this.getRg());
        System.out.println("Dept:\t\t"+this.getDept());
        System.out.printf("Salário:\t%.2f\n",this.getSalario());
        System.out.println("Data Ent:\t"+this.getDataEntrada());

        if (isAtivo()) {
            System.out.println("Status:\t\tAtivo");}
        else{System.out.println("Status:\t\tDemitido");
        }
        System.out.println();

    }

}



package br.com.lojacomercial;

public abstract class Funcionario {
    private String rg;
    private double salario;
    
    public Funcionario(String rg, double salario) {
        this.rg = rg;
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}

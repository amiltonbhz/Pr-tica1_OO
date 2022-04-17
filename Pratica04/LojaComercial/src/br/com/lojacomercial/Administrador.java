package br.com.lojacomercial;

public class Administrador extends Funcionario{
    int horaExtra;

    public Administrador(String rg, double salario, int horaExtra) {
        super(rg, salario);
        this.horaExtra = horaExtra;
    }

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }
    public void SalarioTotal(){
        double totalAdic = (this.getSalario()*0.01)*getHoraExtra();
        double salarioFinal = this.getSalario()+totalAdic;
        System.out.println("\nAdicional a pagar: "+totalAdic);
        System.out.println("Salário Final: "+salarioFinal);

    }

    
}

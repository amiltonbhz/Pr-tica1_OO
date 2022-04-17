package br.com.lojacomercial;

public class Vendedor extends Funcionario {
    double totalVendas;

    public Vendedor(String rg, double salario, double totalVendas) {
        super(rg, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    
    public void SalarioTotal(){
        double totalcomis = this.getTotalVendas()*0.05;
        double salarioFinal = this.getSalario()+totalcomis;
        System.out.println("\nComissão a pagar: "+totalcomis);
        System.out.println("Salário Final: "+salarioFinal);

    }

    
}

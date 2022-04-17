package br.com.containterface;

public class Poupanca implements Conta {
    private double saldo;

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
    
    
}

package br.com.containterface;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1200.20);
        cc.sacar(300);

        Poupanca cp = new Poupanca();
        cp.depositar(500.50);
        cp.sacar (25);

        GeradorExtratos gerador = new GeradorExtratos();
        gerador.geradorConta(cc);
        gerador.geradorConta(cp);
    }
}

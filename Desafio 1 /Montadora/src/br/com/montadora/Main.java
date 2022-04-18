package br.com.montadora;

public class Main {
    public static void main (String [] args){
        System.out.println("\nMONTADORA DE CARROS TABAJARA");
        System.out.println("-------------------------------");
        LinhaMontagem linha1 = new LinhaMontagem();
        System.out.println("Produção na velociade 6: "+ linha1.TaxaDeProducaoHora(6));
        System.out.println("Carros sem defeito por minuto: "+linha1.UnidadesFuncionaisPorMinuto(6));
    }
    
}

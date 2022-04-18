package br.com.montadora;

public class LinhaMontagem {

    private static final int CarrosPorHora = 221;

    public double TaxaDeProducaoHora(int velocidade){
        if (velocidade ==0){
            return 0;
        }
        return velocidade * CarrosPorHora * TaxaDeSucesso(velocidade);
    }


    public double TaxaDeSucesso(int velocidade){
    
        double taxa;

        if (velocidade >=1 && velocidade <=4){
            taxa = 1;            
        } else if (velocidade >=5 && velocidade <=8){
            taxa = 0.9;
        } else if (velocidade == 9){
            taxa = 0.8;
        } else {
            taxa = 0.77;
        }
        return taxa;
    }

    public int UnidadesFuncionaisPorMinuto (int velocidade){
       // return (int) ((CarrosPorHora /60) * velocidade * TaxaDeSucesso(velocidade));
      return (int) (TaxaDeProducaoHora(velocidade) * TaxaDeSucesso (velocidade)/60);

    }
 }
    


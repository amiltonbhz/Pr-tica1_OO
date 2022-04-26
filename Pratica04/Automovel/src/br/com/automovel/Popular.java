package br.com.automovel;

public class Popular extends Automovel {
    float precoBase, valorAgregado;
    int desconto;

    public Popular(boolean abs, boolean airbag, boolean alarme, boolean som, boolean conjuntoEletrico,
            boolean computadorBordo, float precoBase,int desconto) {
        super(abs, airbag, alarme, som, conjuntoEletrico, computadorBordo);
        this.precoBase = precoBase;
        this.desconto = desconto;
    }

    public float getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(float precoBase){
        this.precoBase = precoBase;
    }
    
    public int getDesconto() {
    	return desconto;
    }
    
    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
    
    public void calcularPrecoFinal(boolean abs, boolean alarme, boolean som, boolean conjuntoEletrico, boolean computadorBordo, float precoBase, int desconto){
        float valorDesconto = 0 ;
        float valorFinal = 0;

            if (isAbs()==true) {
                valorAgregado +=getPrecoBase()*.15;
                }
            
            if (isAirbag()==true){
                valorAgregado+=getPrecoBase()*0.10;
                }
            
            if (isAlarme()==true){
                valorAgregado+=getPrecoBase()*0.03;
                }
            
            if (isSom()==true){
                valorAgregado+=getPrecoBase()*0.02;
                }
            
            if (isConjuntoEletrico()==true){
                valorAgregado+=getPrecoBase()*0.05;
                }
            
            if (isComputadorBordo()==true){
                valorAgregado+=getPrecoBase()*0.10;
                }


        valorDesconto = ((valorAgregado + precoBase)*desconto)/100;
        valorFinal = valorAgregado + precoBase - valorDesconto;
        char caraEsp = '%';
    
        System.out.println("\n\n--------- VALORES -----------");
        System.out.printf("Valor Base:\t %.2f\n",this.precoBase);
        System.out.printf("Acessórios:\t %.2f\n",this.valorAgregado);
        System.out.printf("Desconto: \t %.2f (%d%c)\n", valorDesconto,desconto,caraEsp);
        System.out.println();
        System.out.printf("TOTAL:\t\t %.2f\n",valorFinal);
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println();


        //ZERANDO VARIÁVEIS PARA PROXIMA EXECUÇÃO
        valorDesconto=0;
        valorFinal=0;
        valorAgregado=0;

     }
        
        
  }
    
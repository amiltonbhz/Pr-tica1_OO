package br.com.automovel;

public class Popular extends Automovel {
    float precoBase, valorAgregado;

    public Popular(boolean abs, boolean airbag, boolean alarme, boolean som, boolean conjuntoEletrico,
            boolean computadorBordo, float precoBase) {
        super(abs, airbag, alarme, som, conjuntoEletrico, computadorBordo);
        this.precoBase = precoBase;
    }

    public float getPreçoBase() {
        return precoBase;
    }

    public void setPreçoBase(float precoBase){
        this.precoBase = precoBase;
    }
    
    public void calcularPrecoFinal(boolean abs, boolean alarme, boolean som, boolean conjuntoEletrico, boolean computadorBordo, float precoBase){
        
        if (isAbs()==true) {
            valorAgregado +=getPreçoBase()*.15;
            }
        
        if (isAirbag()==true){
            valorAgregado+=getPreçoBase()*0.10;
            }
        
        if (isAlarme()==true){
            valorAgregado+=getPreçoBase()*0.03;
            }
        
        if (isSom()==true){
            valorAgregado+=getPreçoBase()*0.02;
            }
        
        if (isConjuntoEletrico()==true){
            valorAgregado+=getPreçoBase()*0.05;
            }
        
        if (isComputadorBordo()==true){
            valorAgregado+=getPreçoBase()*0.10;
            }

        float valorFinal = valorAgregado + precoBase;

        System.out.println("------------------------------");
        System.out.printf("Acessórios:\t %.2f\n",valorAgregado);
        System.out.printf("Valor FINAL:\t%.2f",valorFinal);
    }
    
}

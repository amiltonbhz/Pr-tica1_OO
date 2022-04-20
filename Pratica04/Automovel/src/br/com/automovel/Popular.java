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

    public void setPreçoBase(float precoBase){
        this.precoBase = precoBase;
    }
    
    public int getDesconto() {
    	return desconto;
    }
    
    public void setDesconto() {
    	this.desconto = desconto;
    }
    
    public void calcularPrecoFinal(boolean abs, boolean alarme, boolean som, boolean conjuntoEletrico, boolean computadorBordo, float precoBase){
        
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

        float valorFinal = valorAgregado + precoBase;

        System.out.println("------------------------------");
        System.out.printf("Acessórios:\t %.2f\n",valorAgregado);
        System.out.printf("Valor FINAL:\t%.2f",valorFinal);
    }
    
}

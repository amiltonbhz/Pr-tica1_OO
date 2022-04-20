package br.com.automovel;

public abstract class Automovel {
    private boolean abs;
    private boolean airbag;
    private boolean alarme;
    private boolean som;
    private boolean conjuntoEletrico;
    private boolean computadorBordo;

    public Automovel(boolean abs, boolean airbag, boolean alarme, boolean som, boolean conjuntoEletrico,
            boolean computadorBordo) {
        this.abs = abs;
        this.airbag = airbag;
        this.alarme = alarme;
        this.som = som;
        this.conjuntoEletrico = conjuntoEletrico;
        this.computadorBordo = computadorBordo;
    }   

    public boolean isAbs() {
        return abs;
    }


    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public boolean isAlarme() {
        return alarme;
    }

    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }

    public boolean isSom() {
        return som;
    }

    public void setSom(boolean som) {
        this.som = som;
    }

    public boolean isConjuntoEletrico() {
        return conjuntoEletrico;
    }

    public void setConjuntoEletrico(boolean conjuntoEletrico) {
        this.conjuntoEletrico = conjuntoEletrico;
    }

    public boolean isComputadorBordo() {
        return computadorBordo;
    }

    public void setComputadorBordo(boolean computadorBordo) {
        this.computadorBordo = computadorBordo;
    }

    public void informaPrecoFinal(){

    }
}
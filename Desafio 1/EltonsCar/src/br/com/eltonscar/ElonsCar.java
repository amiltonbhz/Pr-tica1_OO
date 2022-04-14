package br.com.eltonscar;

public class ElonsCar {
	private int distanciaDirigida;
	private int percentagemBateria = 100;
	
	
    public static ElonsCar comprar() {
        return new ElonsCar();
    }
    public String mostrarDistancia() {
        return String.format("Distância %d metros", distanciaDirigida);
    }
    
    public String mostrarBateria() {
    	if (this.percentagemBateria == 0) {
    		return "Bateria Esgotada";
    	}
    	return String.format("Bateria com %d%%", percentagemBateria);
    }
    public void dirigir() {
    	if(this.percentagemBateria != 0) {
    		this.distanciaDirigida += 20;
            this.percentagemBateria--;
    	}   
    }
}
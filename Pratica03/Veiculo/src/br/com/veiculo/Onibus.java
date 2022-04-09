package br.com.veiculo;

import javax.swing.JOptionPane;

public class Onibus extends Veiculo {
	private int assentos;
	
	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Placa: "+this.getPlaca()+"\nAno: "+this.getAno()+"\nAssentos: "+this.getAssentos(), "Dados do Veículo", JOptionPane.INFORMATION_MESSAGE);

		
	}

}

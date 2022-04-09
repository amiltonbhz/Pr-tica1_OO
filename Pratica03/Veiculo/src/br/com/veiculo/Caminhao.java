package br.com.veiculo;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo {
	private int eixos;

	public Caminhao(String placa, int ano, int eixos) {
		super(placa, ano);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Placa: "+this.getPlaca()+"\nAno: "+this.getAno(), "Dados do Veículo", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Eixos: "+this.getEixos(), "Mensagem", JOptionPane.INFORMATION_MESSAGE);

		
	}

}

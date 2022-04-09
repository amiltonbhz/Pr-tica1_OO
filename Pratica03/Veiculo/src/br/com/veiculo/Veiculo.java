package br.com.veiculo;

import javax.swing.JOptionPane;

public class Veiculo {
	private String placa;
	private int ano;
	
	public Veiculo(String placa, int ano) {
		this.placa = placa;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void exibirDados () {	
		JOptionPane.showMessageDialog(null, "Placa: "+this.getPlaca()+"\nAno: "+this.getAno(), "Dados do Veículo", JOptionPane.INFORMATION_MESSAGE);
		
		System.out.println("Dados do veículo:");
		System.out.println("Placa: "+this.getPlaca());
		System.out.println("Ano: "+this.getAno());
	}
	
}

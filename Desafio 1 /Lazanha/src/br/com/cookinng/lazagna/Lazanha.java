package br.com.cookinng.lazagna;

public class Lazanha {
	private int tempoCozimentoMin = 40;
	private int preparoMinutosCamada = 2;

	public int tempoEstimadoForno() {
		return tempoCozimentoMin;
	}

	int tempoAteTermino(int minutosGastos) {
		return this.tempoEstimadoForno() - minutosGastos;
	}

	public int tempoPreparoMinutos(int numeroCamadas) {
		return preparoMinutosCamada * numeroCamadas;
	}

	public int tempoTotalMinutos(int numCamadas, int minutosGastos) {
		return this.tempoPreparoMinutos(numCamadas) + minutosGastos;
	}

}

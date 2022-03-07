package br.com.faculdade.empregado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpregadoDaFaculdade empregado = new EmpregadoDaFaculdade("João Carlos Abreu", 4580, 7);
		empregado.getGastos();
		System.out.println(empregado.getInfo());		
	}

}

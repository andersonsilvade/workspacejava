package br.com.les.calculadora.servlets;

public class Exponenciacao implements ExecutaCalculo {

	@Override
	public double calcular(double valor1, double valor2) {
		return  Math.pow(valor1, valor2);
		// TODO Auto-generated method stub

	}

}

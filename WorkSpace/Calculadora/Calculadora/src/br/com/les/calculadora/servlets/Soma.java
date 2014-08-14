package br.com.les.calculadora.servlets;

public class Soma implements ExecutaCalculo{

	@Override
	public double calcular(double valor1, double valor2) {
		return valor1 + valor2;
		}

}

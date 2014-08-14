package br.com.les.calculadora.servlets;

import br.com.les.calculadora.servelets.exceptions.CalculadoraException;

public class BuilderCalculo {
	
	
	public static ExecutaCalculo build(String operacao) throws CalculadoraException{
		if ("soma".equals(operacao)) {
			return new Soma();
		} else if ("subtracao".equals(operacao)) {
			return new Subtracao();
		} else if ("divisao".equals(operacao)) {
			return new Divisao();
		} else if ("multiplicacao".equals(operacao)) {
			return new Multiplicao();
		} else if ("exp".equals(operacao)) {
			return new Exponenciacao();
		} else {
			throw new CalculadoraException("Operacao invalida!!!");
		}
	}

}

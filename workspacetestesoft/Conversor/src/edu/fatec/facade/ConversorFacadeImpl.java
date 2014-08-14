package edu.fatec.facade;

import edu.fatec.command.ICommand;
import edu.fatec.exception.InvalidTypeException;
import edu.fatec.exception.InvalidValueException;


public class ConversorFacadeImpl implements IConversorFacade {
	private ICommand conversorAlqueire;
	private ICommand conversorHectare;
	private ICommand conversorDolar;
	private ICommand conversorEuro;
	private ICommand conversorFarenheit;
	private ICommand conversorCelsius;

	public Double converterDado(TipoConversor tipo, Double valor) throws InvalidTypeException {
		try {
			switch(tipo) {
				case ALQUEIRE:
					return conversorAlqueire.execute(valor);
				case HECTARE:
					return conversorHectare.execute(valor);
				case DOLAR:
					return conversorDolar.execute(valor);
				case EURO:
					return conversorEuro.execute(valor);
				case CELSIUS:
					return conversorCelsius.execute(valor);
				case FARENHEIT:
					return conversorFarenheit.execute(valor);
				default:
					throw new InvalidTypeException();
			}
		} catch (InvalidValueException ex) {
			System.out.println("Dado invalido para a conversao informada.");
			return 0d;
		}
	}
	
	public void setConversorAlqueire(ICommand conversorAlqueire) {
		this.conversorAlqueire = conversorAlqueire;
	}

	public void setConversorHectare(ICommand conversorHectare) {
		this.conversorHectare = conversorHectare;
	}

	public void setConversorDolar(ICommand conversorDolar) {
		this.conversorDolar = conversorDolar;
	}

	public void setConversorEuro(ICommand conversorEuro) {
		this.conversorEuro = conversorEuro;
	}

	public void setConversorFarenheit(ICommand conversorFarenheit) {
		this.conversorFarenheit = conversorFarenheit;
	}

	public void setConversorCelsius(ICommand conversorCelsius) {
		this.conversorCelsius = conversorCelsius;
	}	
}

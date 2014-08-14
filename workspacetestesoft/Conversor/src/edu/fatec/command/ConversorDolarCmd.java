package edu.fatec.command;
import edu.fatec.exception.InvalidValueException;


public class ConversorDolarCmd implements ICommand {
	// Cotacao do dolar
	public static Double DOLAR = 2.42;

	public Double execute(Double valor) throws InvalidValueException {
		if (valor == null)
			throw new InvalidValueException();
		return valor / DOLAR; 
	}

}

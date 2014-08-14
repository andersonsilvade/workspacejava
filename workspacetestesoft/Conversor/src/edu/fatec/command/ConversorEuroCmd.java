package edu.fatec.command;
import edu.fatec.exception.InvalidValueException;


public class ConversorEuroCmd implements ICommand {
	// Cotacao do euro
	public static Double EURO = 3.14;

	public Double execute(Double valor) throws InvalidValueException {
		if (valor == null)
			throw new InvalidValueException();
		return valor / EURO; 
	}

}

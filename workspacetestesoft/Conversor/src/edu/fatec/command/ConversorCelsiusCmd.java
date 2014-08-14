package edu.fatec.command;
import edu.fatec.exception.InvalidValueException;


public class ConversorCelsiusCmd implements ICommand {

	public Double execute(Double valor) throws InvalidValueException {
		if (valor == null)
			throw new InvalidValueException();
		return (valor - 32) / 1.8; 
	}

}

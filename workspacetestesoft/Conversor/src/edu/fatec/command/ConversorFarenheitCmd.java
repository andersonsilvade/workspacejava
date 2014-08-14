package edu.fatec.command;
import edu.fatec.exception.InvalidValueException;


public class ConversorFarenheitCmd implements ICommand {

	public Double execute(Double valor) throws InvalidValueException {
		if (valor == null)
			throw new InvalidValueException();
		return (valor * 1.8) + 32; 
	}

}

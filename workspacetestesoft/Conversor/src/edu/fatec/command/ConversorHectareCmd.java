package edu.fatec.command;
import edu.fatec.exception.InvalidValueException;


public class ConversorHectareCmd implements ICommand {
	// Equivalencia a metros quadrados
	public static Double HECTARE = 10000d;

	public Double execute(Double valor) throws InvalidValueException {
		if (valor == null)
			throw new InvalidValueException();
		return valor / HECTARE;
	}

}

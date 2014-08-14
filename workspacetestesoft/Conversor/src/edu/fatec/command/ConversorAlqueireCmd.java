package edu.fatec.command;
import edu.fatec.exception.InvalidValueException;


public class ConversorAlqueireCmd implements ICommand {
	// Equivalencia a metros quadrados
	public static Double ALQUEIRE = 24200d;

	public Double execute(Double valor) throws InvalidValueException {
		if (valor == null){
			throw new InvalidValueException();
		}else{
		return valor / ALQUEIRE; 
	}
	}
}

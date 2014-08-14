package edu.fatec.command;
import edu.fatec.exception.InvalidValueException;


public interface ICommand {
	Double execute(Double valor) throws InvalidValueException;
}

package edu.fatec.facade;

import edu.fatec.exception.InvalidTypeException;

public interface IConversorFacade {
	Double converterDado(TipoConversor tipo, Double valor) throws InvalidTypeException;
}

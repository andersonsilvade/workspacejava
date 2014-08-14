package br.com.eng3.principal;

import java.util.List;

import br.com.eng3.paises.DadosPaises;
import br.com.eng3.tipo.Acidente;

public interface Observer {

	public void updateAcidente(Acidente a);
	public void updatePaises(DadosPaises p);

}

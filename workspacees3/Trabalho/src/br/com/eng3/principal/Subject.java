package br.com.eng3.principal;

import java.util.List;



import br.com.eng3.tipo.Acidente;
import br.com.eng3.paises.DadosPaises;
import br.com.eng3.principal.*;
public interface Subject {
    //regitrar
	public void registrarObservers(Observer ob1);

	//notificar
	public void notificarObserverAcidente(Acidente acid);
	public void notificarObserverPaises(DadosPaises dados);
	
}

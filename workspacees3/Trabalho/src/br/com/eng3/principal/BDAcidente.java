package br.com.eng3.principal;
import java.util.LinkedList;
import java.util.List;

import br.com.eng3.paises.DadosPaises;
import br.com.eng3.tipo.Acidente;
import br.com.eng3.principal.*;

public class BDAcidente implements Subject {

	private List<Acidente>lista;
	 private List<DadosPaises>paises;
    private List<Observer>observer; 

	public BDAcidente(){
		lista = new LinkedList<Acidente>();
		paises = new LinkedList<DadosPaises>();
		observer  = new LinkedList<Observer>();

	}
	//registrar observes
	public void registrarObservers(Observer ob1){
		observer.add(ob1);
	}


	//notificar
    
	
	public void notificarObserverAcidente(Acidente a){
		for(Observer ob : observer){
			ob.updateAcidente(a);
		}
	}

	public void notificarObserverPaises(DadosPaises p) {
		for(Observer ob : observer){
			ob.updatePaises(p);

		}
	}


	//add ao banco
	public void addAcidente(Acidente a){
		lista.add(a);
		notificarObserverAcidente(a);
		
	}
	public void addPaises(DadosPaises dp){
		paises.add(dp);
		notificarObserverPaises(dp);
	}




}



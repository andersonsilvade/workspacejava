package br.com.eng3.tipo;


import java.util.LinkedList;

import br.com.eng3.principal.BDAcidente;
import br.com.eng3.principal.Tela;


public class ImpressaoOrdemCrescente implements ImpressaoVitimaOrdenado {

	BDAcidente bda ;
	Tela tela;
	LinkedList<Acidente>lista;
	
	public ImpressaoOrdemCrescente(BDAcidente bda,Tela tela){
		this.bda = bda;
		this.tela = tela;
		lista = new LinkedList<Acidente>();
	}

	public void imprimirOrdenado(Acidente vit){
		if(vit != null)lista.add(vit);
		
		if(lista.size()==7){		
			tela.imprimirCrescente(lista);
		}
	}


}



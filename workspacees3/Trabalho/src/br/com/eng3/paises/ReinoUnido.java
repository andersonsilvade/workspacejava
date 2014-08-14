package br.com.eng3.paises;
import java.text.DecimalFormat;
import java.util.List;

import br.com.eng3.principal.BDAcidente;
import br.com.eng3.principal.Tela;


public class ReinoUnido implements Comparacao {

	BDAcidente bda;
	Tela tela;
	public ReinoUnido(BDAcidente bda,Tela tela){
		this.bda = bda;
		this.tela = tela;
	}
	public void compararOutroPais(DadosPaises pai){
		tela.imprimirReinoUnido(pai);
	}

}

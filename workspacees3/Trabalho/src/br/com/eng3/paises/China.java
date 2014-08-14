package br.com.eng3.paises;
import java.text.DecimalFormat;
import java.util.List;

import br.com.eng3.principal.BDAcidente;
import br.com.eng3.principal.Tela;


public class China implements Comparacao {

	private BDAcidente bda;
	private Tela tela;


	public China(BDAcidente bda,Tela tela){
		this.bda = bda;
		this.tela = tela;

	}

	public void compararOutroPais(DadosPaises pai){
		tela.imprimirArgentina(pai);
	}

}

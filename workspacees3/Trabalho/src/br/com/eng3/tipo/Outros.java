package br.com.eng3.tipo;
import java.text.DecimalFormat;
import java.util.List;

import br.com.eng3.principal.BDAcidente;
import br.com.eng3.principal.Tela;


public class Outros implements ImpressaoVitima{

	
	private BDAcidente bda;
	private Tela tela;
	
	public Outros(BDAcidente bda,Tela tela){
		this.bda = bda;
		this.tela = tela;
		
	}
	public void imprimirVitima(Acidente v){
		
		tela.imprimirOutros(v);
	}
	


   
}
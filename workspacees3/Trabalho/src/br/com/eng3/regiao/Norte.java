package br.com.eng3.regiao;


import java.util.List;

import br.com.eng3.principal.BDAcidente;
import br.com.eng3.principal.Tela;
import br.com.eng3.tipo.Acidente;


public class Norte implements ImprimirVitimaRegiao{

	private BDAcidente bda;
	private Tela tela;
	int soma = 0;
	int cont = 0;

	public Norte(BDAcidente bda,Tela tela){
		this.bda = bda;
		this.tela = tela;
	}

	public void imprimirVitimaRegia(Acidente v){
		soma = soma + v.getTotalRegNorte();
		cont++;
		if(cont == 6){
			tela.imprimirNorte(soma);

		}
	}
}


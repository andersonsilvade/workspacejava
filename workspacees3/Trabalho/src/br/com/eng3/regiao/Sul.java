package br.com.eng3.regiao;
import java.util.List;

import br.com.eng3.principal.BDAcidente;
import br.com.eng3.principal.Tela;
import br.com.eng3.tipo.Acidente;


public class Sul implements ImprimirVitimaRegiao {

	private BDAcidente bda;
	private Tela tela;
	int soma = 0;
	int cont = 0;

	public Sul(BDAcidente bda ,Tela tela){
		this.bda = bda;
		this.tela = tela;
	}

	public void imprimirVitimaRegia(Acidente v){
		soma = soma + v.getTotalRegSul();
		cont++;
		if(cont == 6){
			tela.imprimirSul(soma);
		}
	}
}

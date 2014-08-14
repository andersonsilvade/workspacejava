package br.com.eng3.regiao;
import br.com.eng3.principal.BDAcidente;
import br.com.eng3.principal.Tela;
import br.com.eng3.tipo.Acidente;


public class Nordeste implements ImprimirVitimaRegiao{

	private BDAcidente bda;
	private Tela tela;
	int soma = 0;
	int cont = 0;

	public Nordeste(BDAcidente bda , Tela tela){
		this.bda = bda;
		this.tela = tela;
	}

	public void imprimirVitimaRegia(Acidente v){

		soma = soma + v.getTotalRegNordeste();
		cont++;
		if(cont == 6){		
			tela.imprimirNordeste(soma);
		}
	}
}

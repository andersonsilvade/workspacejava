package br.com.eng3.principal;

import br.com.eng3.tipo.Acidente;
import br.com.eng3.tipo.Auto;
import br.com.eng3.tipo.Caminhao;
import br.com.eng3.tipo.Ciclista;
import br.com.eng3.tipo.Moto;
import br.com.eng3.tipo.Onibus;
import br.com.eng3.tipo.Outros;
import br.com.eng3.tipo.Pedestre;
import br.com.eng3.tipo.Tipo;

public class Teste {

	public static void main(String[] args) {
		
		Facade facade = new Facade();
		facade.criarMVCAcidente();
		
		facade.criarMVCPais();
		
		facade.inicializar();
		facade.inicializarPais();
		 
		
		
		
		
	
	}
	
}

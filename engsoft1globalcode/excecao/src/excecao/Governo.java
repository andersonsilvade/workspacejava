package excecao;

import java.io.IOException;


public class Governo {
	
	public static void main(String[]args){
		Politico politico = new Politico();
		politico.corrupto=true;
		
		try{
			politico.usarDinheiroPublico();
		}catch(Manifestacao e){
		System.out.println("iniciar manifestação");
		}
	}

}

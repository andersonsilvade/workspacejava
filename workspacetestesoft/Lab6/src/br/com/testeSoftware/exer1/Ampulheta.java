package br.com.testeSoftware.exer1;

public class Ampulheta {
	
	public int condicao1(int maiorTempo,int menorTempo ){
		int tempo = menorTempo -(maiorTempo - menorTempo);
		System.out.println("tempo total cozimento "+tempoTotal(tempo, maiorTempo));
		if(tempo < 0){
			tempo = tempo*(-1);
		}
		return tempo;
	}
	
	public int tempoTotal(int tempo,int maiorTempo){
		int tempoTotal = tempo + maiorTempo;
		return tempoTotal;
		
	}

	

}

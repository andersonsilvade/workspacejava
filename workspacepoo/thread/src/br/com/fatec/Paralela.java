package br.com.fatec;

public class Paralela extends Thread{
	private String nome;
	public Paralela(String nome){
		this.nome = nome;
	}
	public void contagem(){
		int cont = 0;
		for(int i = 0; i < 10; i++){
			cont++;
			System.out.println("Contagem "+nome+": "+cont);
		}
	}
	@Override
	public void run(){
		this.contagem();
	}
}
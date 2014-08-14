package br.com.lab11.exe1;

public class Remover extends Thread {
	Agenda agenda ;
	
	public Remover(Agenda agenda){
		this.agenda = agenda;
	}
	@Override
	public void run(){
		agenda.removerContato();
	}

}

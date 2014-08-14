package br.com.lab10.exer1;

public class Adicionar extends Thread{
	
	Agenda agenda;
	
	public Adicionar(Agenda agenda){
		this.agenda = agenda;
	}
	
	@Override
	public void run(){
		agenda.addContato();	
	}

}

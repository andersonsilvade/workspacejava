package br.com.lab11.exe1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Aplicacao {

	public static void salvarAgenda(Agenda agenda) throws Exception{    	
		FileOutputStream escritaDisco = new FileOutputStream("agendaSet.ser");
		ObjectOutputStream escritaObjeto = new ObjectOutputStream(escritaDisco);
		escritaObjeto.writeObject(agenda);
		System.out.println("salvando ...");
		escritaObjeto.close();
		
	}
	public static Agenda recuperarAgenda() throws IOException, ClassNotFoundException{
		FileInputStream ler = new FileInputStream("agendaSet.ser");
		ObjectInputStream lerDisco = new ObjectInputStream(ler);
		Agenda agenda = (Agenda) lerDisco.readObject();
		lerDisco.close();
		
		return agenda;
	}
	public static void main(String[] args) throws Exception, IOException {
		Scanner scanner = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		 int sair = 0;
		 int opcao = 0;
		 while(sair == 0){
			 switch(opcao){
			 case 0 :{
				 //recuperarAgenda();
				 agenda.menu();
				 opcao = scanner.nextInt();
				 break;
			 }
			 case 1:{
				 Adicionar add = new Adicionar(agenda);
				 add.run();
				 salvarAgenda(agenda);
				 opcao = 0;
				 break;
			 }
			 case 2:{
				 Remover rem = new Remover(agenda);
				 rem.start();
				 salvarAgenda(agenda);
				 opcao = 0;
				 break;
				 
			 }
			 case 3:{
				 recuperarAgenda();
				 opcao = 0;
				 break;
			 }
			 case 4:{
				 agenda.setComp(new Ordenar());
				 agenda.listarContatos();
				 opcao = 0;
				 break;
			 }
			 	default :{
				 agenda.menu();
				 opcao = scanner.nextInt();
				 break;
				 
			 }
			 }


	}

}
}

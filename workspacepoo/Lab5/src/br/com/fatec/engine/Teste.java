package br.com.fatec.engine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Teste {
	
public static void salvarAgenda(Agenda agenda) throws Exception{    	
    	FileOutputStream escritaDisco = new FileOutputStream("agenda.ser");
		ObjectOutputStream escritaObjeto = new ObjectOutputStream(escritaDisco);
		escritaObjeto.writeObject(agenda);
		escritaObjeto.close();
    }
public static Agenda recuperarAgenda() throws IOException, ClassNotFoundException{
	FileInputStream ler = new FileInputStream("agenda.ser");
	ObjectInputStream lerDisco = new ObjectInputStream(ler);
	Agenda agenda = (Agenda) lerDisco.readObject();
	lerDisco.close();
	return agenda;
}

	public static void main(String args[]) throws Exception{
		
		 Scanner scanner = new Scanner(System.in);
		 Agenda agenda = new Agenda();
		 int sair = 0;
		 int opcao = 0;
		 while(sair == 0){
			 switch(opcao){
			 case 0 :{
				 agenda = recuperarAgenda();
				 agenda.imprimirOpcao();
				 opcao = scanner.nextInt();
				 break;
			 }
			 case 1:{
				 agenda = recuperarAgenda();
				 agenda.addAluno();
				 salvarAgenda(agenda);
				 opcao = 0;
				 break;
			 }
			 case 2:{
				 agenda = recuperarAgenda();
				 agenda.addProfessor();
				 salvarAgenda(agenda);
				 opcao = 0;
				 break;
			 }
			 
			 case 3:{
				 agenda.listarTodos();
				 opcao = 0;
				 break;
			 }
			 case 4:{
				 String nome;
				 System.out.println("Digite o nome do aluno: ");
				 nome = scanner.next();
				 agenda.excluirAluno(nome);
				 salvarAgenda(agenda);
				 opcao = 0;
				 break;
			 }
			 case 5:{
				 String nome;
				 System.out.println("Digite o nome do professor: ");
				 nome = scanner.next();
				 agenda.excluirProfessor(nome);
				 salvarAgenda(agenda);
				 opcao = 0;
				 break;
			 }
			 case 6:{
				 agenda.editarContato();
				 salvarAgenda(agenda);
				 opcao = 0;
				 break;
			 }
			 case 7:{
				 salvarAgenda(agenda);
				 System.out.println("Agenda salva com sucesso");
				 opcao = 0;
				 break;
				 }
			 case 8:{
				 agenda = recuperarAgenda();
				 System.out.println("Agenda recuperada com sucesso");
				 opcao = 0;
				 break;
			 }
			 case 9:{
				 sair = 1;
				 System.out.println("Fuiiiiii");
				 break;
				  }
			 default:{
				 
				 agenda.imprimirOpcao();
				 opcao = scanner.nextInt();
				 break;
			 }
			 }
		 }
		 
	}
	
}

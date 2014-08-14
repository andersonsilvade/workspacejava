package br.com.fatec.engine;

import java.util.Scanner;


public class Teste {

	public static void main(String args[]){
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		 Agenda agenda = new Agenda();
		 int sair = 0;
		 int opcao = 0;
		 while(sair == 0){
			 switch(opcao){
			 case 0 :{
				 agenda.imprimirOpcao();
				 opcao = scanner.nextInt();
				 break;
			 }
			 case 1:{
				
				 agenda.addAluno();
				 opcao = 0;
				 break;
			 }
			 case 2:{
				 agenda.addProfessor();
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
				 opcao = 0;
				 break;
			 }
			 case 5:{
				 String nome;
				 System.out.println("Digite o nome do professor: ");
				 nome = scanner.next();
				 agenda.excluirProfessor(nome);
				 opcao = 0;
				 break;
			 }
			 case 6:{
				 agenda.editarContato();
				 opcao = 0;
				 break;
			 }
			 case 7:{
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

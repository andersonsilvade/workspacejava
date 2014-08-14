package br.com.aplicativo1;

import java.util.Scanner;

public class Aplicacao {

	private static Scanner scanner;
	
	public static void main(String args[]){
		 scanner = new Scanner(System.in);
		 AgendaTelefonica agenda = new AgendaTelefonica();
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
				 agenda.imprimirPessoas();
				 opcao = 0;
				 break;
			 }
			 case 2:{
				 agenda.cadastrarPessoa();
				 opcao = 0;
				 break;
			 }
			 
			 case 3:{
				 String nome;
				 System.out.println("Digite o nome a ser excluido: ");
				 nome = scanner.next();
				 agenda.excluirPessoa(nome);
				 opcao = 0;
				 break;
			 }
			 case 4:{
				 sair = 1;
				 System.out.println("Até mais");
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

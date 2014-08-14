package br.com.exe6;

import java.util.Scanner;






public class Teste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		Cliente cliente = new Cliente();
		
		 int sair = 0;
		 int opcao = 0;
		 while(sair == 0){
			 switch(opcao){
			 case 0 :{
				 cliente.menuOpcao();
				 opcao = entrada.nextInt();
				 break;
			 }
			 case 1:{
				 cliente.cadastrarCliente();
				 opcao = 0;
				 break;
			 }
			 case 2:{
				 String m;
				 String nome;
				 double v;
				System.out.println("Digite o mês no formato (Jan):  ");
				m = entrada.next();
				System.out.println("Digite o valor da compra: ");
				v = entrada.nextDouble();
				System.out.println("Digite o nome do cliente: ");
				nome = entrada.next();
				cliente.realizarCompra(m, v, nome);
				 opcao = 0;
				 break;
			 }
			 
			 case 3:{
				 String nome;
				 System.out.println("Digite o nome do cliente: ");
				 nome = entrada.next();
				 cliente.imprimirGastoMes(nome);
				 opcao = 0;
				 break;
			 }
			 case 4:{
				 String nome;
				 System.out.println("Digite o nome do cliente: ");
				 nome = entrada.next();
				 cliente.imprimirGastoTotal(nome);
				 opcao = 0;
				 break;
				 }
			 
			 case 5:{
				 cliente.ListarClientes();
				 opcao = 0;
				 break;
			 }
			 case 6:{
				 cliente.maiorComprador();
				 opcao = 0;
				 break;
				 
			 }
			 case 7:{
				 String nome;
				 System.out.println("Digite o nome do cliente a ser excluido: ");
				 nome = entrada.next();
				 cliente.excluirCliente(nome);
				 opcao = 0;
				 break;
			 }
			 
			 case 8:{
				 sair = 1;
				 System.out.println("Até mais");
				 break;
			 }
			 default:{
				 cliente.menuOpcao();
				 opcao = entrada.nextInt();
				 break;
			 }
			 }
		 }
		 
	}
		
		
		 
	
		
		
	}



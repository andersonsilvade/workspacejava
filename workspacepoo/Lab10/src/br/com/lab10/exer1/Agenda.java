package br.com.lab10.exer1;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Agenda implements Serializable {
	
	
	private List<Contato>listaContatos ;
	private Contato contato;
	transient Scanner entrada ;
	
	public Agenda(){
		listaContatos = new LinkedList<Contato>();
		entrada = new Scanner(System.in);
	}
	
	
	public void addContato(){
		if(entrada == null)entrada = new Scanner(System.in);
		System.out.println("Adicionando contato");
		System.out.println("");
		String nome;
		String email;
		String tel;
		System.out.println("Insira uma nome: ");
		nome = entrada.nextLine();
		System.out.println("Insira uma email: ");
		email = entrada.next();
		System.out.println("Insira um telefone: ");
	    tel = entrada.next();
		contato = new Contato(nome, email, tel);
		listaContatos.add(contato);
		System.out.println("Contato adicionado com sucesso!!!");
	}
	
	public void removerContato(){
		if(entrada == null)entrada = new Scanner(System.in);
		boolean check = false;
		System.out.println("Removendo contato");
		System.out.println("");
		System.out.println("Insira o nome: ");
		String nome = entrada.nextLine();
		if(!listaContatos.isEmpty()){
			for(Object i : listaContatos){
				Contato c = (Contato) i;
				if(c.getNome().equalsIgnoreCase(nome)){
					listaContatos.remove(c);
					check = true;
					break;
				}
				}
		}
		if(check == false){
			System.out.println("Contato não encontrado!!");
		}
	}
	public void menu(){
		System.out.println("ESCOLHA UMA OPÇÃO ABAIXO ");
		System.out.println("1 - ADICIONAR CONTADO ");
		System.out.println("2 - REMOVER CONTADO ");
		System.out.println("3 - RECUPERAR AGENDA");
		System.out.println("4 - LISTAR CONTATOS");
	}
	public void listarContatos(){

		for(Object i : listaContatos){
			Contato con = (Contato) i;
			System.out.println("Nome: "+con.getNome());
			System.out.println("Telefone: "+con.getTelefone());
			System.out.println("Email: "+con.getEmail());
			
			
		}
	}
	

}

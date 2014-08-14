package br.com.lab11.exe1;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


@SuppressWarnings("serial")
public class Agenda implements Serializable {
	
	
	private Set<Contato>listaContatos ;
	private Contato contato;
	transient Scanner entrada ;
	private Comparacao comp;
	
	public Agenda(){
		listaContatos = new HashSet<Contato>();
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
		nome = entrada.next();
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
	
	public void setComp(Comparacao comp) {
		this.comp = comp;
	}


	public void listarContatos(){
		List lista = new LinkedList<>();
		for(Object i : listaContatos){
			Contato conta = (Contato)i;
			if(conta!=null)lista.add(conta);
		}
		
	      comp.comparar(lista);
		
	}
	

}

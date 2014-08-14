package br.com.aplicativo1;

import java.util.Scanner;

public class AgendaTelefonica { 
	
	private Pessoa[] pessoas;
	private Scanner scanner;
	
	public AgendaTelefonica(){
		pessoas = new Pessoa[5];
		scanner = new Scanner(System.in);
	}
	public void cadastrarPessoa(){
		
		for (int i = 0; i < pessoas.length;i++){
			if(pessoas[i] == null){
				System.out.println("Insira um nome: ");
				String nome = scanner.next();
				System.out.println("Insira um telefone: ");
				String telefone = scanner.next();
				System.out.println("Insira um email: ");
				String email = scanner.next();
				Pessoa nova = new Pessoa(nome,telefone,email);
				pessoas[i] = nova;
				System.out.println("Novo contato adicionado!!!");
				break;
			}
		}
	}
	
	public void imprimirOpcao(){
		System.out.println("Escolha uma das opções!!!");
		System.out.println("1 - Listar contatos ");
		System.out.println("2 - Incluir contatos");
		System.out.println("3 - Excluir contato");
		System.out.println("4 - Sair");
		}
	public void imprimirPessoas(){
		int contato = 0;
		for(Pessoa pessoa:pessoas){
			if(pessoa!=null){
				System.out.println("Nome: "+pessoa.getNome());
				System.out.println("Telefone: "+pessoa.getTelefone());
				System.out.println("Email: "+pessoa.getEmail());
				System.out.println("###########################");
				contato++;
			}
		}
		if(contato == 0){
			System.out.println("Você não tem contatos em sua agenda!!!");
		}
	}
	public Pessoa[] getPessoas() {
		return pessoas;
	}
	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}
	public void excluirPessoa(String nome){
		for(int i = 0; i < pessoas.length;i++){
			if(pessoas[i] != null){
				if(pessoas[i].getNome().equalsIgnoreCase(nome))
				pessoas[i] = null;
				break;
			}
		}
		
		
		
	}
	

}

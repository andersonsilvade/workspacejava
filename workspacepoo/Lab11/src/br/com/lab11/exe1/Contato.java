package br.com.lab11.exe1;

import java.io.Serializable;
import java.util.Set;

@SuppressWarnings("serial")
public class Contato implements Serializable,Comparable<Contato> {
	
	private String nome;
	private String email;
	private String telefone;
	
	public Contato(String nome, String email, String telefone) {
        this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public  int compareTo(Contato contato) {
		int retorno = 0;
		if(this.nome.toString().compareTo(contato.toString() )==-1){
			retorno = -1;
		}else if(this.nome.toString().compareTo(contato.toString() )== 1){
			retorno =  1;
		}
		
		return retorno;
	}
		

}

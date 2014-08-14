package br.com.lab11.exe1;

import java.util.Collections;
import java.util.List;

public class Ordenar implements Comparacao{
      Contato ctt ;
	@Override
	public void comparar(List<Contato> contato) {
		   Collections.sort(contato);
		   
		   for(Object i : contato){
				Contato con = (Contato) i;
				System.out.println("Nome: "+con.getNome());
				System.out.println("Telefone: "+con.getTelefone());
				System.out.println("Email: "+con.getEmail());
				
				
			}
		
	}

}

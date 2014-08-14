/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.globalcode.aj3.teste;

//import Pessoa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import br.com.globalcode.aj3.beans.Cliente;

public class TesteMap {

	public static void main(String args[]) {
		Cliente c1 = new Cliente("Cliente1", "1111", "cpf1");
		Cliente c2 = new Cliente("Cliente2", "2222", "cpf2");
		Cliente c3 = new Cliente("Cliente3", "3333", "cpf3");
		Cliente c4 = new Cliente("Cliente4", "4444", "cpf3");

		Map clientes = new LinkedHashMap();

		clientes.put(c1.getCpf(), c1);
		clientes.put(c2.getCpf(), c2);
		clientes.put(c3.getCpf(), c3);
		clientes.put(c4.getCpf(), c4);

		// Imprima o nome de todos os clientes que estao no Map
        
		
		for(Object valor : clientes.keySet()){			
			Cliente pessoa = (Cliente)clientes.get(valor);
			System.out.println(pessoa.getNome());
	}
}
}
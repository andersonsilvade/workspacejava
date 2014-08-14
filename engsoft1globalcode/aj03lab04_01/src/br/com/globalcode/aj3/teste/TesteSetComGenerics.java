package br.com.globalcode.aj3.teste;

import java.util.Collection;
import java.util.HashSet;

import br.com.globalcode.aj3.beans.Cliente;

public class TesteSetComGenerics {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Cliente1", "1111", "cpf1");
		Cliente c2 = new Cliente("Cliente2", "2222", "cpf2");
		Cliente c3 = new Cliente("Cliente3", "3333", "cpf3");
		Cliente c4 = new Cliente("Cliente4", "4444", "cpf4");
		
		//a. Defini��o de uma cole��o de tipo HashSet usando Generics
		Collection <Cliente>clientes = new HashSet<Cliente>();
		//b. Adi��o dos clientes na cole��o
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
       
		//c. Impress�o do nome dos clientes da cole��o
       
         for(Cliente print: clientes){
        	System.out.println(print);
          
        }
	}
}


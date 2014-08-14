package br.com.lab8.exer1;

import java.io.File;



public class Exercicio1 {
	
	public static void imprimir(File arquivo){
		
		System.out.println(arquivo);
		if(arquivo.isDirectory()){
			File[] arquivos = arquivo.listFiles();
			for(File elemento : arquivos){
				if(elemento.isDirectory()){
					try{
					imprimir(elemento);
					}catch(Exception e){
						System.out.println(e.getMessage());
					}
				}else{
					System.out.println(elemento);
				}
			}
		}
	}
	
	
	
	
	public static void main(String [] args){
		File selecionando = new File("C:\\");
		imprimir(selecionando);
		

	}
}
package br.com.fatec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Escrita {

	public static void main(String[] args) throws IOException {
		
		FileWriter escrita = new FileWriter("arquivojava.txt");
		escrita.write("Hello Word");
		escrita.close();
		
		//File usado para colocar restrições ao arquivo como leitura escrita
		File arquivo = new File("Arquivo.txt");
		FileWriter escrita2 = new FileWriter(arquivo);
		escrita2.write("Hello Word");
		escrita2.close();
		arquivo.canRead();//verifica se pode ser escritoriando diretorio*/
		
		//criando diretotio
		/*File arquivo2 = new File("Pasta Teste");
		arquivo2.mkdir();*/
		//verificando diretorio
		File selecionando = new File("C:\\django\\django");	 
		if(selecionando.isDirectory()){
			String[] elementos = selecionando.list();
			for(String elemento : elementos){
				if(elemento.equals("django")){
				System.out.println(elemento);
				}
			}
		}
		File leitor = new File("G:\\4ºADS\\EngSoft3\\TRABALHO2.txt");
		FileReader ler = new FileReader(leitor);
		BufferedReader bufferLeitor = new BufferedReader(ler);
		String linha = bufferLeitor.readLine();
		String[] elementos2;
		while(linha != null){
			elementos2 = linha.split(" ");
			for(String elemento:elementos2){
				System.out.println(elemento);
			}
			linha = bufferLeitor.readLine();
		}
		ler.close();

	}

}

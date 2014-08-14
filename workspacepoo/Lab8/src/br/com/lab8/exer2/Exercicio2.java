package br.com.lab8.exer2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio2 {

	public static void main(String[] args) throws IOException {
		StringBuilder builder = new StringBuilder();
		FileWriter escrita = new FileWriter("arquivoEmails.txt");
		
		 File arquivo = new File("G:\\4ºADS\\programaca orietada objeto\\Nova pasta\\emails.txt");
		 FileReader ler = new FileReader(arquivo);
		  BufferedReader buffer = new BufferedReader(ler);
		 String linha = buffer.readLine();
		 
		 System.out.println("iniciando Processo");
		 while (linha != null){
			 if(linha.contains("@")){
				 try{
				     builder.append(System.getProperty("line.separator"));
					 builder.append(linha);

				 }catch(Exception e){
					 System.out.println(e.getMessage());
				 }
			 }
			 linha = buffer.readLine();
		 }
			escrita.write(builder.toString()); 
			 escrita.close();
			 System.out.println("Finalizando Processo");
		 }
		 
		 

	}



package br.com.revisao.ifelsefor;

import java.util.Scanner;

public class Revisaoifelse {

	public static void main(String[] args) {
		
		
		Scanner ent = new Scanner(System.in);
		 int n1;
		 int n2;
		 
		 System.out.println("Digite um número: ");
		 
		 n1 = ent.nextInt();
		 
		 System.out.println("Digite um outro número: ");
		 n2 = ent.nextInt();
		 
		 if(n1 > n2){
			 System.out.println("o  número 1 é maior que o número 2!!!!");
		 }
		 else if(n1 < n2){
			 System.out.println("o  número 2 é maior que o número 1!!!!");
		 }
		 if(n1 == n2){
			 System.out.println("os 2 números são iguais!!!!!");
			 
		 }
		 else if (n1 != n2){
			 System.out.println("números diferentes!!!!!!");
		 }
		 
		 int quant = 8;
		 while(quant > 0){
			 System.out.println(quant);
			 quant--;
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		

	}

}

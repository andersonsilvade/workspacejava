package br.com.revisao.ifelsefor;

import java.util.Scanner;

public class Revisaoifelse {

	public static void main(String[] args) {
		
		
		Scanner ent = new Scanner(System.in);
		 int n1;
		 int n2;
		 
		 System.out.println("Digite um n�mero: ");
		 
		 n1 = ent.nextInt();
		 
		 System.out.println("Digite um outro n�mero: ");
		 n2 = ent.nextInt();
		 
		 if(n1 > n2){
			 System.out.println("o  n�mero 1 � maior que o n�mero 2!!!!");
		 }
		 else if(n1 < n2){
			 System.out.println("o  n�mero 2 � maior que o n�mero 1!!!!");
		 }
		 if(n1 == n2){
			 System.out.println("os 2 n�meros s�o iguais!!!!!");
			 
		 }
		 else if (n1 != n2){
			 System.out.println("n�meros diferentes!!!!!!");
		 }
		 
		 int quant = 8;
		 while(quant > 0){
			 System.out.println(quant);
			 quant--;
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		

	}

}

package br.com.exer8;

import java.util.Scanner;

public class Criptografado {

	public static void main(String[] args) {
		
	    int numero ;
	    int criptografado[] = new int[4];
	    char a;
	    
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Digite um número de 4 digitos: ");
	      numero = entrada.nextInt();
	     
	    char[] digitos = String.valueOf( numero ).toCharArray();  
	      
	  
	    
	    for (int i = 0; i < digitos.length;i++){
	    	 a = digitos[i];
	    	criptografado[i]= (Character.getNumericValue(a)+7)%10;
	    } 	
	    	
	    for ( int d : criptografado ) {  
	        System.out.print( d );  
	    }  

	}

}

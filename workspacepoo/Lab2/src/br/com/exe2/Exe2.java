package br.com.exe2;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número : ");
		
		a = entrada.nextInt();
        
		
		System.out.println("Digite outro número: ");
		
		b = entrada.nextInt();
		
		System.out.println("Soma: "+(a + b));
		System.out.println("Média: "+(float)(a + b)/2);
		
		if(a >= b){
			System.out.println("Ordem crescente : "+b+" "+a);
		}else{
			System.out.println("Ordem crescente : "+a+" "+b);
		}
		
		
		

	}

}

package br.com.exe1;

import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		
		
		int a;
		int b;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número : ");
		
		a = entrada.nextInt();
        
		
		System.out.println("Digite outro número: ");
		
		b = entrada.nextInt();
		
		System.out.println("Soma "+(a + b));
		System.out.println("Subtração: "+(a - b));
		System.out.println("Divisão: "+ (a / b));
		System.out.println("Multiplicação: "+ (a * b));
		
		
		
		
		
		
	}

}

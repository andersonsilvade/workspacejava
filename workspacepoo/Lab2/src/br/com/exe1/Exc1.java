package br.com.exe1;

import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		
		
		int a;
		int b;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero : ");
		
		a = entrada.nextInt();
        
		
		System.out.println("Digite outro n�mero: ");
		
		b = entrada.nextInt();
		
		System.out.println("Soma "+(a + b));
		System.out.println("Subtra��o: "+(a - b));
		System.out.println("Divis�o: "+ (a / b));
		System.out.println("Multiplica��o: "+ (a * b));
		
		
		
		
		
		
	}

}

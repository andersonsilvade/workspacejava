package br.com.exe4;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		int a;
		int b;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero : ");
		
		a = entrada.nextInt();
        
		
		System.out.println("Digite outro n�mero: ");
		
		b = entrada.nextInt();
		
		if(a % b == 0){
			System.out.println("N�mero multiplo!!!");
			
		}else{
			System.out.println("N�mero n�o � multiplo!!!");
		}

	}

}

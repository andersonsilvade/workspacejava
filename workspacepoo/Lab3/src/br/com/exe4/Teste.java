package br.com.exe4;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplo m = new Multiplo();
		double num1 ;
		double num2 ;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = entrada.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		num2 = entrada.nextDouble();
	
		if(m.multiplo(num1, num2) == true){
			System.out.println("N�meros m�ltiplos");
		}else{
			System.out.println("N�meros n�o s�o m�ltiplos");
		}
		

	}

}

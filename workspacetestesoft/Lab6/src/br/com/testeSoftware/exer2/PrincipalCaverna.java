package br.com.testeSoftware.exer2;

import java.util.Scanner;

public class PrincipalCaverna {

	public static void main(String[] args) {
		Caverna cav = new Caverna();
		System.out.println("digite o tamanho do circulo ");
		Scanner entrada = new Scanner(System.in);
		Integer tamanho = entrada.nextInt();
		cav.addCirculo(tamanho);


		System.out.println("digite a posição inicial");
		int posicao = entrada.nextInt();
		System.out.println("Passo ");
		int passo = entrada.nextInt();
		cav.removerCirculo(posicao,passo);


	  
	}

}

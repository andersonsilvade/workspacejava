package br.com.testeSoftware.exer1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Ampulheta  amp = new Ampulheta();
		Scanner entrada = new Scanner(System.in);
		int a,b;
		System.out.println("Digite o maior tempo");
		a = entrada.nextInt();
		System.out.println("Digite o menor tempo");
		b = entrada.nextInt();
		int tempoMiojo;
		System.out.println("Digite o tempo de preparo do miojo ");
		tempoMiojo = entrada.nextInt();
		while(tempoMiojo > b){
			System.out.println("Tempo inválido ");
			System.out.println("Digite o tempo de preparo do miojo ");
			tempoMiojo = entrada.nextInt();
		}
		int tempoCozimento = amp.condicao1(a, b);
		if(tempoMiojo == tempoCozimento){
		System.out.println("É possivel cozinhar o miojo no tempo exato");
		}else{
			System.out.println("Impossivel cozinhar o miojo no tempo exato");
		}

	}

}

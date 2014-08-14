package br.com.lab10.exer2;

import java.util.Scanner;

public class PrincipalBuraco {

	public static void main(String[] args) {
		AchaBuraco ab = new AchaBuraco();
		Scanner entrada = new Scanner(System.in);
		String texto;
		System.out.println("Digite um texto ");
		texto = entrada.nextLine();
		
		ab.achaBuraco(texto);
		

	}

}

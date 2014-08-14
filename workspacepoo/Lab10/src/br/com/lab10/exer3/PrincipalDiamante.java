package br.com.lab10.exer3;

import java.util.Scanner;

public class PrincipalDiamante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String letra;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma letra ");
		letra = entrada.next();
		
		Diamante.diamante(letra);

	}

}

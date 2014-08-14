package br.com.exe3;

import java.util.Scanner;
import java.util.Vector;

public class Exe3 {

	public static void main(String[] args) {
		
		int vetor [];
		vetor = new int[5];
		Scanner entrada = new Scanner(System.in);
		int i ;
		int maior = 0 ;
		int menor = 0;
		
		for(i = 0 ; vetor.length > i;i++){
			System.out.println("digite o número["+ (i+1)+"]");
			
			vetor[i] = entrada.nextInt();
			maior = vetor[i];
			menor = vetor[i];
			
		}
		for(i = 0 ; vetor.length > i;i++){
			if(vetor[i] > maior){
				maior = vetor[i];
			}
			if(vetor[i] < menor){
				menor = vetor[i];
			}
		
		}
		System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
}
}

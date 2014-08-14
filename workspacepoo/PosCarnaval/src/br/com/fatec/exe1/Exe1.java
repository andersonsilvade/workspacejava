package br.com.fatec.exe1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		DecimalFormat formatado = new DecimalFormat("0.00");
		int n ;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("quantos números serão comparados: ");
		n = entrada.nextInt();
		
		int numeros[] = new int[n];
		int maior = 0;
		int menor = 0;
		for(int i = 0;i < n ; i++){
			System.out.println("digite o "+(i+1)+"º número");
			numeros[i] = entrada.nextInt();
			maior = numeros[i];
			menor = numeros[i];
		}
		
		
		double media = 0;
		int quant = 0;
		for(int i = 0;i < n;i++){
			
			if(numeros[i] > maior){
				maior = numeros[i];
			}
			if(numeros [i] < menor){
				menor = numeros[i];
			}
			media = media + numeros[i];
			quant = i + 1;
		}
		System.out.println(" Valor máximo = "+maior+ "\n Valor minimo =  "+menor+"\n quantidade de elementos =  "+quant+"\n Média = "+formatado.format(media/n));
		
		
		
	}

}

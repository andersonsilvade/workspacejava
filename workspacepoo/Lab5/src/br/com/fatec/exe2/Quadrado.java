package br.com.fatec.exe2;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		int lado = 0, i=0;

		while ((lado < 1)||(lado > 20))
		{
			System.out.print("Digite o tamanho do lado: ");
			lado = input.nextInt();
		}

		for (int j = 0; j < lado; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		i++;

		
		while(i <= lado-2)
		{
			System.out.print("*"); 
			for(int j = 0;j <= lado-3; j++) 
				System.out.print(" ");
			System.out.println("*"); 
			i++;
		}

		
		if(lado>1) 
			for (int j = 0; j < lado; j++)
			{
				System.out.print("*");
			}
	    
	    
			
		
	}
}
	



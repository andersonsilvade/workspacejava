package br.com.exe5;

import java.lang.reflect.Array;


public class Primos {
	
	int cont;
	int cont2;
	
	public void verificarPrimo(int n){
		
		int x = n;
		
           while(x > 0){
			
			if (n % x == 0){
				cont++;
						}
			x--;
		}
		
		
           if (cont==2){
           	System.out.print(n+" ");
           	cont2++;
           	if(cont2 == 10){
           		System.out.println("");
           		cont2 = 0;
           	}
              }
           cont = 0;
		
	}
	
		
}

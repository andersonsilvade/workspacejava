package math;

import java.util.Scanner;

public class Raiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		float raiz;
		float prova;
		
	    Scanner sc = new Scanner(System.in);
			
		System.out.print("um numero ");
			
		n = sc.nextInt();
		
		raiz = (float) Math.sqrt(n+(5*3));
		
		System.out.println(Math.pow(5, 2));
		
		System.out.println(raiz);
		prova = raiz*raiz;
		
		System.out.println(prova);
		
		

	}

}




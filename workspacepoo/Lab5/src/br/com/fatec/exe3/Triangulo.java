package br.com.fatec.exe3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int c;
		int hip = 0;
		int cA = 0;
		int cB = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o lado A: ");
		a = entrada.nextInt();
		System.out.println("Digite o lado B: ");
		b = entrada.nextInt();
		System.out.println("Digite o lado C: ");
		c = entrada.nextInt();

		if(a >= b && a >=c){
			hip = a;
			cA = b;
			cB = c;
		}
		if(b >= a && b>=c){
			hip = b;
			cA = c;
			cB = a;
					
		}
		if(c >a && c >b ){
			hip = c;
			cA = a;
			cB = b;
		}
		
		System.out.println("hipotenusa: "+hip);
		System.out.println("cateto1: "+cA);
		System.out.println("cateto2: "+cB);
		
		if(hip ==(int) Math.sqrt( Math.pow(cA, 2)+Math.pow(cB, 2))){
			System.out.println("Essas medidas podem representar um tri�ngulo ret�ngulo");
		}else{
			System.out.println("Essa medidas n�o representam as medidas de um tri�ngulo ret�ngulo");
		}
	}

}

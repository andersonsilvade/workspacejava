package engSoft2aula1aquecimento;

import java.util.Scanner;
//escreva um programa que lei a idade da pessoa e fala sua classe eleitoral
public class excercio5 {
	public static void main(String[] args) {
		
	
	int n;
	
    Scanner sc = new Scanner(System.in);
		
	System.out.print("Digite a idade: ");
		
	n = sc.nextInt();
	
	if( n < 16){
		System.out.println("não eleitor");
	}else if ((n >=18) && (n <70)){
		System.out.println("Eleitor obrigatorio");
	}else{
		System.out.println("Eleitor facultativo");
	}
	}
}

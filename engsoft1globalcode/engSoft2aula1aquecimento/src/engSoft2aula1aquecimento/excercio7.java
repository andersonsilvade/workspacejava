package engSoft2aula1aquecimento;

import java.util.Scanner;

public class excercio7 {

	public static void main(String[] args) {
		//verificar qual é maior
		
		int n;
		int maior = 0;
		int aux;
		
	    Scanner sc = new Scanner(System.in);
			
		System.out.print("Quantidade de numeros a ser verificado: ");
			
		n = sc.nextInt();
		
		for (int i = 0;i < n ;i++){
			System.out.println("digite um numero");
			aux = sc.nextInt();
			
			if(maior >= aux){
				maior = maior;
			}else{
				maior = aux;
			}
			
		}
		System.out.println(maior);
       
	}

}

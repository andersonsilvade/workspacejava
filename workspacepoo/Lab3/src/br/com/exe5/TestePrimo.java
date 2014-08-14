package br.com.exe5;

public class TestePrimo {

	public static void main(String[] args) {
		
		Primos primo = new Primos();
		
		int [] array = new int [1000];
		int n = 1;
		
		for(int i = 0; i <array.length;i++){
			array[i] = n;
			n++;
		}
		
		System.out.println("Imprimindo números primos entre 2 a 999");
		for(int i = 1; i <array.length;i++){
			primo.verificarPrimo(array[i]);
		}
		
		

	}

}

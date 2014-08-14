package br.com.fatec.exe2;

import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Conversao conv = new Conversao();
		
		int opcao;
		
		System.out.println("1 - DECIMAL PARA ROMANO");
		System.out.println("2 - ROMANO PARA DECIMAL");
		opcao = entrada.nextInt();
		if(opcao == 1){	
			
			int num;
			System.out.println("Digite o número: ");
			num = entrada.nextInt();
			while (num >3999){
				System.out.println("fora do range tente novamente: ");
				num = entrada.nextInt();
			}
			System.out.println("Romano "+conv.converterDecimal(num));
			}
		if(opcao == 2){
			String roma;
			System.out.println("Digite o número");
			roma = entrada.next();
			System.out.println("Romano "+conv.converterRomano(roma));
			}
	}

}

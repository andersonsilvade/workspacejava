package engSoft2aula1aquecimento;

import java.util.Scanner;

public class excercio8 {
//calcular o valor de financiamento,usando juros composto,entrar com valor do financiamento e numero de parcelas e o juros mensal
	public static void main(String[] args) {
	
         float financiado ;
         int parcelas;
         float juros;
         float finatotal;
         float valorPar;
         Scanner sc = new Scanner(System.in);
 		
 		System.out.print("Digite o valor a ser financiado: ");
 			
 		financiado = sc.nextFloat();
 		
 		System.out.println("Digite a quantidade de parcelas: ");
 		
 		parcelas = sc.nextInt();
 		
 		System.out.println("Digite o valor do  juros mensal: ");
 		
 		juros = sc.nextFloat();
 		
 		juros = juros/100;
 		
        
 		for(int i = 0;i < parcelas;i++){
 			
 			financiado =financiado+( financiado*juros); 
 			
 			
 		}
 		 
 		valorPar = financiado/parcelas;
 		
 		System.out.printf("voce vai pagar: "+parcelas+" parcelas de "+valorPar);
	}

}

package br.com.exe2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TesteVendas {

	public static void main(String[] args) {
		DecimalFormat decimal = new DecimalFormat( "0.00" );
		Vendas venda = new Vendas();
		Scanner entrada = new Scanner(System.in);
		int opcao =  0;
		double valorTotal = 0;
		double reembolso[] = new double[5];
		double valor[] = new double[5];
		int sair = 0;
		int qtdd = 0;
		String x [] = new String[5];
		double valorTotalReembolso = 0;
		
		while(sair == 0){
			switch(opcao){
			case 0:{
				venda.escolhaOpcao();
				opcao=entrada.nextInt();
				break;
				
			}
			case 1:{
				
				System.out.println("Digite a quantidade: ");
				qtdd = entrada.nextInt();
				x[0] = "P1";
				valor[0]= venda.preco[0]*qtdd;
				reembolso[0] = venda.preco[0]*0.05;
				opcao = 0;
				break;
			      }
			case 2:{
					
				System.out.println("Digite a quantidade: ");
				qtdd = entrada.nextInt();
				x[1] = "P2";
                valor[1]= venda.preco[1]*qtdd;
				reembolso[1] = venda.preco[1]*0.05;
				opcao = 0;
				break;
				}
			case 3:{
						
				System.out.println("Digite a quantidade: ");
				qtdd = entrada.nextInt();
				x[2] = "P3";
				valor[2]= venda.preco[2]*qtdd;
				reembolso[2] = venda.preco[2]*0.05;
				opcao = 0;
				break;
					}
			case 4:{
				System.out.println("Digite a quantidade: ");
			    qtdd = entrada.nextInt();
				x[3] = "P4";
				valor[3]= venda.preco[3]*qtdd;
				reembolso[3] = venda.preco[3]*0.05;
				opcao = 0;
				break;
				    }
			case 5:{
				System.out.println("Digite a quantidade: ");
				qtdd = entrada.nextInt();
				x[4] = "P5";
				valor[4]= venda.preco[4]*qtdd;
				reembolso[4] = venda.preco[4]*0.05;
				opcao = 0;
				break;
				  }
			case 6:{
				for (int i = 0 ;i < x.length ;i++){
					valorTotal = valorTotal + valor[i];
			        if(x[i] != null){
						  System.out.println("codigo: "+x[i]);
						  System.out.println("Reembolso: "+decimal.format(reembolso[i])+"R$");
						  System.out.println("Valor: "+decimal.format(valor[i])+"R$");
						  System.out.println("-------------------------");
						  valorTotalReembolso = valorTotalReembolso + reembolso[i];
						     	   }
						        }
					
					System.out.println("Valor total : "+decimal.format(valorTotal)+"R$");
					System.out.println("Total reembolso: "+decimal.format(valorTotalReembolso)+"R$");
					System.out.println("Valor a ser pago: "+decimal.format((valorTotal - valorTotalReembolso))+"R$");
					System.out.println("");
					for(int z = 0; z < x.length;z++ ){
						if(x[z]!=null){
							System.out.println("Compra do produto: "+x[z]+" corresponde a "+decimal.format((valor[z]/valorTotal)*100)+"% da venda");
							
						}
					}
					sair = 1;
					break;
				        }
			}
		}
		

	
	
       

}
}


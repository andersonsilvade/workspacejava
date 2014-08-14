package br.com.exe3;

import java.util.Scanner;

public class CobrarEstacionado {
	
	public static void main (String args []){
		double taxa = 2.00;
		int fixo = 3;
		double adicional = 0.50;
		double horas;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantas horas ficou estacionado: ");
		
		horas = entrada.nextDouble();
		
		if(horas <= fixo){
			System.out.println("Tempo estacionado: "+horas+"hr(s) Total a pagar R$ "+taxa);
		}
		if(horas > 3){
			double par;
			double dec;
			par = horas - fixo;
			dec = par % 1;
			int total =(int)par;
			if(dec != 0){
				System.out.println("Tempo estacionado "+horas+"hr(s) Total a pagar R$ "+((taxa+adicional)+(total*adicional)));
			}else{
				System.out.println("Tempo estacionado "+horas+"hr(s) Total a pagar R$ "+(taxa+(total*adicional)));
				
			}
			
		}
		
	}

}

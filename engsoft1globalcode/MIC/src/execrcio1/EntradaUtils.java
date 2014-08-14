package execrcio1;

import java.util.Scanner;

public class EntradaUtils {
	private double n1;
	private  double n2;
	private double n3;
	
	
	public void lerNotas(){
		
		
		Scanner entrada = new Scanner(System.in);
		 System.out.println("Digite a nota 1: ");
		 n1 = entrada.nextDouble();
		 System.out.println("Digite a nota 2: ");
		 n2 = entrada.nextDouble();
		 System.out.println("Digite a nota 3: ");
		 n3 = entrada.nextDouble();
		 }
	
	double calculaMedia(){
		double media = ((n1*1)+(n2*2)+(n3*3)/6);
		return media;
	}
	}

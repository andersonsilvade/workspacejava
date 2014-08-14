package posp1;



import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		
		Monetario calculadora = new Monetario();
		Scanner entrada = new Scanner(System.in);
		double a;
		double b;
		DecimalFormat forma = new DecimalFormat("0.00");
		
		 int sair = 0;
		 int opcao = 0;
		 while(sair == 0){
			 switch(opcao){
			 case 0 :{
				 calculadora.menu();
				 opcao = entrada.nextInt();
				 break;
			 }
			 case 1:{
				 System.out.println("Digite o 1º número");
				 a = entrada.nextDouble();
				 System.out.println("Digite o 2º número");
				 b = entrada.nextDouble();
				 System.out.println("Resultado  de "+a+" x "+b+" = "+ forma.format(calculadora.multiplicar(a, b)));
				 System.out.println("");
				 opcao = 0;
				 break;
			 }
			 case 2 :{
				 System.out.println("Digite o 1º número");
				 a = entrada.nextDouble();
				 System.out.println("Digite o 2º número");
				 b = entrada.nextDouble();
				 System.out.println("Resultado de "+a+" / "+b+" = "+ forma.format(calculadora.dividir(a, b)));
				 System.out.println("");
				 
				 opcao = 0;
				 break;
			 }
			 case 3 :{
				 System.out.println("Digite o 1º número");
				 a = entrada.nextDouble();
				 System.out.println("Digite o 2º número");
				 b = entrada.nextDouble();
				 System.out.println("Resultado de "+a+" + "+b+" = "+ forma.format(calculadora.somar(a, b)));
				 System.out.println("");
				 
				 opcao = 0;
				 break;
			 }
			 case 4:{
				 System.out.println("Digite o 1º número");
				 a = entrada.nextDouble();
				 System.out.println("Digite o 2º número");
				 b = entrada.nextDouble();
				 System.out.println("Resultado de "+a+" - "+b+" = "+ forma.format(calculadora.subtrair(a, b)));
				 System.out.println("");
				
				 opcao = 0;
				 break;
			 }
			 case 5:{
				 sair = 1;
				 break;
			 }
			 default :{
				 calculadora.menu();
				 opcao = entrada.nextInt();
				 break;
			 }
			 }
			 }

	}

}

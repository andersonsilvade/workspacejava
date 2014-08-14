package br.com.fatec.exe2;

public class Calculadora {
	
	public static double somar(double a,double b){
		
		return a + b;
		
	}
	
    public static double subtrair(double a,double b){
		
		return a - b;
		
	}
    
   public static double dividir(double a,double b)throws Exception{
	   double resultado;
	   if(a == 0 || b == 0){
		   resultado = 0;
	   }else{
	   resultado = a / b;
	   }
	   return resultado;
		
   }
   public static double multiplicar (double a,double b){
	   
	   return a * b;
		
   }
   
	

}

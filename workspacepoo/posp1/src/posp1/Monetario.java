package posp1;



public class Monetario {
	
	
	public double dividir(double a,double b){
		
		return a / b;
		
	}
	public double multiplicar(double a,double b){
		
		return a * b;
	}
	
	public double somar(double a,double b){
		
		return a + b;
	}
	
	public double subtrair(double a,double b){
		
		return a - b;
	}
	
	public void menu(){
		System.out.println("Escolha uma opção abaixo");
		System.out.println("1 - Mutiplicar");
		System.out.println("2 - Divisão");
		System.out.println("3 - Soma");
		System.out.println("4 - Subtração");
		System.out.println("5 - Sai");
	}
	
	
	

}

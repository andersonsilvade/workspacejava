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
		System.out.println("Escolha uma op��o abaixo");
		System.out.println("1 - Mutiplicar");
		System.out.println("2 - Divis�o");
		System.out.println("3 - Soma");
		System.out.println("4 - Subtra��o");
		System.out.println("5 - Sai");
	}
	
	
	

}

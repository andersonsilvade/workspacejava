package br.com.revisao.trycatch;

public class Inicio {

	public static void main(String[] args) {
		try{
		divisao(10, 0);
		}catch(ArithmeticException excecao){
			//excecao.printStackTrace();
			System.out.println("Não é possivel divisão por zero");
			}
	}
	public static void divisao(int a,int b)throws ArithmeticException{
			System.out.println(divisao2(a, b));
	}
	public static int divisao2(int a,int b)throws ArithmeticException{
			return a/b;	
	}

}

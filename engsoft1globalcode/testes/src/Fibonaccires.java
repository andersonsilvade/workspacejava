import java.util.Scanner;


public class Fibonaccires {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		     Scanner  sc = new Scanner (System.in);
			 int fib;
			
			System.out.print("digite um numero: ");
			fib = sc.nextInt();
			
			for (int i = 1; i <= fib; i++) {
	            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
			}
			 
		}


	}



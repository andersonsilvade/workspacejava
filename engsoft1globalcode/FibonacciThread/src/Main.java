import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
	
	System.out.print("Digite o numero: ");
	Scanner scan = new Scanner(System.in); 
	Integer n = scan.nextInt(); 
	Fibonacci fibonacci = new Fibonacci(n);
	
	Thread fibThread = new Thread(fibonacci);
	fibThread.start();
	try {
		fibThread.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.print("Lista :");
	for (Integer i : fibonacci.getSequencia()) {
		System.out.print(i +" ");
	}
}
}



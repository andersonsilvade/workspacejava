import java.util.Vector;


public class Fibonacci implements Runnable {
	int n;
	Vector <Integer> sequencia = new Vector<>(); 
	public	Fibonacci(int n){
		this.n = n;
		this.sequencia = new Vector<Integer>();	}
	
	public Vector<Integer> getSequencia(){
		return this.sequencia;
	}
	
	static int fibonacci(int n) {
		if (n < 2)
			return n;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public void run(){
		for(int k = 0;k < this.n;k++){
			this.sequencia.add(Fibonacci.fibonacci(k));
		}
	
	
	
	}
}


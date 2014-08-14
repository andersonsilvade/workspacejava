
public class Fibonacci {
	
	public long fibonacci(int n){
		int i = 1;
		int a = 0;
		int b = 1;
		 
		if(n > 1){
			while(i < n){
				long temp = b;
				b = b + a;
				a = (int) temp;
				i = i + 1;
				
			}
		}
		System.out.println(b);
		return b;
	}

}

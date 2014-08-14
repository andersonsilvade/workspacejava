import java.util.Scanner;


public class fatorial {
	
		 
	
	
	public static void main(String[] args) {
	     Scanner  sc = new Scanner (System.in);
		 long num;
		 
		
		System.out.print("digite um numero: ");
		num = sc.nextInt();
		
		System.out.println("fatorial de "+num+" é "+fat(num));
		System.out.println("fibonaci de "+num +" é "+fib(num));
		if(primo(num) == 1){
			System.out.println(num +" é primo");
		}else{
			System.out.println(num +" não é primo");
		}
		
	}
	//fatoria recursiva
	
	public static long fat(long n){
		 if((n == 0)||(n==1)){
			 return 1;
		 }else{
			 return n*fat(n-1);
		 }
			
		}
	public static long fib(long n){
		if((n==1)||(n==0)){
			return 1;
		}else{
			return fib(n-1)+ fib(n-2);
		}
	}
	public static  long primo(long num){
		int cont = 0;
		int x = 1;
		while(x <= num){
			if (num % x == 0){
				cont ++;
			}
			x++;
		}
		if (cont == 2){
			return 1;
		}else{
			return 0;
		}
	}
	

}


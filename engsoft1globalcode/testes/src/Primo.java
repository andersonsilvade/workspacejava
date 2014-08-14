import java.util.Scanner;


public class Primo {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int primo;
		int cont = 0;
		
		System.out.println("Digite um numero: ");
		primo = sc.nextInt();
		int x = primo;
		while(x > 0){
			
			if (primo % x == 0){
				cont++;
						}
			x--;
		}
        if (cont==2){
        	System.out.println("número primo!!!");
        }else{
        	System.out.println("número não é primo!!!");
        }
	}

}

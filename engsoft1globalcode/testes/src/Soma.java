import java.util.Scanner;
public class Soma {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.print("digite um numero: ");
		a = sc.nextInt();
		System.out.print("digite outro numero: ");
		b = sc.nextInt();
		
		System.out.println("soma de a+b= "+(a+b));
		System.out.println("multiplicação de a x b = "+(a*b));
		System.out.println("subtração a - b = "+(a-b));

	}

}

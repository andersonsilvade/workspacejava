import java.util.Scanner;

public class teste {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Digite um número: ");
		a = sc.nextInt();
		
		

		
		//tenho que colocar o ternario dentro do sysout pq vc esta comparando um interiro e chamando uma String
		System.out.print("O número digitado é ");
		System.out.print((a%2)==0? "Par":"Impar");

	}

}

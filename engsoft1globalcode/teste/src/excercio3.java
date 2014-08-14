import java.util.Scanner;


public class excercio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1;
		float nota2;
		float media;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a nota 1: ");
		nota1 = sc.nextFloat();
		System.out.println("Entre com a nota 2: ");
		nota2 = sc.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		System.out.println("Sua média foi "+media+" você foi:");
		
		if(media < 6){
			System.out.println("Reprovado");
		}else{
			System.out.println("Aprovado");
		}
		
		
	}

}

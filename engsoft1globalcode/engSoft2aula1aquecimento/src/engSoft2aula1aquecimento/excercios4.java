package engSoft2aula1aquecimento;
//verificar se um numero � par ou impar
import java.util.Scanner;

public class excercios4 {

	public static void main(String[] args) {
		
		int n;
		
       Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o n�mero: ");
		
		n = sc.nextInt();
		
		if((n % 2)== 0){
			System.out.println("N�mero par");
		}else{
			System.out.println("N�mero impar");
		}
		
		
	}

}

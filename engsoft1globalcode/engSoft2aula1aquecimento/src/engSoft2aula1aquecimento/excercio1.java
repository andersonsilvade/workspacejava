package engSoft2aula1aquecimento;
//calcula de btu
import java.util.Scanner;

public class excercio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a;
		float btu = 700;
		float alt;
		float larg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o altura: ");
		alt = sc.nextFloat();
		System.out.print("Digite o largura: ");
		larg = sc.nextFloat();
		
		a = alt * larg;
		
		
		System.out.println("Area tem o total de  "+a +" mt2"+" a quantidade de BTU's necessaria é de  :  "+(a*btu));
		
		

	}

}

import java.util.Scanner;


public class exercico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double salario;
        double vendas;
        double comissao;
		Scanner sc = new Scanner(System.in);
		System.out.print("o salario:  ");
		salario = sc.nextDouble();
		System.out.println("total de vendas: ");
		vendas = sc.nextDouble();
		
		comissao =  (vendas*0.05); 
		
		System.out.println("Seu salario será "+(comissao + salario)+" R$");
		
		
		
		
	}

}

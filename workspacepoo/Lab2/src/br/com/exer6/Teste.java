package br.com.exer6;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Vendedor ven = new Vendedor("Anderson");
		
		ven.setTotalVendas(20);
		ven.calculaSalario();
		System.out.println("Total salario: "+ven.getSalarioSemana());
		ven.setTotalVendas(300);
		ven.calculaSalario();
		System.out.println("Total salario: "+ven.getSalarioSemana());
		
		
	}

}

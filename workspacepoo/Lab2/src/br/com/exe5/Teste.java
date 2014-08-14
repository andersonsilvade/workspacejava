package br.com.exe5;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c1 = new Cliente(1234);
		c1.setDespesas(20);
		c1.calcularSaldo();
		System.out.println("disponivel para saque: "+c1.getSaldo());
		System.out.println("#############################");
		
		c1.setDespesas(30);
		c1.calcularSaldo();
		System.out.println("disponivel para saque: "+c1.getSaldo());
		System.out.println("#############################");
		
		c1.setDespesas(1940);
		c1.calcularSaldo();
		
		System.out.println("disponivel para saque: "+c1.getSaldo());
		System.out.println("#########################");
		c1.setDespesas(12);
		c1.calcularSaldo();
		System.out.println("disponivel para saque: "+ c1.getSaldo());
		System.out.println("#########################");
		c1.setDespesas(10);
		c1.calcularSaldo();
		System.out.println("disponivel para saque: "+ c1.getSaldo());
		System.out.println("#########################");
		
		
		
		

	}

}

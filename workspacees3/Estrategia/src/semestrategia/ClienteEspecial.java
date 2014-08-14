package semestrategia;

public class ClienteEspecial extends Usuario {
	
	public ClienteEspecial (double saldo) {
		super.saldo = saldo;
	}
	
	public void sacarEspecial (double saque) {
		saldo = saldo - saque;
		System.out.println("Saldo: " + saldo + "\n");
	}
	
	
}

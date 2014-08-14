package semestrategia;

public class Estudante extends Usuario {

	public Estudante (double saldo) {
		super.saldo = saldo;
	}
	
	public void sacarEspecial (double saque) {
		saldo = saldo - saque;
		System.out.println("Saldo: " + saldo + "\n");
	}	
	
	public void imprimirCheque(){
		
	}
}

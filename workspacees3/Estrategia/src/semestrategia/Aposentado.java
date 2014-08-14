package semestrategia;

public class Aposentado extends Usuario {
	
	public Aposentado (double saldo) {
		
		super.saldo = saldo;
	}
	
	public void sacarComum (double saque) {
		saldo = saldo - saque;
	}

	
}

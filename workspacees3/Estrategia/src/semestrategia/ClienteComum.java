package semestrategia;

public class ClienteComum extends Usuario {
	
	public ClienteComum (double saldo) {
			
			super.saldo = saldo;
		}
		
		public void sacarComum (double saque) {
			saldo = saldo - saque;
		}
		
		public void imprimirCheque(){
			
		}
}

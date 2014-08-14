
public class testeSincronismo {

	
	public static void main(String[] args) {
		int saldoInicial = 1000;
		int numeroContas = 10;
		
		Banco banco = new Banco(numeroContas,saldoInicial);
		for(int j = 0; j < numeroContas;j++){
			Thread t = new Thread(new Transferencia(banco, j,saldoInicial));
			t.start();
		}
	}

}


public class Saque {
	
	public boolean sinal = true;
	private double saldo = 0;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public  double sacar (double valor){
		if(sinal == true){
			sinal = false;
		setSaldo(getSaldo() + valor);
		System.out.println("Saldo "+saldo);
		sinal = true;
	}
		return 0;
	}

}

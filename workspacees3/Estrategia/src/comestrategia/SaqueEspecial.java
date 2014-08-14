package comestrategia;

public class SaqueEspecial implements Saque{
	
	public double sacar(double v, double saldoAtual){
		System.out.println("logica do saque especial");
		double saldoNovo = saldoAtual - v;
		System.out.println("Ticket de saldo especial: "+saldoNovo);
		return saldoNovo;
	}

}

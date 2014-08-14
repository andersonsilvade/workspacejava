package comestrategia;

public class SaqueComum implements Saque{
	
	public double sacar(double v, double saldoAtual){
		System.out.println("logica do saque comum");
		double saldoNovo = saldoAtual - v;
		System.out.println("Sem Ticket");
		return saldoNovo;
	}

}

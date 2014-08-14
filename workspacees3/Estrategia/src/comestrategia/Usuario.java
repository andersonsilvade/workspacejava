package comestrategia;

public class Usuario {
	
	public double saldo;
	private Saque s;
	private ImpressaoCheque impressao;
	private Extrato e;
	private double lis;
	private double saldoDis;
	
	
	public void setS(Saque s){
		this.s = s;
	}
	
	public void setImpressao(ImpressaoCheque ic){
		impressao = ic;
	}
	public void setE(Extrato ext){
		this.e = ext;
		
		}
	public void setLis(Limite lis){
		this.lis = lis.definirLimite();
	}
	
	public double getLis() {
		return lis;
	}

	public void realizarSaque(double v){
		
		saldo = s.sacar(v, saldo);
	}

	
	public void emitirCheque(){
		impressao.imprimirCheque();
	}
	public void emitirExtrato(){
		e.retirarExtrato();
		
	}
	
	

}

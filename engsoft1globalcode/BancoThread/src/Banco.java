
public class Banco {
	private Conta contas[];
	private static final int TRANSACOES_PARA_IMPRESSAO = 1000;
	public int contadorTransacoes = 0;
	
	
	public Banco(int nContas, int saldoInicial){
		this.contas = new Conta[nContas];
		for(int i = 0; i < nContas;i++){
			Conta c = new Conta(saldoInicial);
			contas[i] = c;
		}
	}
	
	public synchronized void transferir(int contaSaque,int contaDeposito,int valor){
		if(contas[contaSaque].saldo < valor)
			return;
		
		contas[contaSaque].saldo -= valor;
		contas[contaDeposito].saldo += valor;
		
		contadorTransacoes++;
		if(contadorTransacoes % TRANSACOES_PARA_IMPRESSAO == 0)
			imprimeTotal();
	}
	public int getNumeroContas(){
		return this.contas.length;
	}
	
	private void imprimeTotal(){
		int total = 0 ;
		for(int i = 0;i<contas.length;i++){
			total += contas[i].saldo;
			System.out.println("Transação = "+ contadorTransacoes + "  total = "+total);
		}
	}

}

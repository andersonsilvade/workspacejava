
public class Transferencia  implements Runnable{
	private Banco banco;
	private int contaSaque;
	private int limiteTransferencia = 0;
	
	public Transferencia(Banco banco, int contaSaque, int limiteTransferencia) {
		
		this.banco = banco;
		this.contaSaque = contaSaque;
		this.limiteTransferencia = limiteTransferencia;
	}
	
	public void run(){
		while(!Thread.currentThread().isInterrupted()){
			int contaDeposito = (int)(banco.getNumeroContas() * Math.random());
			int valor = (int)(this.limiteTransferencia *Math.random());
			this.banco.transferir(this.contaSaque, contaDeposito, valor);
		}
	}
	

}

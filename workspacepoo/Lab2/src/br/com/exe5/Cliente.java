package br.com.exe5;

public class Cliente {
	
	private int nConta;
	private int saldo = 2000;
	private int despesas = 0;
	private int limite = 2000;
	
	
	
	
	public Cliente(int nConta) {
		
		this.nConta = nConta;
		
	}


	public int getnConta() {
		return nConta;
	}


	public void setnConta(int nConta) {
		this.nConta = nConta;
	}


	public int getSaldo() {
		return saldo;
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public int getDespesas() {
		return despesas;
	}
	
    public void setDespesas(int despesas) {
		this.despesas = despesas;
	}
	public int getLimite() {
		return limite;
	}


	public void setLimite(int limite) {
		this.limite = limite;
	}


	


	public void calcularSaldo(){
		if((getSaldo() - getDespesas()) < 0){
			System.out.println("Você execedeu seu limite de credito a operação não será concluida");
		}else{
		saldo = saldo - despesas ;
		setSaldo(saldo);
		setLimite(getLimite()-getDespesas());
		}
	}
	
	

}

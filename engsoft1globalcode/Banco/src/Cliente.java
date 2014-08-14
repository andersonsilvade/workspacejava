
public class Cliente {
	public int numeroConta;
	public int agencia;
	public double saldo;
	
	public void sacar(double valor){//valor == entrada
		
	if(verificarSaldoSuficiente(valor)){//verificarSaldoSuficiente()requer
		System.out.println("Retire seu dinheiro...");// if caminho feliz ... ...saida
		saldo=saldo-valor;  //saldo
		                                }
	else{
		System.out.println("Saldo insuficiente...");//else caminho infeliz ... ...saidas
				
		}
		
	                                }

	public boolean verificarSaldoSuficiente(double val){   //requer verificar saldo
		if (val<=saldo){
			return true;
		               
		}else{
				return false;
				
		}
		
	}
	}
	
	
	
	

	
		

	



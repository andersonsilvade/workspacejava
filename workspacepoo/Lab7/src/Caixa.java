import java.io.Serializable;
import java.util.Date;


public class Caixa implements Serializable{
	
	
	private double entrada ;
	private double saida ;
	private double saldo = entrada - saida;
	private StringBuilder historico;
    private Date data; 
	
	
	public Caixa(double entrada, double saida) {
		
		this.entrada = entrada;
		this.saida = saida;
		this.saldo = entrada - saida;
		this.historico = new StringBuilder();
		this.data = new Date();
	}



	public double getEntrada() {
		return entrada;
	}
	
	
	
	public void setEntrada(double entrada) {
		this.entrada = entrada;
	}
	
	public double getSaida() {
		return saida;
	}
	
	public void setSaida(double saida) {
		this.saida = saida;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	
	public StringBuilder gerarHistoricoEntrada() {
		historico.append("\n"+(getEntrada()));
		return historico;
	}
	public StringBuilder gerarHistoricoSaida(){
		historico.append("\n"+(-getSaida()));
		return historico;
	}
	public StringBuilder getHistorico(){
		return historico;
	}
	public void entradaValor(double valor){
		setEntrada(getEntrada()+valor);
	}
	
	

	
	
	
	
	
	
	
}

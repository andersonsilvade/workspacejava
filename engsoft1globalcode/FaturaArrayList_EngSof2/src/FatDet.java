import java.io.ObjectInputStream.GetField;
import java.util.List;


public class FatDet {
	
	
	
	private String descri��o;
	private double quantidade;
	private double pre�o;
	

	
	
	public FatDet(String descri��o, double quantidade, double pre�o) {
		
		this.descri��o = descri��o;
		this.quantidade = quantidade;
		this.pre�o = pre�o;
	}


	public String getDescri��o() {
		return descri��o;
	}


	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}


	public double getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}


	public Double getPre�o() {
		return pre�o;
	}


	public void setPre�o(Double pre�o) {
		this.pre�o = pre�o;
	}     
	
	public double calcula(){
		return (pre�o * quantidade);
	}
	
	public static void print(){
		
		System.out.println();
	}
	
	
}

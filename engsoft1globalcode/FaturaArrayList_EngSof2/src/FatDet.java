import java.io.ObjectInputStream.GetField;
import java.util.List;


public class FatDet {
	
	
	
	private String descrição;
	private double quantidade;
	private double preço;
	

	
	
	public FatDet(String descrição, double quantidade, double preço) {
		
		this.descrição = descrição;
		this.quantidade = quantidade;
		this.preço = preço;
	}


	public String getDescrição() {
		return descrição;
	}


	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}


	public double getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}


	public Double getPreço() {
		return preço;
	}


	public void setPreço(Double preço) {
		this.preço = preço;
	}     
	
	public double calcula(){
		return (preço * quantidade);
	}
	
	public static void print(){
		
		System.out.println();
	}
	
	
}

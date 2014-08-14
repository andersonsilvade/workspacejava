
public class Flores {
	
	private String nome;
	private double preco;
	private Espec esp;
	
	public Flores(String nome, double preco, Espec esp) {
	
		this.nome = nome;
		this.preco = preco;
		this.esp = esp;
	}
	public String getNome(){
		
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Espec getEsp() {
		return esp;
	}
	
	
	
	
	

}


public class Produto {
	
	private String nome;
	private double preco;
	private String prateleira;
	private int quantidade;
	private Matches m;
	
	public Produto(String n, double p, String prat, int quant){
		nome = n;
		preco = p;
		prateleira = prat;
		quantidade = quant;
	}
	
	
	
	public Produto(String nome, double preco, String prateleira,
			int quantidade, Matches m) {
		
		this.nome = nome;
		this.preco = preco;
		this.prateleira = prateleira;
		this.quantidade = quantidade;
		this.m = m;
	}



	public String getNome(){
		return nome;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public String getPrateleira(){
		return prateleira;
	}
	
	public int getQuantidade(){
		return quantidade;
	}
	
	
	public void setM(Matches m) {
		this.m = m;
	}



	public boolean tMatches(Produto p){
		if(m.matches(p, this))return true; //p produto da lista ,this produto buscado
		return false;
		
	}

}

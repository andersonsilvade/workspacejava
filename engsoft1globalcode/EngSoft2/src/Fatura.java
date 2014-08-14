
public class Fatura {
	
	private int nItemFatura;
	private int quantidade;
	private double preco;
	public double TotalFatura;
	
	public Fatura(int nItemFatura, int quantidade, double preco) {
		
		this.nItemFatura = nItemFatura;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public int getnItemFatura() {
		return nItemFatura;
	}

	public void setnItemFatura(int nItemFatura) {
		this.nItemFatura = nItemFatura;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getTotalFatura(){
		
		TotalFatura =(double)quantidade * preco;
		
		return TotalFatura;
			
	}
	public void imprimir(){
		System.out.println("Você comprou : "+nItemFatura+ " itens");
		System.out.println("E o total da sua Fatura é de : "+TotalFatura);
		
	}

}

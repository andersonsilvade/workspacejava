import java.io.Serializable;
import java.util.List;


public class Produto implements Serializable,Comparable<Produto> {

	private String produto;
	private double quantProd;
	
	public Produto(String produto, double quantProd) {
		
		this.produto = produto;
		this.quantProd = quantProd;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getQuantProd() {
		return quantProd;
	}

	public void setQuantProd(double quantProd) {
		this.quantProd = quantProd;
	}


	@Override
	public int compareTo(Produto p) {
		int i = 0;
		if(this.produto.compareTo(p.produto) < 0)i = -1;
		if(this.produto.compareTo(p.produto) > 0)i = 1;
		return i;
	}

	}



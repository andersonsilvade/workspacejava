
public class Produto {
	
	private String desc;
	private String local;
	private double preco;
	
	public Produto(String desc, String local, double preco) {
		
		this.desc = desc;
		this.local = local;
		this.preco = preco;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public boolean matches(Produto prod){
		if(!desc.equals(prod))return false;
		return true;
	}
	

}

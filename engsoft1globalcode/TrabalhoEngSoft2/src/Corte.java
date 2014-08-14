
public class Corte {
	
	 private String tecido;
	 private String cor;
	 private double metros;
	 private Costura cost;
	
	 public Corte(String tecido, String cor, double metros, Costura cost) {
		
		this.tecido = tecido;
		this.cor = cor;
		this.metros = metros;
		this.cost = cost;
	}

	public String getTecido() {
		return tecido;
	}

	public void setTecido(String tecido) {
		this.tecido = tecido;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getMetros() {
		return metros ;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

	public Costura getCost() {
		return cost;
	}

	

}

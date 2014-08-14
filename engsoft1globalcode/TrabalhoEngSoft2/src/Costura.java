
public class Costura {
	
	private String linha;
	private double metros;
	private Estamparia est;
	
	public Costura(String linha, double metros, Estamparia est) {
		
		this.linha = linha;
		this.metros = metros;
		this.est = est;
	}

	public String getLinha() {
		return linha;
	}

	public void setLinha(String linha) {
		this.linha = linha;
	}


	public double getMetros() {
		return metros;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

	public Estamparia getEst() {
		return est;
	}

	

}

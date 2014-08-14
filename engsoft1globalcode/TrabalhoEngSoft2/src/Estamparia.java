
public class Estamparia {
     private String estampa;
     private String cor;
     private Embalagem emb;
	
     public Estamparia(String estampa, String cor, Embalagem emb) {
		
		this.estampa = estampa;
		this.cor = cor;
		this.emb = emb;
	}

	public String getEstampa() {
		return estampa;
	}

	public void setEstampa(String estampa) {
		this.estampa = estampa;
	}

	public String getCores() {
		return cor;
	}

	public void setCores(String cores) {
		this.cor = cor;
	}

	public Embalagem getEmb() {
		return emb;
	}

	
}

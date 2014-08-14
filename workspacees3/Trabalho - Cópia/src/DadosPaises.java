
public class DadosPaises {
	
	private Paises pais;
	private int totalMortos;
	private double taxaObito;
	
	
	public DadosPaises(Paises pais, int totalMortos, double taxaObito) {
		
		this.pais = pais;
		this.totalMortos = totalMortos;
		this.taxaObito = taxaObito;
	}


	public Paises getPais() {
		return pais;
	}


	public int getTotalMortos() {
		return totalMortos;
	}


	public double getTaxaObito() {
		return taxaObito;
	}

}

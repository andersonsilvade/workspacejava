package br.com.eng3.paises;

public class DadosPaises {

	private Paises pais;
	private int totalMortos;
	private double taxaObito;
	private static int brasilTotalMortos = 43077;
	private static double brasilTaxaObito = 22.5;


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


	public static int getBrasilTotalMortos() {
		return brasilTotalMortos;
	}

	public static double getBrasilTaxaObito() {
		return brasilTaxaObito;
	}

}

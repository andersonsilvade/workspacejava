package br.com.eng3.tipo;
import java.util.List;


public  class Acidente implements Comparable<Acidente> {

	private Tipo tipo;
	private final static int  ano = 2011;
	private int morteTotal;
	private double participacaoCategoria;
	private double taxaObito;
	private int totalRegNorte;
	private int totalRegNordeste;
	private int totalRegSudeste;
	private int totalRegSul;
	private int totalRegCentroOeste;
	private final static int brasil = 10;





	public Acidente(Tipo tipo, int morteTotal, double participacaoCategoria,double taxaObito,
			int totalRegNorte,int totalRegNordeste,int totalRegSudeste,int totalRegSul,int totalRegCentroOeste	) {
		this.tipo = tipo;
		this.morteTotal = morteTotal;
		this.participacaoCategoria = participacaoCategoria;
		this.taxaObito = taxaObito;
		this.totalRegNorte = totalRegNorte;
		this.totalRegNordeste = totalRegNordeste;
		this.totalRegSudeste = totalRegSudeste;
		this.totalRegSul = totalRegSul;
		this.totalRegCentroOeste = totalRegCentroOeste;
	}



	public Acidente(Tipo tipo, int morteTotal, double participacaoCategoria,double taxaObito) {

		this.tipo = tipo;
		this.morteTotal = morteTotal;
		this.participacaoCategoria = participacaoCategoria;
		this.taxaObito = taxaObito;

	}



	public Tipo getTipo() {
		return tipo;
	}

	public int getBrasil(){
		return brasil;
	}


	public int getAno() {
		return ano;
	}



	public int getMorteTotal() {
		return morteTotal;
	}



	public double getParticipacaoCategoria() {
		return participacaoCategoria;
	}



	public double getTaxaObito() {
		return taxaObito;
	}


	public int getTotalRegNorte() {
		return totalRegNorte;
	}



	public void setTotalRegNorte(int totalRegNorte) {
		this.totalRegNorte = totalRegNorte;
	}



	public int getTotalRegNordeste() {
		return totalRegNordeste;
	}


	public int getTotalRegSudeste() {
		return totalRegSudeste;
	}

	public int getTotalRegSul() {
		return totalRegSul;
	}

	public int getTotalRegCentroOeste() {
		return totalRegCentroOeste;
	}


	@Override
	public int compareTo(Acidente acidente){

		if(this.morteTotal > acidente.morteTotal){
			return -1;
		}else if(this.morteTotal < acidente.morteTotal){
			return 1;
		}
		return this.getTipo().toString().compareTo(acidente.toString());
	}







}

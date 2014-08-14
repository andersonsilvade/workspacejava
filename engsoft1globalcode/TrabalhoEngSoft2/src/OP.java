import java.util.ArrayList;

import java.util.List;


public class OP {
	
	private int nOP;
	private String modelo;
	private int nIT;
	private int quantidade;
	private Corte corte;
	
	
	
	public OP(int nOP, String modelo, int nIT,int quantidade,Corte corte) {
		
		this.nOP = nOP;
		this.modelo = modelo;
		this.nIT = nIT;
		this.quantidade = quantidade;
		this.corte = corte;
		
	}

	public Corte getCorte() {
		return corte;
	}

	
	public int getnOP() {
		return nOP;
	}

	public void setnOP(int nOP) {
		this.nOP = nOP;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getnIT() {
		return nIT;
	}

	public void setnIT(int nIT) {
		this.nIT = nIT;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public boolean matches(OP specCliente){
		if(nOP == specCliente.nOP) return false;
				
		return true;
	}

	public void imprimeCompleto(){
		System.out.println("Número da O.P: "+getnOP());
		System.out.println("Quantidade da OP: "+getQuantidade()+ " peças");
		System.out.println("I.T: "+getnIT());
		System.out.println("Modelo: "+getModelo());
		System.out.println("Tecido: "+getCorte().getTecido());
		System.out.println("Cor: "+getCorte().getCor());
		System.out.println("Metro :"+(getQuantidade()*getCorte().getMetros())+" metros");
		System.out.println("Linha: "+getCorte().getCost().getLinha());
		System.out.println("Metros Linha: "+(getQuantidade()*getCorte().getCost().getMetros())+ " metros");
		System.out.println("Tipo da Estampa: "+getCorte().getCost().getEst().getEstampa());
	    System.out.println("Cor da Estampa: "+getCorte().getCost().getEst().getCores());
	    System.out.println("Tipo da embalagem: "+getCorte().getCost().getEst().getEmb().getEmbalagem());
	    System.out.println("Quantidade de embalagem: "+getCorte().getCost().getEst().getEmb().getQuantEmbalagem());
	}
	public void imprimeCorte(){
		System.out.println("Número da O.P: "+getnOP());
		System.out.println("Quantidade da OP: "+getQuantidade());
		System.out.println("I.T: "+getnIT());
		System.out.println("Modelo: "+getModelo());
		System.out.println("Tecido: "+getCorte().getTecido());
		System.out.println("Cor: "+getCorte().getCor());
		System.out.println("Metro :"+(getQuantidade()*getCorte().getMetros())+" metros");
		
	}
	public void imprimeCostura(){
		System.out.println("Número da O.P: "+getnOP());
		System.out.println("Quantidade da OP: "+getQuantidade());
		System.out.println("I.T: "+getnIT());
		System.out.println("Modelo: "+getModelo());
		System.out.println("Linha: "+getCorte().getCost().getLinha());
		System.out.println("Metros Linha: "+(getQuantidade()*getCorte().getCost().getMetros())+" metros");
		
	}
	public void imprimeEstamparia(){
		System.out.println("Número da O.P: "+getnOP());
		System.out.println("Quantidade da OP: "+getQuantidade());
		System.out.println("I.T: "+getnIT());
		System.out.println("Modelo: "+getModelo());
		System.out.println("Tipo da Estampa: "+getCorte().getCost().getEst().getEstampa());
	    System.out.println("Cor da Estampa: "+getCorte().getCost().getEst().getCores());
		
	}
	public void imprimeEmbalagem(){
		System.out.println("Número da O.P: "+getnOP());
		System.out.println("Quantidade da OP: "+getQuantidade());
		System.out.println("I.T: "+getnIT());
		System.out.println("Modelo: "+getModelo());
		System.out.println("Tipo da embalagem: "+getCorte().getCost().getEst().getEmb().getEmbalagem());
		System.out.println("Quantidade de  embalagem: "+getCorte().getCost().getEst().getEmb().getQuantEmbalagem()*getQuantidade()+" peças");
	}
	public boolean comparar(int ordem){
    	if(!(nOP == ordem))return false;
		
		return true;
    }
	

}

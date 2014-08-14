package br.com.fatec.modelo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Professor extends Pessoa implements Serializable{
	

	private String numeroRegistro;
	private String quantidadeHorasAula;
	
	public Professor(String nome, String telefone, String email,String numeroRegistro, String quantidadeHorasAula) {
		super(nome, telefone, email);
		this.numeroRegistro = numeroRegistro;
		this.quantidadeHorasAula = quantidadeHorasAula;
	}

	@Override
	public String dadosFormatados(){
		String dadosFormatados = super.dadosFormatados();
		
		dadosFormatados = dadosFormatados + "\nRegistro: "+this.getNumeroRegistro();
		dadosFormatados = dadosFormatados+"\nHora/Aula: "+this.getQuantidadeHorasAula();
		return dadosFormatados;
		}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getQuantidadeHorasAula() {
		return quantidadeHorasAula;
	}

	public void setQuantidadeHorasAula(String quantidadeHorasAula) {
		this.quantidadeHorasAula = quantidadeHorasAula;
	}

}

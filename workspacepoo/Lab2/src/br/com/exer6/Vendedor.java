package br.com.exer6;

public class Vendedor {
	
	private String nome;
	private double totalVendas;
	private double salarioFixo = 200;
	private double salarioSemana;
	private double comissao = 0.09;
	
	public Vendedor(String nome) {
		
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public double getSalarioSemana() {
		return salarioSemana;
	}

	public void setSalarioSemana(double salarioSemana) {
		this.salarioSemana = salarioSemana;
	}

	public void calculaSalario() {
		salarioSemana = salarioFixo +(totalVendas*comissao);
		
		
		
		
	}
	

}

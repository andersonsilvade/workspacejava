package br.com.exer7;

public class Trabalhador {
	
	private String nome;
	private double hrsTrabalhada;
	private double valorHr;
	private double salario;
	
	public Trabalhador(String nome, double hrsTrabalhada, double valorHr) {
		
		this.nome = nome;
		this.hrsTrabalhada = hrsTrabalhada;
		this.valorHr = valorHr;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getHrsTrabalhada() {
		return hrsTrabalhada;
	}

	public void setHrsTrabalhada(double hrsTrabalhada) {
		this.hrsTrabalhada = hrsTrabalhada;
	}

	public double getValorHr() {
		return valorHr;
	}

	public void setValorHr(double valorHr) {
		this.valorHr = valorHr;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void calcularSalario(){
		if(hrsTrabalhada <= 40){
			salario = hrsTrabalhada * valorHr;
		}else{
			salario = (40 * valorHr)+((hrsTrabalhada - 40)*valorHr)+(((hrsTrabalhada - 40)*0.5)*valorHr);
		}
		
	}
	
	
	

}

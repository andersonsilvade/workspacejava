package br.com.revisao.abstractclass;

public class Professor extends Pessoa {
	
	private int matricula;
	private String[] turma;
	
	public Professor(String nome, int matricula,String[] turma) {
		super(nome);
		this.matricula = matricula;
		this.turma = turma;
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	
	public void setTurma(String[] turma) {
		this.turma = turma;
	}

	public String[] getTurma() {
		return turma;
	}

}

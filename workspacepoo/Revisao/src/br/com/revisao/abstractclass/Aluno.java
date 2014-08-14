package br.com.revisao.abstractclass;

public class Aluno extends Pessoa {
	
	private int matricula;
	private String turma;
	
	public Aluno(String nome, int matricula, String turma) {
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

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	

}

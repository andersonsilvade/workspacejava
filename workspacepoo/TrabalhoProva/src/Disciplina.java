import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Disciplina implements Serializable{
	
	private String disciplina;
	private int qtHrs;
	private int qtAlunos;
	private String prof;
	private String [] aluno;
	
	
	public Disciplina(String disciplina, int qtHrs, int qtAlunos) {
		
		this.disciplina = disciplina;
		this.qtHrs = qtHrs;
		this.qtAlunos = qtAlunos;
		this.aluno = new String[qtAlunos];
		
	}
     
	
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public int getQtHrs() {
		return qtHrs;
	}

	public void setQtHrs(int qtHrs) {
		this.qtHrs = qtHrs;
	}

	public int getQtAlunos() {
		return qtAlunos;
	}

	public void setQtAlunos(int qtAlunos) {
		this.qtAlunos = qtAlunos;
	}

	public String getProf() {
		return prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

	public String[] getAluno() {
		return aluno;
	}

	public void setAluno(String[] aluno) {
		this.aluno = aluno;
	}
	public void addAlunoMatricula(List dp){
		int contNulo = 0;
		Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.println("Digite o nome do aluno");
		nome = entrada.next();
		for(Object x : dp){
			Disciplina di = (Disciplina) x;
			if(di != null){
		        for(int i = 0;i < this.aluno.length;i++){
			        if((di.aluno[i] == null)){
			        	di.aluno[i] = nome;
				    contNulo++;
				    System.out.println("Aluno matriculado com sucesso "+disciplina);
				    break;
			}
			}
			
		}
	}
		if(contNulo == 0){
			System.out.println("Não há mais vaga nessa matéria");
		}
	}
	
		public boolean verificarMatriculaCurso(String nMatricula){
			for(int i = 0; i < aluno.length;i++){
				if(this.aluno[i] != null){
					if(this.aluno[i] == nMatricula)return true;
					}
				}
			return false;
		
	}
		public void matriculaPorDisciplina(String nomeDisciplian){
			int cont = 0;
			Arrays.sort(aluno);
			if(disciplina.equalsIgnoreCase(nomeDisciplian)){
				for(int i = 0 ; i < qtAlunos;i++){
					if(aluno[i] != null){
						System.out.println(aluno[i]);
						
						cont++;
					}
				}
			}
			System.out.println("Temos um toal de "+cont+" alunos nessa disciplina ");
		}
	}
	



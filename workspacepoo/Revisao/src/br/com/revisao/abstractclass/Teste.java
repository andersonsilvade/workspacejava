package br.com.revisao.abstractclass;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno1 = new Aluno("Anderson",1005,"4�Ads");
		Professor prof1 = new Professor("Jo�o",1000,new String[10] );
		
		prof1.getTurma() [0] = "4�Ads";
		prof1.getTurma() [1] = "3� Ads";
		
		
		
		
		System.out.println("Nome:  "+ aluno1.getNome());
		System.out.println("Matricula:   " +aluno1.getMatricula());
		System.out.println("Turma:  "+ aluno1.getTurma());
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		
		System.out.println("Nome: "+prof1.getNome());
		System.out.println("Matricula: "+prof1.getMatricula());
		
		
		
		

	}

}

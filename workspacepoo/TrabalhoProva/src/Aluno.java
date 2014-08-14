import java.io.Serializable;



public class Aluno extends Pessoa implements Serializable,Comparable<Aluno> {
	
	

	public static int  numeroMatricula = 1000;
	
	public Aluno(String nome, String rg, String cpf) {
		super(nome, rg, cpf);
		this.numeroMatricula++;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public int compareTo(Aluno o) {
		
		return this.getNome().toUpperCase().toString().compareTo(o.getNome().toUpperCase().toString());
	}

	

}

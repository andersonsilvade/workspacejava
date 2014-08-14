import java.io.Serializable;



public class Professor extends Pessoa implements Serializable,Comparable<Professor>{

	public Professor(String nome, String rg, String cpf) {
		super(nome, rg, cpf);
		
	}

	@Override
	public int compareTo(Professor o) {

		return this.getNome().toUpperCase().toString().compareTo(o.getNome().toUpperCase().toString());
	}
	
	
}

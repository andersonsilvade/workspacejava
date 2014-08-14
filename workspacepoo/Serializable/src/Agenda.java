import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;


public class Agenda implements Serializable{

	List<Pessoa>pessoas;
	public Agenda(){
		pessoas =  new LinkedList<Pessoa>();
	}
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
		
}

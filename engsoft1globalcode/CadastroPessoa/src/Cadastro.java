import java.util.LinkedList;
import java.util.List;

public class Cadastro {

	private List pessoas;
	
	public Cadastro(){
		pessoas = new LinkedList();
	}
	public void addPessoa(Pessoa pessoa){
		pessoas.add(pessoa);
		
	}
    public List localizaPessoa(Espec pessoaLoc){
    	List encontrados = new LinkedList();
    	for(Object i :pessoas){
    		Pessoa pessoaCad = (Pessoa) i;
    		if(pessoaCad.getEsp().comparar(pessoaLoc))encontrados.add(pessoaCad);
    		
    	}
    
    return encontrados;
    }
}

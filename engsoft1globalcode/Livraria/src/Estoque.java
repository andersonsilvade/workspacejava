import java.util.List;
import java.util.LinkedList;

public class Estoque {
	
	private List livros;
	public Estoque(){
		livros = new LinkedList();
	}
	
	public void addLivro(Livro livro){
		livros.add(livro);
	}
    public List buscarLivro(EspecLivro livroClienteQuer){
    	List encontrados = new LinkedList();
    	for(Object i:livros){
    		Livro livroEstoque = (Livro)i;//pegando objeto livro do da posição i do estoque
    				if(livroEstoque.getEsp().comparar(livroClienteQuer)) encontrados.add(livroEstoque);
    	}
    	return encontrados;
    }
	

}

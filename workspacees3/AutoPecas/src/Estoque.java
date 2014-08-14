import java.util.List;
import java.util.LinkedList;

public class Estoque {
	
	private List<Produto> listaProdutos;
	private Funcionario func;
	
	public Estoque(){
		listaProdutos = new LinkedList<Produto>();
	}
	
	public void addProduto(Produto prod){
		listaProdutos.add(prod);
	}
	
	public void buscarProduto(Produto p){
		List<Produto> encontrados = new LinkedList<Produto>();
		for(Object i:listaProdutos){
			Produto prodLocalizado = (Produto)i;
			if(prodLocalizado.matches(p)) encontrados.add(p);;
			}
		func.realizarImpressao(encontrados) ;
		
		}
}

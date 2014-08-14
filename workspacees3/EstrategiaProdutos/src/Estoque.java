import java.util.List;
import java.util.LinkedList;

public class Estoque {
	
	private List<Produto> lista;
	
	private Funcionario func;
	
	public Estoque(Funcionario f){
		lista = new LinkedList<Produto>();
		func = f;
	}
	
	public void addProduto(Produto p){
		lista.add(p);
	}
	
	public void buscar(Produto p){
		List l = new LinkedList();
		for(Object i : lista){
			Produto prod = (Produto)i;
			if(p.tMatches(prod)) l.add(prod);
		}
		func.realizarImpressao(l);
		
	}

}

import java.util.List;




public class Vendedor implements Visualizacao{
	
	public void imprimir(List pEncontrado){
		for(Object i : pEncontrado){
			Produto produto = (Produto) i ;
			System.out.println("Descrição: "+produto.getDesc());
			System.out.println("Preço: "+produto.getPreco());
			System.out.println("Prateleira: "+produto.getLocal());
		}
		
	  }
		
		
	}



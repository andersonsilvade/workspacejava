import java.util.List;


public class BuscaEstagiario implements Busca {
	
	
	public void imprimirBusca(List produtos){
		 if(!produtos.isEmpty()){
			 for(Object i :produtos){
				 Produto prod = (Produto)i;
					System.out.println("Nome: "+prod.getNome());
					System.out.println("Preco: "+prod.getPreco());
				
			 }
		 }
		
	}

}

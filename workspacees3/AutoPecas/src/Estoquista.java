import java.util.List;




public class Estoquista implements Visualizacao{
	
	public void imprimir(List pEncontrado){
		for(Object i : pEncontrado){
			Produto produto = (Produto) i ;
			System.out.println("Descri��o: "+produto.getDesc());
			System.out.println("Prateleira: "+produto.getLocal());
		}
	}
}

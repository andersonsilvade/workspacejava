import java.util.List;
import java.util.LinkedList;
import java.util.LinkedList;


public class Inventory {

	private List<Guitar> guitars;
	
	public Inventory(){
		guitars = new LinkedList<Guitar>();
	}
	
	public void addGuitar(String sn, double pr, Caracteristica ca){//resolucao do problema 3
		Guitar gui = new Guitar(sn, pr,ca );
		guitars.add(gui);
	}
	
	public List<Guitar> search(Caracteristica especificacaoCliente){
		List<Guitar> encontradas = new LinkedList<Guitar>();
		for(Object i: guitars){
			Guitar guitarInventory = (Guitar)i;
			if(guitarInventory.getCarc().matches(especificacaoCliente)) encontradas.add(guitarInventory);
		}
		return encontradas;
	}
}

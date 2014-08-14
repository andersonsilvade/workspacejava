import java.util.LinkedList;
import java.util.List;

public class Loja {
	
	private List<Celular> celular;
	
	public Loja(){
		celular  =new LinkedList<Celular>();
	}
	
	public void addCelular(Celular cel){
		celular.add(cel);
	}
	
	public List<Celular> buscarCelular(Especificacao espCliente){
		List<Celular> encontrado = new LinkedList<Celular>();
		for(Object i : celular){
			Celular celularEncontrado = (Celular)i;
			if(celularEncontrado.getEsp().matches(espCliente)==true)encontrado.add(celularEncontrado);
		}
		return encontrado;
	}
	
	

}

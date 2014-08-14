
import java.util.List;
import java.util.LinkedList;

public class Estacionamento {
	
	private List<Carro> listaCarros;
	
	public Estacionamento(){
		listaCarros = new LinkedList<Carro>();
	}
	
	public void addCarro(Carro c){
		listaCarros.add(c);
	}
	
	public List<Carro> buscar(Spec carro){
		List<Carro> encontrados = new LinkedList<Carro>();
		for(Object i:listaCarros){
			Carro carroEstacionado = (Carro)i;
			if(carroEstacionado.getSpec().matches(carro)) 
				encontrados.add(carroEstacionado); 
		}
		return encontrados;
		
	}
	
	public Carro buscarPlaca(String placa){
		for(Object i:listaCarros){
			Carro carroEstacionado = (Carro)i;
			if(carroEstacionado.getPlaca().equals(placa)) return carroEstacionado;
		}
		return null;
	}

}

import java.util.LinkedList;
import java.util.List;
public class Estacionamento {
	
	private List<Carro> car;
	
	public Estacionamento(){
		car = new LinkedList();
	}
	public void addCarro(Carro carro){
		car.add(carro);
	}
	public List buscarCarroEspec(Espec locCarro){
		List encontrado = new LinkedList();
		for(Object i : car){
			Carro carroEstacionado = (Carro)i;
			if (carroEstacionado.getEsp().matches(locCarro)) encontrado.add(carroEstacionado);
		}
		return encontrado;
	}
	public Carro buscarCarroPlaca(String locPlaca){
		for(Object i : car){
			Carro carroEstacionado = (Carro) i;
			if(carroEstacionado.getPlaca().equals(locPlaca)) return carroEstacionado;
			
		}
		return null;
		
	}

}

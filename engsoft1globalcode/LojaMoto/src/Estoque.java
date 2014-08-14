import java.util.List;
import java.util.LinkedList;
public class Estoque {
	private List<Moto>motos;
	
	public Estoque(){
		motos = new LinkedList<Moto>();
	}
	
	public void add(Moto moto){
		this.motos.add(moto);
	}
	
	public List<Moto> buscaMoto(String loc){
		List<Moto> encontrado = new LinkedList<Moto>();
		for(Object i : motos){
			Moto loca = (Moto)i;
			if(loca.matches(loc))encontrado.add(loca);
		}
		return encontrado;
	}

}

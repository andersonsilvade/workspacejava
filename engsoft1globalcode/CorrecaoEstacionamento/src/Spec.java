
public class Spec {
	
	private String modelo;
	private Marca marca;
	private String cor;
	
	public Spec(String m, Marca marc, String c){
		modelo = m;
		marca = marc;
		cor = c;
	}
	
	public boolean matches(Spec carro){
		if(!modelo.equals(carro.modelo)) return false;
		if(!marca.equals(carro.marca)) return false;
		if(!cor.equals(carro.cor)) return false;
		return true;
	}

}

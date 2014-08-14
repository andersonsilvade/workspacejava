
public class Carro {
	
	private String placa;
	private String vaga;
	private Spec spec;
	
	public Carro(String p, String v, Spec s){
		placa = p;
		vaga = v;
		spec = s;
	}
	
	public Spec getSpec(){
		return spec;
	}
	
	public String getPlaca(){
		return placa;
	}
	
	public String getVaga(){
		return vaga;
	}

}


public class Moto {
	
	private String modelo;
	private String cor;
	private Caracteristica carac;
	
	public Moto(String modelo,String cor,Caracteristica carac){
		this.modelo = modelo;
		this.cor = cor;
		this.carac = carac;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Caracteristica getCarac() {
		return carac;
	}

	public void setCarac(Caracteristica carac) {
		this.carac = carac;
	}
	
	public boolean matches(String mod){
		if(!this.modelo.equals(mod))return false;
		return true;
	}
	
	public void imprimir(){
		System.out.println("Modelo: "+getModelo());
		System.out.println("Cor: "+getCor());
		System.out.println("Cilindradas: "+getCarac().getCc());
		System.out.println("Kilometragem "+getCarac().getKm());
		System.out.println("Ano de fabricação "+getCarac().getAno());
	}
		
		
	}
		





public class Especificacao {
	
	public  Marca marca;
	public String modelo;
	
	public Especificacao(Marca marca, String modelo) {
		
		this.marca = marca;
		this.modelo = modelo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean matches(Especificacao celular){
		if(marca.equals(celular.marca)&& (modelo.equals(celular.modelo)))return true;
		return false;
	}

}

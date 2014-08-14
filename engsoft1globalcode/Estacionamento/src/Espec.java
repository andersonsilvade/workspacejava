
public class Espec {
	
	
	private String marca;
	private String modelo;
	private String cor;
	
	public Espec(String marca,String modelo,String cor){
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCor() {
		return cor;
	}
	public boolean matches(Espec carro){
		if((marca.equals(carro.marca))&&(modelo.equals(carro.modelo))&&(cor.equals(carro.cor))) return true;
		return false;
	}
	
	}




public class Carro {
	
	public enum TipoMotor{AVIAO,CARRO,MOTO};

	private String marca;
	private String placa;
	
	
	
	public Carro(String marca,String placa){
		this.marca  = marca;
		this.placa = placa;
		
		
	}
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca(){
		return marca;
	}
	public void setMarca(String nmarca){
		marca = nmarca;
	}

}

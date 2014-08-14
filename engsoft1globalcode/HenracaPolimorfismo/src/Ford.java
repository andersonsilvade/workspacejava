
public class Ford extends Carro{
      String chassi;
	public Ford(String modelo, String cor, float potencia,String chassi) {
		super(modelo, cor, potencia);
		this.chassi = chassi;
		// TODO Auto-generated constructor stub
	}
	public void ligar(){
		System.out.println("Chave Z");
	}
	public void print(){
    	System.out.println("Modelo: "+getModelo());
    	System.out.println("Cor: "+getCor());
    	System.out.println("Potencia: "+getPotencia());
    	System.out.println("Chassi: "+chassi);
    }

}

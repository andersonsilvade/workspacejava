
public class TesteCarro {

	
	public static void main(String[] args) {
		
		Carro carro = new Carro("Fiat","dvq");
		System.out.println("Marca: "+carro.getMarca());
		System.out.println("Placa: "+carro.getPlaca());
	    
		CarroVoador carro1 = new CarroVoador("Fiat","DVQ");
		
		carro1.voar();
		 
		SupreHomen superman = new SupreHomen();
		
		superman.voar();
		
		}

}

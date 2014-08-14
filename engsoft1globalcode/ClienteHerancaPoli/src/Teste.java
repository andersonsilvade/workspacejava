
public class Teste {
	public static void calcula(Cliente cliente){
		cliente.calcula();
	}
	public static void print(Cliente print){
		print.print();
	}

	public static void main(String[] args) {
		
		ClienteFisico a = new ClienteFisico("Roberval", "Anderson","36535012","988240166",5 ,50 ,"28217599831");
		ClienteJuridico b = new ClienteJuridico("Antonio","ABC ltda","33334000","99214232", 100,50, "234567891-10");
		a.setEndereco("9 de Julho");
		a.setQuant(100);
		
		print(a);
		calcula(a);
		System.out.println("##########################");
		print(b);
		calcula(b);
		
		

	}

}

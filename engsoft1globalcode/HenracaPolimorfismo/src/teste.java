
public class teste {
     public static void ligar(Carro carro){
    	 carro.ligar();
     }
     public static void print(Carro print){
    	 print.print();
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gm corsa = new Gm("Corsa","Verde",16);
		Carro fusca = new Carro("Fusca","Prata",12);
		Ford ka = new Ford("Ka", "Vermelho", 13,"XXXXXXX");
		
		ligar(corsa);
		ligar(fusca);
		ligar(ka);
		print(ka);
		print(fusca);
		
		

	}

}

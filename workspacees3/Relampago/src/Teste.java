
public class Teste {
	
	
	public static void main(String[] args) {
		 
		SuperHeroi homemAranha = new SuperHeroi();
		homemAranha.setPoder(new SubirNoPredio());
		homemAranha.executarPoder();
		
		SuperHeroi superMan = new SuperHeroi();
		superMan.setPoder(new Voo());
		superMan.executarPoder();
		
		SuperHeroi mulherMaravilha = new SuperHeroi();
		mulherMaravilha.setPoder(new Laco());
		mulherMaravilha.executarPoder();
		
		
		
	}

}

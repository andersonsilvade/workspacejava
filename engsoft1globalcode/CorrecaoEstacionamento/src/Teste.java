import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		
		Estacionamento e = new Estacionamento();
		e.addCarro(new Carro("ABC1234", "A4", new Spec("Gol", Marca.VW,
				"Cinza")));
		e.addCarro(new Carro("ABD4234", "B4", new Spec("Gol", Marca.VW,
		"Cinza")));
		e.addCarro(new Carro("ABC1555", "A6", new Spec("Fox", Marca.VW,
		"Laranja")));
		
		//Teste de Classes de Equivalencia
		
		// T={("Celta", Marca.GM, "Rosa", "nao foi encontrado nenhum carro"), 
		//("Gol", Marca.GM, "Rosa", "nao foi encontrado nenhum carro"), 
		//("Celta", Marca.VW, "Rosa", "nao foi encontrado nenhum carro"), 
		//("Fox", Marca.VW, "Verde", "nao foi encontrado nenhum carro"),
		//("Celta", Marca.GM, "Cinza", "nao foi encontrado nenhum carro"), 
		//("Gol", Marca.GM, "Cinza", "nao foi encontrado nenhum carro"), 
		//("Celta", Marca.VW,"Cinza", "nao foi encontrado nenhum carro"), 
		//("Fox", Marca.VW,"Laranja", "Foram encontrados 1 carros"), 
		//("Gol", Marca.VW,"Cinza", "Foram encontrados 2 carros")}
		
		List carrosEncontrados = e.buscar(new Spec("Gol", Marca.VW,
				"Cinza"));
		Carro localizado = e.buscarPlaca("ABC1234");
		if(!carrosEncontrados.isEmpty()){
			System.out.println("Foram encontrados "+carrosEncontrados.size()+" carros:");
			for(Object i: carrosEncontrados){
				Carro carro = (Carro)i;
				System.out.println("Placa: "+carro.getPlaca()+
						" Vaga: "+carro.getVaga());
			}
		} else {
			System.out.println("nao foi encontrado nenhum carro");
		}
		if(localizado!=null){
			System.out.println("Placa "+localizado.getPlaca());
			System.out.println("Vaga "+localizado.getVaga());
		}else{
			System.out.println("Carro nao encontrado");
		}
		
	}
	
	/* Rascunho para criar o T de classes de equivalencia
	 * 
	 * Modelo  FVFVFVFV
	   Marca   FFVVFFVV
	   Cor     FFFFVVVV
	 * 
	 * e mais 1 teste para testar a lista.
	 * 
	 * Ao todo 9 testes
	 * 
	 */

}

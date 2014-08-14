import java.util.List;

public class testePessoa {

	public static void main(String[] args) {
		
		Cadastro cadastro = new Cadastro();
		
		cadastro.addPessoa(new Pessoa ("30.672.602.6",new Espec("Anderson Silva",34)));
		cadastro.addPessoa(new Pessoa("25.298.602.5",new Espec("Carolina Silva",32)));
		cadastro.addPessoa(new Pessoa("29.679.506.X",new Espec("Carlos Pereira",30)));
		
		
		List <Pessoa> encontrados = cadastro.localizaPessoa(new Espec("Carlos Pereira",31));
		if (!encontrados.isEmpty()){
			System.out.println("Pessoa encontrada:");
			for(Object i:encontrados){
				Pessoa pessoa = (Pessoa)i;
				
				System.out.println("Nome: "+pessoa.getEsp().getNome());
				System.out.println("RG: "+pessoa.getRg());
				System.out.println("Idade: "+pessoa.getEsp().getIdade());
				
			}
		}else{
			System.out.println("Pessoa  não encontrado");
		
	}

	}
}

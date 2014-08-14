
public class PessoaFisica extends Pessoa {
   
	String cpf ;
	@Override
	public void imprimeDados(){
		super.imprimeDados();
		System.out.println("CPF: "+ cpf);
	}
	
	
}

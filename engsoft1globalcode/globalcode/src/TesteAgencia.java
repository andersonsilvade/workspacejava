
public class TesteAgencia {

	
	public static void main(String[] args) {
		
		Agencia numero = new Agencia("1234",341);
		//numero.numero = "1234";
		//numero.banco = 341;
		System.out.println("-----------------------------------------");
		System.out.println("Banco: "+numero.getNumero() +";  Agencia: "+numero.getBanco());
		System.out.println("-----------------------------------");
		
		
		
		Cliente dados = new Cliente ("Anderson","282175");
		//dados.nome = "Anderson";
		//dados.cpf = "12.978.234.31";
			
		
		System.out.println("Nome: "+dados.getNome() + ";  Cpf: "+dados.getCpf());
		System.out.println("-----------------------------------------");
		
		Conta detalhes = new Conta();
		detalhes.agencia = 8341;
		detalhes.banco = 341;
		detalhes.nomeTitular = "Anderson Silva de Albuquerque";
		detalhes.numeroConta = " 04480-2";
		detalhes.saldo = 2000.00;
		System.out.println("Agencia: "+detalhes.agencia);
		System.out.println("Banco: "+detalhes.banco);
		System.out.println("Nome titular: "+detalhes.nomeTitular);
		System.out.println("Numero conta"+detalhes.numeroConta);
		System.out.println("Saldo: "+detalhes.saldo);
		
	}

}

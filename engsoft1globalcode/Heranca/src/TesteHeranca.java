
public class TesteHeranca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          PessoaFisica pessoa = new PessoaFisica("Anderson","rua","23");
          System.out.println("#############Classe Filha#################");
           pessoa.print();
           
           Pessoa pessoa1 = new Pessoa("Anderson","Ribeiro");
           System.out.println("######################Super Classe#################");
           pessoa1.print();
          
	}

}

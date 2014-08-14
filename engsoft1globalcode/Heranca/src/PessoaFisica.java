
public class PessoaFisica extends Pessoa {
	
	private String cpf;

	
	
	public PessoaFisica(String nome, String enderešo, String cpf) {
		super(nome, enderešo);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
    public void print(){
    	System.out.println("CPF: "+getCpf());
    	System.out.println("Enderešo: "+getEnderešo());
    	System.out.println("Nome: "+getNome());
    }
}


public class PessoaFisica extends Pessoa {
	
	private String cpf;

	
	
	public PessoaFisica(String nome, String endereço, String cpf) {
		super(nome, endereço);
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
    	System.out.println("Endereço: "+getEndereço());
    	System.out.println("Nome: "+getNome());
    }
}

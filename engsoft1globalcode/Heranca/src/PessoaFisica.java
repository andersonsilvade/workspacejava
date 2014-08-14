
public class PessoaFisica extends Pessoa {
	
	private String cpf;

	
	
	public PessoaFisica(String nome, String endere�o, String cpf) {
		super(nome, endere�o);
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
    	System.out.println("Endere�o: "+getEndere�o());
    	System.out.println("Nome: "+getNome());
    }
}

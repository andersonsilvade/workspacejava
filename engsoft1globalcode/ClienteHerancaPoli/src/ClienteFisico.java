
public class ClienteFisico extends Cliente {
	
	 private String cpf;

	public ClienteFisico(String endereco, String nome, String telFix,
			String telCel, int quant, float valor,String cpf) {
		super(endereco, nome, telFix, telCel, quant, valor);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void calcula(){
    	float total = getQuant() * getValor();
    	System.out.println("o valor total é: "+total);
    }
    public void print(){
    	System.out.println("Pessoa Fisica:");
    	System.out.println("Nome : "+getNome());
    	System.out.println("CPF: "+getCpf());
    	System.out.println("Endereço: "+getEndereco());
    	System.out.println("Telefone: "+getTelFix());
    	System.out.println("Celular: "+getTelCel());
    	
	}

}

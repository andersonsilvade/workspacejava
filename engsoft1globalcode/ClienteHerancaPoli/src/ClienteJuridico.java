
public class ClienteJuridico extends Cliente{
	
	
	private String cnpj;
	public ClienteJuridico(String endereco, String nome, String telFix,
			String telCel, int quant, float valor,String cnpj) {
		super(endereco, nome, telFix, telCel, quant, valor);
		 this.cnpj = cnpj;
	}
		
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
	public void calcula(){
    	float total = getQuant() * getValor();
    	total = (float) (total-(total*0.10));
    	System.out.println("o valor total é: "+total);
    }
    public void print(){
    	System.out.println("Pessoa Fisica:");
    	System.out.println("Nome : "+getNome());
    	System.out.println("CNPJ: "+getCnpj());
    	System.out.println("Endereço: "+getEndereco());
    	System.out.println("Telefone: "+getTelFix());
    	System.out.println("Celular: "+getTelCel());
    	
	}


}

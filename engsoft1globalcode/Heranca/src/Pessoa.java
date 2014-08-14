
public class Pessoa {

	private String endereço;
	private String nome;
	public Pessoa(String nome, String endereço) {
		super();
		this.nome = nome;
		this.endereço = endereço;
	}

	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	public String toString(){
		return super.toString();
	}
	public void print(){
		System.out.println("Nome: "+getNome());
		System.out.println("Endereço : "+getEndereço());
	}
}

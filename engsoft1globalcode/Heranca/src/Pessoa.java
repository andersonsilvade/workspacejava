
public class Pessoa {

	private String enderešo;
	private String nome;
	public Pessoa(String nome, String enderešo) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
	}

	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	
	public String toString(){
		return super.toString();
	}
	public void print(){
		System.out.println("Nome: "+getNome());
		System.out.println("Enderešo : "+getEnderešo());
	}
}

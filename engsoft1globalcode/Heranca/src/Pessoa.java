
public class Pessoa {

	private String endere�o;
	private String nome;
	public Pessoa(String nome, String endere�o) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
	}

	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
	public String toString(){
		return super.toString();
	}
	public void print(){
		System.out.println("Nome: "+getNome());
		System.out.println("Endere�o : "+getEndere�o());
	}
}

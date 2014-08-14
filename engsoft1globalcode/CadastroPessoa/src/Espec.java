
public class Espec {
	private String nome;
	private int idade;
	
	public Espec(String nome,int idade){
		this.nome = nome;
		this.idade = idade;
		 
		
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
		}
	

	public void setIdade(int idade) {
		if(idade>0){
		this.idade = idade;
		}else{
			System.out.println("Idade inválida");
		}
	}
    public boolean comparar(Espec espPessoa){
    	if(!nome.equals(espPessoa.nome))return false;
		if(this.idade!=espPessoa.idade)return false;
		return true;
    }
	
}

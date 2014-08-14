
public class Aluno {
	
	private String nome;
	private int ra;
	private DadosPessoais dp;
	
	public Aluno(String n, int r, DadosPessoais d){
		nome = n;
		ra = r;
		dp = d;
	}
	

	public String getNome(){
		return nome;
	}
	public void setNome(String novoNome){
		nome = novoNome;
	}
	public int getRa(){
		return ra;
	}
	public void setRa(int novoRa){
		ra = novoRa;
	}  	
	public DadosPessoais getDp(){
		return dp;
	}
	
	public void setDp(DadosPessoais dadosPe){
		dp = dadosPe;
	}
   public void print(){
	   System.out.println("Nome: "+getNome());
		System.out.println("ra: "+getRa());
		System.out.println("Endereco: "+getDp().getEndereco());
		System.out.println("Telefone: "+getDp().getTelefone());
		
   }

}
    	




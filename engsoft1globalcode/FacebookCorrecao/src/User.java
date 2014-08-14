
public class User {

	private DadosLogin dadosLogin;
	private String nome;
	private String sobreNome;
	private String endereco;
	
	public User(DadosLogin dl,String n, String sn, String end){
		dadosLogin = dl;
		nome = n;
		sobreNome = sn;
		endereco = end;
	}
	
	public DadosLogin getDadosLogin(){
		return dadosLogin;
	}
	
}

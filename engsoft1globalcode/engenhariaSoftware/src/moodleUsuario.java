
public class moodleUsuario {

	private String nomeUsuario;
	private String senha;
	private String email;
	private String nome;
	private String sobreNome;
	private String cidade;
	private Pais pais;


	public String getNomeUsuario(){
		return nomeUsuario;
	}

	public void setNomeUsuario(String userName){
		nomeUsuario = userName;
	}

	public String getSenha(){
		return senha;
	}
	public void setSenha(String senhaUsuario){
		senha = senhaUsuario;
	}

	public String getEmail(){
		return email;
	}
	public void setEmail(String emailUsuario){
		email = emailUsuario;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nomeUsuario){
		nome = nomeUsuario;
	}
	public String getSobrenome(){
		return sobreNome;
	}
	public void setSobreNome(String sobreNomeUsuario){
		sobreNome=sobreNomeUsuario;
	}
	public String getCidade(){
		return cidade;
	}
	public void setCidade(String cidadeUsuario){
		cidade = cidadeUsuario;
	}
	public Pais getPais(){
		return pais;
	}
	public void setPais(Pais paisUsuario){
		pais = paisUsuario;
	}

	public void  printUsuario(){
		System.out.println("nome Usuario: "+nomeUsuario );
		System.out.println("nome: "+nome);
		System.out.println("sobrenome: "+sobreNome); 
		System.out.println("Cidade: " + cidade);
		System.out.println("email: "+email);
	}
}

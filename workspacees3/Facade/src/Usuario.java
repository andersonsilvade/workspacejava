
public class Usuario {
	
	
	private String nome;
	private String senha;
	
	public Usuario(String nome, String senha) {
		
		this.nome = nome;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean matches(Usuario usr){
		if(!usr.nome.equals(nome))return false;
		if(!usr.senha.equals(senha))return false;
		return true;
	}

}

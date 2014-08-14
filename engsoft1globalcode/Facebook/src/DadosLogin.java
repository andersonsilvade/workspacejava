
public class DadosLogin {
	
	private String email;
	private String senha;
	
	public DadosLogin(String email,String senha){
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	 public boolean matches(DadosLogin login){
		 if(!email.equals(login.email))return false;
		 if(!senha.equals(login.senha))return false;
		 return true;
	 }

}

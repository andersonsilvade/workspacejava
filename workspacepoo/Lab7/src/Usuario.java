import java.io.Serializable;
import java.util.Scanner;


public class Usuario implements Serializable{
	
	
	private String usuario;
	private String senha;
	
	public Usuario(){
		this.usuario = usuario;
		this.senha = senha;
	}
   
	public Usuario(String usuario,String senha){		
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public boolean autenticar(Usuario user){
		if(user.usuario.equals(this.usuario) && user.senha.equals(this.senha) )return true;
		return false;
	}
	
	
       
	}
	
	



package br.com.exemplo1;

public class Usuario {
	
	private String nomeUsuario;
	private Cachorro cachorro;
	
	public Usuario(){
		super();
	}
	
	
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public Cachorro getCachorro() {
		return cachorro;
	}
	public void setCachorro(Cachorro cachorro) {
		this.cachorro = cachorro;
	}

}

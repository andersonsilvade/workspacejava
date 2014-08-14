package br.com.exe6;

public class CadastroCliente {
	private String nome;
	private String tel;
	private String email;
	private String endereco;
	
	
	
  public CadastroCliente(String nome, String tel, String email, String endereco) {
		
		this.nome = nome;
		this.tel = tel;
		this.email = email;
		this.endereco = endereco;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}

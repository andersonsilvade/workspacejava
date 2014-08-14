
public class Usuario {
	
	private String nome;
	private String sobreNome;
	private Cidade cidade;
	private String cpf;
	private DadosLogin log;
	
	public Usuario(String nome,String sobreNome,Cidade cidade,String cpf,DadosLogin log){
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.cidade = cidade;
		this.cpf = cpf;
		this.log = log;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public DadosLogin getLog() {
		return log;
	}

	public void setLog(DadosLogin log) {
		this.log = log;
	}
	
	

}

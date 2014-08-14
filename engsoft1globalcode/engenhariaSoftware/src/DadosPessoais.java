
public class DadosPessoais {


	private String endereco;
	private String telefone;
	public DadosPessoais(String end, String tel){
		endereco = end;
		telefone = tel;
	}

	public String getEndereco(){
		return endereco;
	}
	public void  setEndereco(String novoEndereco){
		endereco = novoEndereco;
	}
	public String getTelefone(){
		return telefone;
	}
	public void setTelefone(String novoTelefone){
		telefone = novoTelefone;
	}
}

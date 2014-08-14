
public class PessoaFisica extends Pessoa {
	
	private String tel;

	public PessoaFisica(String nome, String endereco, String tel) {
		super(nome, endereco);
		this.tel = tel;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
  public String falar(){
	 return "Pago imposto";
  }
}

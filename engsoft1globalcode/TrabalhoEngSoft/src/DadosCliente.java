public class DadosCliente {

	private String telFix;
	private String telCel;
	private String email;
	private String endereco;
	private String cep;

	public DadosCliente(String telFix, String telCel, String email,
			String endereco, String cep) {

		setTelFix(telFix);
		setTelCel(telCel);
		this.email = email;
		this.endereco = endereco;
		setCep(cep);
	}

	public String getTelFix() {
		return telFix;
	}

	public void setTelFix(String telFix) {
		if (telFix.length() != 10) {
			if(telFix.length()< 10)
			this.telFix = "Número de telefone inválido,está(ão) faltando "+(10-telFix.length()) +" digito(s)";
			if(telFix.length()>10)
			this.telFix = "Número de telefone inválido,contém "+(telFix.length()-10) +" digito(s) a mais";
		} else {
			this.telFix = telFix.substring(0, 0)+"("+telFix.substring(0,2)+")"+ telFix.substring(2,6)+"-"+telFix.substring(6,10);
		}

	}

	public String getTelCel() {
		return telCel;
	}

	public void setTelCel(String telCel) {
		if (telCel.length() != 10) {
			if(telCel.length()<10)
			this.telCel = "Número de celular inválido,está(ão) falatando "+(10-telCel.length())+ " digito(s)";
			if(telCel.length()>10)
				this.telCel = "Número de celular inválido,contém "+(telCel.length()-10)+ " digito(s) a mais";

		} else {
			this.telCel =telCel.substring(0, 0)+"("+telCel.substring(0,2)+")"+ telCel.substring(2,6)+"-"+telCel.substring(6,10);
		}
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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if (cep.length() != 8) {
			if(cep.length()<8)
			this.cep = "Cep inválido,está(ão) faltando "+(8-cep.length())+" digito(s)";
			
			if(cep.length()>8)
				this.cep = "Cep inválido,cpf contém "+(cep.length()-8)+" digito(s) a mais";
		} else {
			this.cep = cep.substring(0,5)+"-"+cep.substring(5, 8);
		}
	}

}

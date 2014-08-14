package br.com.globalcode.aj4.annotations;

public class ClienteEspecial extends Cliente {
	
	@GUIVisible(nomeCampo = "Cliente Especial:")
	public String ECliente;
	
	public String getECliente() {
		return ECliente;
	}

	public void setECliente(String eCliente) {
		ECliente = eCliente;
	}

	
	
	
	

}

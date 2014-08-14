
public class CPF {

	private String cpf;

	

	
public CPF(String cpf) {
	
		this.cpf = cpf;
	}









public String getCpf() {
	return formataCpf();
}




public void setCpf(String cpf) {
	this.cpf = cpf;
}
public void imprimir(){
	System.out.println(getCpf());
}
}

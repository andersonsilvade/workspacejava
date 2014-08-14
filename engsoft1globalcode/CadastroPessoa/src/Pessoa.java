
public class Pessoa {
	
	private String rg;
	private Espec esp;
	
	public Pessoa(String rg,Espec esp){
		this.rg = rg;
		this.esp = esp;
	}
	public String getRg(){
		return rg;
	}
	public Espec getEsp(){
		return esp;
	}

}


public class Carro {

	private String placa;
	private String vaga;
	private Espec esp;
	
	public Carro(String placa,String vaga,Espec esp){
		this.placa = placa;
		this.vaga = vaga;
		this.esp = esp;
	}
	public String getPlaca(){
		return placa;
	}
	public String getVaga(){
		return vaga;
	}
	public Espec getEsp(){
		return esp;
	}
	public void imprimir(){
		System.out.println("Palca: "+getPlaca());
		System.out.println("Vaga: "+getVaga());
		System.out.println("Cor: "+getEsp().getCor());
		System.out.println("Marca: "+getEsp().getMarca());
		System.out.println("Modelo: "+getEsp().getModelo());
	}
}

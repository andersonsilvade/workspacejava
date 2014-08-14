
public class Celular {
	
	private double preco;
	private String cor;
	private So so;
	private Especificacao esp;
	
	public Celular(double preco,String cor,So so,Especificacao esp){
		
		setPreco(preco);
		this.cor = cor;
		this.so = so;
		this.esp = esp;
		
	}
	public double getPreco(){
		return preco;
	}
	public void setPreco(double preco){
		if(preco>50){
			this.preco = preco;
		}else{
			System.out.println("Preço invalido!!!");
		}
	}
	public String getCor(){
		return cor;
	}
	public void setCor (String cor){
		this.cor = cor;
		}
	public So getSo(){
		return so;
	}
	public void setSo(So so){
		this.so = so;
	}
	public Especificacao getEsp(){
		return esp;
	}
	
	public void imprimir(){
		System.out.println("Preço: " +getPreco());
		System.out.println("Cor: "+getCor());
		System.out.println("Sistema operacional: "+getSo());
		System.out.println("Marca: "+getEsp().getMarca());
		System.out.println("Modelo: "+getEsp().getModelo());
	}
	
	

}

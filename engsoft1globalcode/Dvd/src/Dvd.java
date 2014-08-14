
public class Dvd {
	
	private double preco;
	private Espec esp;

	
	public Dvd(double preco,Espec esp){
		setPreco(preco);
		this.esp = esp;
	}
	
	public double getPreco(){
		return preco;
	}
	public void setPreco(double preco){
		if(preco>0){
			this.preco = preco;
		}else{
			System.out.println("preço inválido!!!");
		}
	}
	public Espec getEsp(){
		return esp;
	}
	
	
	public void imprimir(){
		
		System.out.println("Titulo: "+getEsp().getTitulo());
		System.out.println("Genero: "+getEsp().getGenero());
		System.out.println("Ano: "+getEsp().getAno());
		System.out.println("Preço: "+getPreco());
	}
	
	
}

public class Espec {
	
	private String titulo;
	private String genero;
	private String ano;
	
	public Espec(String titulo,String genero,String ano){
		this.titulo = titulo;
		this.genero = genero;
		this.ano = ano;
	}
	
	public String getTitulo(){
		return titulo;
	}
	public String getGenero(){
		return genero;
	}
	public String getAno(){
		return ano;
	}
	
	public boolean compararDvd(Espec dvdCliente){
		if((titulo.equals(dvdCliente.titulo))&& (genero.equals(dvdCliente.genero))&&( ano.equals(dvdCliente.ano))) return true;
		
		return false;	
	}

}

public class EspecLivro {
	private String titulo;
	private String autor;
	
	public EspecLivro(String titulo,String autor){
		this.titulo = titulo;
		this.autor = autor;
	}
	public String getTitulo(){
		return this.titulo;
	}
	public String getAutor(){
		return this.autor;
	}
	
	public boolean comparar(EspecLivro espCliente){
		if(!titulo.equals(espCliente.titulo))return false;
		if(!autor.equals(espCliente.autor))return false;
		return true;
	}
	
	
}

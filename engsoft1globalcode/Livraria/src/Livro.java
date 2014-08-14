
public final class Livro {
	
	private String isbn;
	private double preco;
	private EspecLivro esp;
	
	public Livro(String isbn,double preco,EspecLivro esp){
		this.isbn = isbn;
		this.preco = preco;
		this.esp = esp;
	}
	
	public String getIsbn(){
		return this.isbn;
	}
	public double getPreco(){
		return this.preco;
	}
	public void setPreco(double pr){
		if(pr>=5.0){
		this.preco = pr;
	}else{
		System.out.println("Preço invalido!!!");
	}
	}
    public EspecLivro getEsp(){
    	return this.esp;
    }

}

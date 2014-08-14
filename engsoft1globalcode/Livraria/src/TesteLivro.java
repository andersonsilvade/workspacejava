import java.util.List;
public class TesteLivro {

	public static void main(String[] args) {
	

	Estoque estoque = new Estoque();
	
	estoque.addLivro(new Livro("123abs",45.0,new EspecLivro("Hobbit","Tolkien")));
	estoque.addLivro(new Livro("567abs",55.0,new EspecLivro("Engenharia","Sommer")));
	estoque.addLivro(new Livro("123abs",45.0,new EspecLivro("Senhor do aneis","TOLKIEN")));
	
	List <Livro> encontrados = estoque.buscarLivro(new EspecLivro("Hobbit","Tolkien"));
	
	if (!encontrados.isEmpty()){
		System.out.println("Foram encontrados os seguintes livros:");
		for(Object i:encontrados){
			Livro livro = (Livro)i;
			System.out.println("ISBN: "+livro.getIsbn());
			System.out.println("Preço:"+livro.getPreco());
			System.out.println("Titulo: "+livro.getEsp().getTitulo());
			System.out.println("Autor: "+livro.getEsp().getAutor());
		}
	}else{
		System.out.println("Livro não encontrado");
	
	}
}
}



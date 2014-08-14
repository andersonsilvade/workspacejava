
public class Bebida {

	private String nome;
	private double preco;
	private Espec esp;

	public Bebida(String n, double pr, Espec es){
		nome = n;
		preco = pr;
		esp = es;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String novoNome){
		nome = novoNome;
	}

	public double getPreco(){
		return preco;
	}
	public void setPreco(double novoPreco){
		preco = novoPreco;
	}
	public Espec getEsp(){
		return esp;
	}

	public void setEsp(Espec es){
		esp = es;
	}
	public void print(){
		System.out.println("Nome :"+getNome());
		System.out.println("Preço: "+getPreco()+"R$");
		System.out.println("Teor Alcoolico: "+getEsp().getTeorAlcoolico());
		System.out.println("Volume: "+getEsp().getVolume());
		System.out.println("Recipiente: "+getEsp().getRecipiente());
		System.out.println("Fabricante: "+getEsp().getFabricante());
		System.out.println("Origem: "+getEsp().getOrigem());
		System.out.println("Caloria: "+getEsp().getCaloria());
	}

	}

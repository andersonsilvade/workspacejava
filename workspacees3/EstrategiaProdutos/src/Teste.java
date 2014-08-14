
public class Teste {
	
	public static void main(String[] args) {
		
		
		Funcionario joao = new Funcionario();
		joao.setB(new BuscaEstoquista());
		
		Funcionario maria = new Funcionario();
		maria.setB(new BuscaEstagiario());
	
		
		Estoque e = new Estoque(joao);
		inicializarEstoque(e);
		
		Estoque m = new Estoque(maria);
		inicializarEstoque(m);
		
		//e.buscar(new Produto("Roda", 0.0, "", 0));
		
		System.out.println("-----------------------------");
		
		
		
		Funcionario anderson = new Funcionario();
		anderson.setB(new BuscaEstoquista());
		Estoque silva = new Estoque(anderson);
		inicializarEstoque(silva);
		
		silva.buscar(new Produto("Pneu", 0.0, "", 0, new MatchesNome()));
		
		
		
		
		
		 
		
		
		joao.setB(new BuscaVendedor());
		
		System.out.println("-----------------------------");
		
		
	//	e.buscar(new Produto("Roda", 0.0, "", 0));
		System.out.println("-----------------------------");
		
	}
	
	public static void inicializarEstoque(Estoque est){
		est.addProduto(new Produto("Roda", 400.0, "ABC345", 90));
		est.addProduto(new Produto("Roda", 500.0, "CDB667", 10));
		est.addProduto(new Produto("Pneu", 200.0, "DDR55", 45));
		
	}

}

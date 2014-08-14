import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;


public class CadastroProduto implements Serializable{

	DecimalFormat formato = new DecimalFormat("0.00");
	private List<Produto> prod;
	transient Scanner scanner = new Scanner(System.in);

	public CadastroProduto(){
		prod = new Vector<Produto>();
	}

	public void cadastrarProduto(){
		if(scanner == null){
			scanner = new Scanner(System.in);
		}
		System.out.println("Digite o Produto: ");
		String p = scanner.nextLine();
		System.out.println("Quantidade: ");
		double qt = scanner.nextDouble();

		Produto produto = new Produto(p, qt);
		prod.add(produto);		
	}

	public void gerarRelatorio(){
		if(!prod.isEmpty()){
			Collections.sort(prod);
			System.out.println("------------------------------");
			System.out.println("LISTA DE PRODUTOS CADASTRADOS");
			System.out.println("PRODUTO        |QUANTIDADE       ");
			for(Object i : prod){
				Produto p = (Produto) i;
				if(p.getProduto().length() <= 7){
					System.out.println(p.getProduto()+"\t\t"+formato.format(p.getQuantProd()));
					
				}else{
					System.out.println(p.getProduto()+"\t"+formato.format(p.getQuantProd()));
				}
			}
			System.out.println("------------------------------");

		}else{
			System.out.println("Nenhum Produto cadastrado!!!!");
		}
	}

	public void opcoes(){
		System.out.println("ESCOLHA UMA OPÇÃO ABAIXO ");
		System.out.println("1 - CADASTRAR PRODUTO ");
		System.out.println("2 - EDITAR PRODUTO ");
		System.out.println("3 - REMOVER PRODUTO ");
		System.out.println("4 - GERAR RELATÓRIO ");
		System.out.println("5 - RECUPERAR ESTOQUE");
		System.out.println("6 - ADICIONAR AO ESTOQUE");
		System.out.println("7 - BAIXAR ESTOQUE");
		System.out.println("8 - SAIR ");
	}
	public void editarProduto(){
		if(scanner == null){
			scanner = new Scanner(System.in);
		}
		int opcao;
		System.out.println("1 - EDITAR PRODUTO ");
		System.out.println("2 - EDITAR QUANTIDADE ");
		opcao = scanner.nextInt();
		int cont = 0;
		if(opcao == 1){
			
			System.out.println("Digite qual produto vai ser editado ");
			String nome = scanner.next();
			for(Object i : prod){
				Produto p = (Produto) i;
				if(p.getProduto().equalsIgnoreCase(nome)){
					cont++;
					System.out.println("Digite o novo nome ");
					String editar = scanner.next();
					p.setProduto(editar);
					System.out.println("Produto editado com sucesso");
				}
			}
			
		}
		if(opcao == 2){
          
			System.out.println("Digite qual produto vai ser editar  ");
			String nome = scanner.next();
			for(Object i : prod){
				Produto p = (Produto) i;
				if(p.getProduto().equalsIgnoreCase(nome)){
					cont++;
					System.out.println("digite nova quantidade ");
					double qt = scanner.nextDouble();
					p.setQuantProd(qt);
					System.out.println("Quantidade editado com sucesso");
				}

			}
		}
		if(opcao != 1 && opcao != 2){
			System.out.println("Opção inválida!!!");
			editarProduto();
		}
		if(cont == 0){
			System.out.println("Produto não encontrado");
		}
		cont = 0;
	}
	
	public void removerProduto(){
		if(scanner == null){
			scanner = new Scanner(System.in);
		}
		if(!prod.isEmpty()){
			
			System.out.println("Digite qual produto deseja excluir");
			String nome = scanner.next();
			for(Object i : prod){
				Produto p = (Produto) i;
				if(p.getProduto().equalsIgnoreCase(nome)){
					prod.remove(p);
					System.out.println("Produto removido com sucesso");
					break;
				}

			}

		}
	}
	public void somarQuatidadeEstoque(){
		if(scanner == null){
			scanner = new Scanner(System.in);
		}
		if(!prod.isEmpty()){
			System.out.println("Digite o produto qual será adicionado mais item ao estoque");
			String nome = scanner.next();
			for(Object i : prod){
				Produto p = (Produto) i;
				if(p.getProduto().equalsIgnoreCase(nome)){
					System.out.println("digite a quantidade: ");
					double qt = scanner.nextDouble();
					p.setQuantProd(p.getQuantProd()+qt);
					System.out.println("adicionado com sucesso");
				}
			}

		}
	}
	public void subtrairQuantidadeEstoque(){
		if(scanner == null){
			scanner = new Scanner(System.in);
		}
		if(!prod.isEmpty()){
			System.out.println("Digite o produto qual será subtraido mais item ao estoque");
			String nome = scanner.next();
			for(Object i : prod){
				Produto p = (Produto) i;
				if(p.getProduto().equalsIgnoreCase(nome)){
					System.out.println("digite a quantidade: ");
					double qt = scanner.nextDouble();
					p.setQuantProd(p.getQuantProd()-qt);
					System.out.println("subtraido com sucesso");
				}
			}

		}
		
	}
}

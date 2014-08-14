import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;






public class Aplicacao {

	public static void salvarEstoque(CadastroProduto cp) throws Exception{    	
		FileOutputStream escritaDisco = new FileOutputStream("estoque.ser");
		ObjectOutputStream escritaObjeto = new ObjectOutputStream(escritaDisco);
		escritaObjeto.writeObject(cp);
		System.out.println("salvando ...");
		escritaObjeto.close();
		
	}
	public static CadastroProduto recuperarEstoque() throws IOException, ClassNotFoundException{
		FileInputStream ler = new FileInputStream("estoque.ser");
		ObjectInputStream lerDisco = new ObjectInputStream(ler);
		CadastroProduto prod = (CadastroProduto) lerDisco.readObject();
		lerDisco.close();
		
		return prod;
	}
	public static void main(String[] args) throws Exception, IOException {
		Scanner scanner = new Scanner(System.in);
		 CadastroProduto produtos = new CadastroProduto();
		 int sair = 0;
		 int opcao = 0;
		 while(sair == 0){
			 switch(opcao){
			 case 0 :{
				 //recuperarEstoque();
				 produtos.opcoes();
				 opcao = scanner.nextInt();
				 break;
			 }
			 case 1:{
				 produtos.cadastrarProduto();
				 salvarEstoque(produtos);
				 opcao = 0;
				 break;
			 }
			 case 2:{
				 produtos.editarProduto();
				 salvarEstoque(produtos);
				 opcao = 0;
				 break;
				 
			 }
			 case 3:{
				 produtos.removerProduto();
				 salvarEstoque(produtos);
				 opcao = 0;
				 break;
				 }
			 case 4:{
				 produtos.gerarRelatorio();
				 opcao = 0;
				 break;
			 }
			 case 5 :{
				produtos = recuperarEstoque();
				 System.out.println("Estoque recuperado com sucesso");
				 System.out.println("");
				 opcao = 0;
				 break;
			 }
			 case 6 :{
				 produtos.somarQuatidadeEstoque();
				 salvarEstoque(produtos);
				 opcao = 0;
				 break;
			 }
			 case 7:{
				 produtos.subtrairQuantidadeEstoque();
				 salvarEstoque(produtos);
				 opcao = 0;
				 break;
			 }
				 
			 case 8 :{
				 System.out.println("Encerrando...");
				 
				 sair = 1;
				 break;
			 }
			 default :{
				 produtos.opcoes();
				 opcao = scanner.nextInt();
				 break;
				 
			 }
			 }


	}

}
}

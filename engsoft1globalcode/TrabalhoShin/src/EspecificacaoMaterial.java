
public class EspecificacaoMaterial {
	
	private String nome;
	private String descricao;
	private int quantidade;
	private String fornecedor;
	private float porcMinEstoque;
	
	
	public EspecificacaoMaterial(String nome, String descricao,   int quantidade, String fornecedor, float porcMinEstoque){
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.fornecedor = fornecedor;
		this.porcMinEstoque = porcMinEstoque;
			
		}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public boolean compararMaterial(EspecificacaoMaterial compararMaterial){
		if((!nome.equals(compararMaterial.nome)) 
			&& (quantidade == compararMaterial.quantidade) 
			&& (!fornecedor.equals(compararMaterial.fornecedor)) 
			&& (porcMinEstoque == compararMaterial.porcMinEstoque)) return false;
		return true;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////
	public String getDescricao(){
		return descricao;
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////	
	public int getQuantidade(){
		return quantidade;
	}
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////
	public String getFornecedor(){
		return fornecedor;
	}
	public void setFornecedor(String fornecedor){
		this.fornecedor = fornecedor;
	}
////////////////////////////////////////////////////////////////////////////////////////////////////
	public float getPorcMinEstoque(){
		return porcMinEstoque;
	}
	public void setPorcMinEstoque(float porcMinEstoque){
		this.porcMinEstoque = porcMinEstoque;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////	
}

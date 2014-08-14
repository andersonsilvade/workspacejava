
public class Material {
	
	private String codigoMaterial;
	private double preco;
	private EspecificacaoMaterial esp;
	
	public Material( String codigoMaterial,double preco,EspecificacaoMaterial esp){
		this.esp = esp;
		this.preco = preco;
		this.codigoMaterial = codigoMaterial;
		}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public String getCodigoMaterial(){
		return codigoMaterial;
	}
	public void setCodigoMaterial(String codigoMaterial){
		this.codigoMaterial = codigoMaterial;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////
	public double getPreco(){
		return preco;
	}
	public void setPreco(double preco){
		this.preco = preco;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public EspecificacaoMaterial getEsp(){
		return esp;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/*public boolean compararCodigo(Material codMaterial){
		if (!this.codigoMaterial.equals(codMaterial.codigoMaterial))
			return false;
		return true;
	}*/
	public boolean comparar(Material buscar){
		if (!this.codigoMaterial.equals(buscar.codigoMaterial))
			return false;
		return true;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////
public void imprimir(){
	System.out.println("Nome: "+getEsp().getNome());
	System.out.println("Descricao: "+getEsp().getDescricao());
	System.out.println("Codigo: "+getCodigoMaterial());
	System.out.println("Quantidade: "+getEsp().getQuantidade());
	System.out.println("Fornecedor: "+getEsp().getFornecedor());
	System.out.println("Porcentagem Minima: "+getEsp().getPorcMinEstoque());
	System.out.println("Preço: "+getPreco());
	System.out.println("##########################################################+++");
	}
}


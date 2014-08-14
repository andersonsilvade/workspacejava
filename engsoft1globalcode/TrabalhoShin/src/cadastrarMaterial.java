
import java.util.LinkedList;

import java.util.List;

public class cadastrarMaterial {

	private List<Material> materiais;
	
	public cadastrarMaterial(){
		materiais = new LinkedList<Material>();
	}
	
	public void adicionarMaterial(Material material){
		this.materiais.add(material);
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public List<Material> listarMateriais(){
		List<Material> encontrados = new LinkedList<Material>();
	for (Object i:materiais){
		Material materialEncontrado = (Material)i;
		encontrados.add(materialEncontrado);
		}
	return encontrados;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	/*public List buscarPorCodigoMaterial(String codigoMaterial){
		List encontrados = new LinkedList();
	for(Object i:materiais){
		Material materialEncontrado = (Material)i;
		if(materialEncontrado.getCodigoMaterial().equals(codigoMaterial)) encontrados.add(i); 
			
	}
	return encontrados;
}*/
	public Material buscarPorCodigoMaterial(String codigoMaterial){
		
	for(Object i:materiais){
		Material materialEncontrado = (Material)i;
		if(materialEncontrado.getCodigoMaterial().equals(codigoMaterial))
			return materialEncontrado;
			
	}
	return null;
}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	public List <Material>buscarPorPreco(double preco){
		List<Material> encontrados = new LinkedList<Material>();
	for(Object i:materiais){
		Material materialEncontrado = (Material)i;
		if (materialEncontrado.getPreco() == preco) encontrados.add(materialEncontrado);
			
	}
	return encontrados;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public EspecificacaoMaterial buscarPorMaterial(String nome){
		for(Object i:materiais){
			EspecificacaoMaterial nomeEncontrado = (EspecificacaoMaterial)i;
		if(nomeEncontrado.getNome().equals(nome)) 
			return nomeEncontrado;
	} 
	return null;
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	public List <Material> excluirMaterial(String codigo){
		for(Object i:materiais){
		Material excluido = (Material)i;
		if(excluido.getCodigoMaterial().equals(codigo))materiais.remove(excluido); 
			
	}
	return materiais;
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
}	




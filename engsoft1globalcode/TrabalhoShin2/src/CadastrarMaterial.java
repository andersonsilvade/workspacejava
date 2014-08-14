
import java.util.LinkedList;

import java.util.List;

public class CadastrarMaterial {

	private List<Material> materiais;
	
	public CadastrarMaterial(){
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
	
	public Material buscarPorCodigoMaterial(String codigoMaterial){
		
	for(Object i:materiais){
		Material materialEncontrado = (Material)i;
		if(materialEncontrado.getCodigoMaterial().equals(codigoMaterial))
			return materialEncontrado;
			
	}
	return null;
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
	public List<Material> excluirMaterial(String codigo){
		
		for(Object i:materiais){
		
		Material excluido = (Material)i;
		
		if(excluido.getCodigoMaterial().equals(codigo)) materiais.remove(i); 
			
	}
	return materiais;
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
}	




import java.util.List;

public class Teste {
	public static void main(String[] args) {
		
		cadastrarMaterial m = new cadastrarMaterial();
		m.adicionarMaterial(new Material ("LVC",200,new EspecificacaoMaterial("Linha Verde","linha verde comum",30,"Corrente",23)));
		
		m.adicionarMaterial(new Material ("LAF",200,new EspecificacaoMaterial("Linha Azul","linha azul extra forte",35,"Chuck Norris",40)));
		
		m.adicionarMaterial(new Material("LVC", 300,new EspecificacaoMaterial ("Linha Vermelha", "Linha Vermelha Comum", 60, "Corrente", 20)));

		m.adicionarMaterial(new Material("LAC", 100,new EspecificacaoMaterial("Linha Amarela", "Linha Amarela Comum", 50, "Corrente", 20)));

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		List<Material> localizado = m.listarMateriais();
		List <Material> x = m.excluirMaterial("LAF");
		
		Material encontrado = m.buscarPorCodigoMaterial("LVC");
		Material encontrado1 = m.buscarPorCodigoMaterial("LLLV");
		//List <Material>excluido = m.excluirMaterial("LVC");
	    if(encontrado1 != null){
	    	System.out.println("============ Pesquisa por Material: ===========");
	    	System.out.println("Material Encontrado");
	    	encontrado1.imprimir();
	    	System.out.println("########################################################");
	    	
	    }else{
	    	System.out.println("============ Pesquisa por Material: ===========");
	    	System.out.println("Material Nao Encontrado");
	    	System.out.println("########################################################");
	    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	    
	    if(encontrado != null){	
	    	System.out.println("============ Pesquisa por Material: ===========");
	    	System.out.println("Material Encontrado");
	    	encontrado.imprimir();
	    	
	    	
		  }else{
			System.out.println("============ Pesquisa por Material: ===========");
		    System.out.println("Material Nao Encontrado");
		    System.out.println("########################################################");
		    	
		    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    System.out.println("\n\n============= Lista de Materiais: ====================\n\n");
	    for(Object i : localizado){
	    	Material mat = (Material)i;
	    	
	    	mat.imprimir();
	    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    //excluir material:
	    
	System.out.println("\n\n============= Lista de Materiais Apos Exclusão: ====================\n\n");    
		for(Object i : x){
			Material lista = (Material)i;
			lista.imprimir();
    	System.out.println("########################################################");
		}
	    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


	}
}
	
	
	


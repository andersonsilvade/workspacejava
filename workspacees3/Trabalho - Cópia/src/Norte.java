

import java.util.List;


public class Norte implements ImprimirVitimaRegiao{

	public void imprimirVitimaRegia(List<Acidente> v){
		 int totalNorte = 0;
		
	        if(!v.isEmpty()){
	        	System.out.println();
	              for(Object i : v){
			      Acidente acid = (Acidente)i;
			      totalNorte = totalNorte + acid.getTotalRegNorte();
			        }
	              System.out.println("Total de mortos em acidentes de transito na região Norte: "+totalNorte);
	                }
}
}


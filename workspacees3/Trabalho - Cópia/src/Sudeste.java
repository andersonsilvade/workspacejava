import java.util.List;


public class Sudeste implements ImprimirVitimaRegiao{
	
	public void imprimirVitimaRegia(List<Acidente> v){ 
		int totalSudeste = 0;
		if(!v.isEmpty()){
	        for(Object i : v){
		      Acidente acid = (Acidente)i;
		      totalSudeste = totalSudeste + acid.getTotalRegSudeste();
		      
	         }
	        System.out.println("Total de mortos em acidentes de transito na região Sudeste: "+totalSudeste);
	}
	}
}

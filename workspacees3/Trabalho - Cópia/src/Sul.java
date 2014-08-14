import java.util.List;


public class Sul implements ImprimirVitimaRegiao {

	public void imprimirVitimaRegia(List<Acidente> v){
		int totalSul = 0;
		if(!v.isEmpty()){
	        for(Object i : v){
		      Acidente acid = (Acidente)i;
		      totalSul = totalSul + acid.getTotalRegSul();
		        }
	        System.out.println("Total de mortos em acidentes de transito na região Sul: "+totalSul);
	}
}
}

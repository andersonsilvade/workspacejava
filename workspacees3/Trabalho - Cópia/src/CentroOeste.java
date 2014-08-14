import java.util.List;


public class CentroOeste implements ImprimirVitimaRegiao {

	public void imprimirVitimaRegia(List<Acidente> v){
		int totalCentro = 0;
		if(!v.isEmpty()){
	        for(Object i : v){
		      Acidente acid = (Acidente)i;
		      totalCentro = totalCentro + acid.getTotalRegCentroOeste();
		     }
	        System.out.println("Total de mortos em acidentes de transito na região Centro-Oeste: "+totalCentro);
	}
}
}

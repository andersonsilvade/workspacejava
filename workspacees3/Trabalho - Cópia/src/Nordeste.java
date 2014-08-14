import java.util.List;


public class Nordeste implements ImprimirVitimaRegiao{
	
	public void imprimirVitimaRegia(List<Acidente> v){
		 int totalNordeste = 0;
		if(!v.isEmpty()){
	        for(Object i : v){
		      Acidente acid = (Acidente)i;
		      totalNordeste = totalNordeste + acid.getTotalRegNordeste();
	         }
	        System.out.println("Total de mortos em acidentes de transito na região Nordeste: "+totalNordeste);
	}

}
}

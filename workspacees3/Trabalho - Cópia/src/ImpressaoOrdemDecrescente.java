import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class ImpressaoOrdemDecrescente implements ImpressaoVitimaOrdenado {
	
	public void imprimirOrdenado(List<Acidente> vit){
		
			 Collections.sort(vit);
			 
			 int x = 1; 
			 System.out.println("Pos|Tipo        |Quantidade de acidentados");
			 System.out.println("------------------------------------------");
			 for(Object i : vit){
				 Acidente acid = (Acidente) i;
				 if(acid.getTipo().toString().length()<5){
						System.out.println(x+"º |"+acid.getTipo()+ "\t|"+ acid.getMorteTotal());
					}else{
					 System.out.println(x+"º |"+acid.getTipo()+ "\t|"+ acid.getMorteTotal());
					}
				 x++;
			 }
			 System.out.println("");
			 
		 }
	}



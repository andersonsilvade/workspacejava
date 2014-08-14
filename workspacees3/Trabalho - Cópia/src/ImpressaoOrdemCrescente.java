import java.io.Console;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ImpressaoOrdemCrescente implements ImpressaoVitimaOrdenado {
	
	public void imprimirOrdenado(List<Acidente> vit){
		
		  
			 Collections.sort(vit);
			 Collections.reverse(vit);
			
			
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
	


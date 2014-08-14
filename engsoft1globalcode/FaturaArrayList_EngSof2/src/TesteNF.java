
import java.util.ArrayList;
import java.util.List;

public class TesteNF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fat fatura = new Fat(2345,"24/08/2013",0001,new FatDet("Linha Azul",3,25));
		
		List nf =  new ArrayList();
		
		nf.add(fatura);
		
		for(Object i : nf){
			Fat fat = (Fat) i;
			
			fat.print();
			
		}
	
		

		
	}
}

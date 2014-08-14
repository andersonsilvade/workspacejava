import java.util.List;
import java.util.LinkedList;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CadastroDvd dvdCad = new CadastroDvd();
		
		dvdCad.addDvd(new Dvd(55.0,new Espec("Homem de Ferro","Ação","2011")));
		dvdCad.addDvd(new Dvd(64.0,new Espec("Homem de Ferro 2","Ação","2012")));
		dvdCad.addDvd(new Dvd(94.0,new Espec("Homem de Ferro 3","Ação","2013")));
		dvdCad.addDvd(new Dvd(94.0,new Espec("Homem de Ferro 3","Ação","2013")));
	
		
		
		System.out.println("============TESTE 1(FFF)==============");
		List buscar =  dvdCad.buscarDvd(new Espec("tão joven","drama","2013"));
		
		if(!buscar.isEmpty()){
			System.out.println("Foi encontrado : ");
			for(Object i : buscar){
				Dvd dvd = (Dvd)i;
				dvd.imprimir();
			}
			}else{
				System.out.println("Dvd não encontrado!!!");
			
			
		}
		System.out.println("============TESTE 2(VVV)===============");
		List buscar2 =  dvdCad.buscarDvd(new Espec("Homem de Ferro","Ação","2011"));
		
		if(!buscar2.isEmpty()){
			System.out.println("Foi encontrado : ");
			for(Object i : buscar2){
				Dvd dvd = (Dvd)i;
				dvd.imprimir();
			}
			}else{
				System.out.println("Dvd não encontrado!!!");
			
			
		}
		System.out.println("============TESTE 3(VFF)===============");
		List buscar3 =  dvdCad.buscarDvd(new Espec("Homem de Ferro","drama","2013"));
		
		if(!buscar3.isEmpty()){
			System.out.println("Foi encontrado : ");
			for(Object i : buscar3){
				Dvd dvd = (Dvd)i;
				dvd.imprimir();
			}
			}else{
				System.out.println("Dvd não encontrado!!!");
			
			
		}
		System.out.println("============TESTE 4(FVV)===============");
				
		List buscar4 =  dvdCad.buscarDvd(new Espec("Homem de Ferro","Ação","2007"));
		
		if(!buscar4.isEmpty()){
			System.out.println("Foi encontrado : ");
			for(Object i : buscar4){
				Dvd dvd = (Dvd)i;
				dvd.imprimir();
			}
			}else{
				System.out.println("Dvd não encontrado!!!");
			
			
		}
		System.out.println("============TESTE 5(VVF)==============");
		List buscar5 =  dvdCad.buscarDvd(new Espec("tão joven","drama","2013"));
		
		if(!buscar5.isEmpty()){
			System.out.println("Foi encontrado : ");
			for(Object i : buscar5){
				Dvd dvd = (Dvd)i;
				dvd.imprimir();
			}
			}else{
				System.out.println("Dvd não encontrado!!!");
			
			
		}
		System.out.println("=============TESTE 6(FFV)==============");
		List buscar6 =  dvdCad.buscarDvd(new Espec("tão joven","Ação","2013"));
		
		if(!buscar6.isEmpty()){
			System.out.println("Foi encontrado : ");
			for(Object i : buscar6){
				Dvd dvd = (Dvd)i;
				dvd.imprimir();
			}
			}else{
				System.out.println("Dvd não encontrado!!!");
			
			
		}
		System.out.println("===========TESTE 7(VFV)==============");
		List buscar7 =  dvdCad.buscarDvd(new Espec("Homem de Ferro","drama","2013"));
		
		if(!buscar7.isEmpty()){
			System.out.println("Foi encontrado : ");
			for(Object i : buscar7){
				Dvd dvd = (Dvd)i;
				dvd.imprimir();
			}
			}else{
				System.out.println("Dvd não encontrado!!!");
			
			
		}
		System.out.println("=============TESTE 8(FVF)=============");
       List buscar8 =  dvdCad.buscarDvd(new Espec("Tão jovens","Ação","2007"));
		
		if(!buscar8.isEmpty()){
			System.out.println("Foi encontrado : ");
			for(Object i : buscar8){
				Dvd dvd = (Dvd)i;
				dvd.imprimir();
			}
			}else{
				System.out.println("Dvd não encontrado!!!");
			
			
		}
		System.out.println("===========TESTE 9(EQUIVALENCIA)===============");
		
         List buscar9 =  dvdCad.buscarDvd(new Espec("Homem de Ferro 3","Ação","2013"));
		
		if(!buscar9.isEmpty()){
			System.out.println("Foi encontrado "+buscar9.size()+" Dvd's");
			System.out.println();
			for(Object i : buscar9){
				Dvd dvd = (Dvd)i;
				dvd.imprimir();
				System.out.println("#########################");
			}
			}else{
				System.out.println("Dvd não encontrado!!!");
			
			
		}
		
	}
					}
import java.text.DecimalFormat;
import java.util.List;


public class ReinoUnido implements Comparacao {
	
	
	public void compararOutroPais(List<DadosPaises> pai){
		DecimalFormat formato = new DecimalFormat("0.00");
		int total = 0;
		double taxa = 0;
		Paises pa = Paises.BRASIL;
				
		for(Object i: pai){
			DadosPaises dp = (DadosPaises)i;
			if(dp.getPais().equals(pa)){
				total = dp.getTotalMortos();
				taxa = dp.getTaxaObito();
			}
			if(dp.getPais().equals(Paises.REINO_UNIDO)){
				
				System.out.println("O "+dp.getPais()+" no ano de 2011 teve um total de "+dp.getTotalMortos()+ " mil mortos em acidente de trânsito enquanto "
			+ pa+" teve um total de "+total+" mil" );
				System.out.println("Porém a taxa/100mil habitantes da "+dp.getPais()+" foi de "+dp.getTaxaObito());
				System.out.println("Enquanto a do "+pa+" foi de "+taxa+" ou seja "+formato.format((((taxa/dp.getTaxaObito())*100)-100))+
						"% mais mortos, em taxa/100mil habitantes, que o  "+dp.getPais());
				
			}
		}
	}

}

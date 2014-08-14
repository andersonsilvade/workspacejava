import java.text.DecimalFormat;
import java.util.List;


public class Caminhao implements ImpressaoVitima{
	Tipo t = Tipo.CAMINHAO;
	public void imprimirVitima(List v){
		DecimalFormat formatado = new DecimalFormat("0.00");
        if(!v.isEmpty()){
	         for(Object i : v){
		      Acidente acid = (Acidente)i;
		      if(acid.getTipo().equals(t)){
		    	  System.out.println("Dados referente ao ano "+acid.getAno());
					System.out.println("Tipo da vitima "+acid.getTipo());
				    System.out.println("Total de mortes "+acid.getMorteTotal());
					System.out.println("Paticipa��o no total  de acidentes "+formatado.format(acid.getParticipacaoCategoria())+"%");
					System.out.println("Taxa de �bito por 100 mil habitantes "+formatado.format(acid.getTaxaObito()));
					
                }
		      }
      }
}

}

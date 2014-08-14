import java.util.LinkedList;
import java.util.List;


public class BDAcidente {
	
	private List<Acidente>lista;
	private List<DadosPaises>paises;
	private ImpressaoVitima vitima;
	private ImprimirVitimaRegiao regiao;
	private ImpressaoVitimaOrdenado ordenado;
	private Comparacao pais;
	
	
	
	public BDAcidente(){
		lista = new LinkedList<Acidente>();
		paises = new LinkedList<DadosPaises>();
		}
	
   
	public void setVitima(ImpressaoVitima vitima) {
		this.vitima = vitima;
		
	}
	public void setRegiao(ImprimirVitimaRegiao regiao) {
		this.regiao = regiao;
	}
	public void setOrdenado(ImpressaoVitimaOrdenado ordenado) {
		this.ordenado = ordenado;
	}
	public void setComparar(Comparacao compara){
		this.pais = compara;
	}
	
	public void addAcidente(Acidente a){
		lista.add(a);
	
	}
	public void addPaises(DadosPaises dp){
		paises.add(dp);
	}
	
    	
	public void selecionarVitima(){
		
		List<Acidente> l = new LinkedList<Acidente>();
		   for(Object i : lista){
				Acidente acid = (Acidente)i;
				if(acid != null)l.add(acid);
				
			}
			  vitima.imprimirVitima(l);
		}
	public void selecionarRegiao(){
	    List<Acidente> l = new LinkedList<Acidente>();
				for(Object i : lista){
			Acidente acid = (Acidente) i;
			if(acid.getTipo() != Tipo.OUTROS)l.add(acid);
			
		}
		regiao.imprimirVitimaRegia(l);
	}
	
	public void selecionarOrdem(){
		List<Acidente> l = new LinkedList<Acidente>();
		
		for(Object i:lista){
			Acidente acid = (Acidente) i;
			if(ordenado != null)l.add(acid);
		}
		ordenado.imprimirOrdenado(l);
	}
	
	public void selecionarPais(){
		List<DadosPaises> p = new LinkedList<DadosPaises>();
		
		for(Object i : paises){
			DadosPaises dp = (DadosPaises) i;
			if(!paises.isEmpty()) p.add(dp);
			}
		pais.compararOutroPais(p);
		
		
	}
	
	
	}



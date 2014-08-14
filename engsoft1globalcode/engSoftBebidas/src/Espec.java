
public class Espec {

	private String teorAlcoolico;
	private String volume;
	private String recipiente;
	private String fabricante;
	private String origem;
	private String caloria;

	public Espec(String ta,String vl,String re,String fb,String or,String ca){
		teorAlcoolico = ta;
		volume = vl;
		recipiente = re;
		fabricante = fb;
		origem = or;
		caloria = ca;
	}

	public String getTeorAlcoolico(){
		return teorAlcoolico;
	}
	public void setTeorAlcoolico(String novoTeorAlcoolico){
		teorAlcoolico = novoTeorAlcoolico;
	}
	public String getVolume(){
		return volume;
	}
	public void setVolume(String novoVolume){
		volume = novoVolume;
	}
	public String getRecipiente(){
		return recipiente;
	}
    public void setRecipiente(String novoRecipiente){
    	recipiente = novoRecipiente;
    }
    public String getFabricante(){
    	return fabricante;
    }
    public void setFabricante(String novoFabricante){
    	fabricante = novoFabricante;
    }
    public String getOrigem(){
    	return origem;
    }
   public void setOrigem(String novaOrigem){
	   origem = novaOrigem;
   }
   public String getCaloria(){
	   return caloria;
   }
   public void setCaloria(String novaCaloria){
	   caloria = novaCaloria;
   }
}


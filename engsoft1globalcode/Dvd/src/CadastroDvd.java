import java.util.List;
import java.util.LinkedList;

public class CadastroDvd {
	
	private List <Dvd> dvd;
	
	
	public CadastroDvd(){
		  dvd = new LinkedList<Dvd>();
	}
    public void addDvd(Dvd d){
    	dvd.add(d);
    }
    public List <Dvd> buscarDvd(Espec especCliente){
    	List <Dvd> encontrado = new LinkedList();
    	for(Object i : dvd){
    		Dvd dvdEncontrado = (Dvd) i;
    		if(dvdEncontrado.getEsp().compararDvd(especCliente)==true) encontrado.add(dvdEncontrado);
    		
    	}
    	return encontrado;
    	
    	
    }
    public List<Dvd> listarDvd(){
    	List<Dvd> lista = new LinkedList();
    	for(Object i : dvd){
    		Dvd dvdCadastrado = (Dvd)i;
    		lista.add(dvdCadastrado);   		
    		   	}
    	return lista;
    }
}
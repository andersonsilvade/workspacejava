import java.util.LinkedList;
import java.util.List;


public class Cadastro {
	
	private List<Usuario>lista ;
	
	public Cadastro(){
	lista = new LinkedList<Usuario>();
	}
	
	
	
	public void addUsuario(Usuario usr){
		lista.add(usr);
	}
	
	
	public Usuario logar(Usuario usr){
		      
		for(Object i : lista){
				Usuario usrLoc = (Usuario) i;
				if(usrLoc.matches(usr))return usrLoc;
				}
		return null;
		
	
		
	}
	
		

}

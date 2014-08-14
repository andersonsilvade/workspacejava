import java.util.LinkedList;
import java.util.List;

public class Facebook {
	
	private List<Usuario> usuario;
	public Facebook(){
		usuario = new LinkedList();
	}
	public void addUsuario(Usuario user){
		usuario.add(user);
	}
	
	public boolean logar(DadosLogin locUsuario){		 
		
		 for(Object i :usuario){
			 Usuario usuariolocalizado = (Usuario)i;
			 if(usuariolocalizado.getLog().matches(locUsuario)) return true;
		 }
		 
		 return false;
				 }

}


public class DadosLogin {

	private String userName;
	private String senha;
	
	public DadosLogin(String un, String s){
		userName = un;
		senha = s;
	}
	
	public boolean matches(DadosLogin usuario){
		if(!userName.equals(usuario.userName)) return false;
		if(!senha.equals(usuario.senha)) return false;
		return true;
	}
}

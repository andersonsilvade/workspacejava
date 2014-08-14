
public class Facade {
	
	private Cadastro cad;

	public Facade(){
	  cad = new Cadastro();
	}
	
	
	public void iniciarlizarCadastro(){
		
		 Usuario usr = new Usuario("Anderson","asa");
		 cad.addUsuario(usr);
		 Usuario usr1 = new Usuario("Maria", "marilu");
		 cad.addUsuario(usr1);
		 Usuario usr2 = new Usuario("Mauro","shin");
		 cad.addUsuario(usr2);
	}
	
	public void testarLogin(Usuario usr){
		  Usuario user = cad.logar(usr);
		  if(user != null){
			  System.out.println("usuario logado");
			  
		  }else{
			  System.out.println("Usuario não encontrado");
		  }
	}

}


public class TesteCadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Facade f = new Facade();
		f.iniciarlizarCadastro();
		
		
		f.testarLogin(new Usuario("Anderson","asa"));
	}

}

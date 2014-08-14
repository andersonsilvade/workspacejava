
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Usuario user = new Usuario();
		user.setMenu(new MenuAluno());
		user.impressao();
		System.out.println("------------------");
        user.setMenu(new MenuAdm());
        user.impressao();
        System.out.println("------------------");
        user.setMenu(new MenuProf());
        user.impressao();
        System.out.println("------------------");
        
	}

}

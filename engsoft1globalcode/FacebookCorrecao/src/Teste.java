
public class Teste {

	public static void main(String[] args) {
		
		Facebook fb = new Facebook();
		
		fb.addUser(new User(new DadosLogin("giulianobertoti", "12345"), "Giuliano", 
				"Bertoti", "SJC"));
		fb.addUser(new User(new DadosLogin("joaobertoti", "senha"), "Joao", 
				"Bertoti", "SJC"));
		
		//Teste Classes de Equivalencia
		
		// Caso de Teste1 - nome e senha errados - Usuario ou senha nao existem
		System.out.println("Caso de Teste1 - nome e senha errados - Usuario ou senha nao existem");
		boolean logado = fb.login(new DadosLogin("maria", "678"));
		
		if(logado){
			System.out.println("Usuario Logado");
		} else {
			System.out.println("Usuario ou senha nao existem");
		}
		
		// Caso de Teste 2 - nome existe e senha nao - Usuario ou senha nao existem
		System.out.println("Caso de Teste 2 - nome existe e senha nao - Usuario ou senha nao existem");
		boolean logado2 = fb.login(new DadosLogin("giulianobertoti", "bnh"));
		
		if(logado2){
			System.out.println("Usuario Logado");
		} else {
			System.out.println("Usuario ou senha nao existem");
		}
		
		// Caso de Teste 3 - nome nao existe e a senha existe - Usuario ou senha nao existem
		System.out.println("Caso de Teste 3 - nome nao existe e a senha existe - Usuario ou senha nao existem");
		boolean logado3 = fb.login(new DadosLogin("joaquim", "12345"));
		
		if(logado3){
			System.out.println("Usuario Logado");
		} else {
			System.out.println("Usuario ou senha nao existem");
		}
		
		// Caso de Teste 4 - nome e senha corretos - Usuario Logado
		System.out.println("Caso de Teste 4 - nome e senha corretos - Usuario Logado");
        boolean logado4 = fb.login(new DadosLogin("joaobertoti", "senha"));
		
		if(logado4){
			System.out.println("Usuario Logado");
		} else {
			System.out.println("Usuario ou senha nao existem");
		}
		
	}
}

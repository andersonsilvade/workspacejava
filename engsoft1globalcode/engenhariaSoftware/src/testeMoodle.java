
public class testeMoodle {


	public static void main(String[] args) {

		moodleUsuario joao = new moodleUsuario();
		moodleUsuario pedro = new moodleUsuario();

		joao.setNomeUsuario("Joaobertoti");
		joao.setPais(Pais.Bolivia);
		joao.setNome("Joao");
		joao.setSobreNome("Bertoti");
		joao.setCidade("Caçapava");
		joao.setEmail("anderson@gmail.com");
		joao.setSenha("*******");

		joao.printUsuario();
		
		pedro.setNomeUsuario("Pedrorosa");
		pedro.setPais(Pais.Chile);
		pedro.setNome("Pedro");
		pedro.setSobreNome("Rosa");
		pedro.setCidade("Caçapava");
		pedro.setEmail("pedro@gmail.com");
		pedro.setSenha("*******");
		
		pedro.printUsuario();
		
	}

                          }

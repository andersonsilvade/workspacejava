
public class testeMoodle {


	public static void main(String[] args) {

		moodleUsuario joao = new moodleUsuario();
		moodleUsuario pedro = new moodleUsuario();

		joao.setNomeUsuario("Joaobertoti");
		joao.setPais(Pais.Bolivia);
		joao.setNome("Joao");
		joao.setSobreNome("Bertoti");
		joao.setCidade("Ca�apava");
		joao.setEmail("anderson@gmail.com");
		joao.setSenha("*******");

		joao.printUsuario();
		
		pedro.setNomeUsuario("Pedrorosa");
		pedro.setPais(Pais.Chile);
		pedro.setNome("Pedro");
		pedro.setSobreNome("Rosa");
		pedro.setCidade("Ca�apava");
		pedro.setEmail("pedro@gmail.com");
		pedro.setSenha("*******");
		
		pedro.printUsuario();
		
	}

                          }

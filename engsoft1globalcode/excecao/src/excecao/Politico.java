package excecao;
import java.io.IOException;


public class Politico {
        public boolean corrupto ;
	
        public void usarDinheiroPublico() throws Manifestacao{
		System.out.println("usando dinheiro publico");
		if(corrupto)
				throw new Manifestacao("N�o � por 20 centavos");
		}
	
		
	}


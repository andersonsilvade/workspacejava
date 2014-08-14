
public class TestePorta {

	
	public static void main(String[] args) {
		
      Porta porta = new Porta();
      Controle controle = new Controle(porta);
      Reconhecedor rec = new Reconhecedor(porta,"x");
	
     controle.pressButton();
     controle.pressButton();
     rec.reconhecer("z");
     
	} 
     

}

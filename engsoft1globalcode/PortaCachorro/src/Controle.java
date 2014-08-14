
public class Controle {
	
	private Porta porta;
	
	public Controle(Porta p){
		porta = p;
	}
	
	public void pressButton(){
		
		if(porta.isOpen()){
			porta.close();
		}else{
			porta.open();
		}
	}

}

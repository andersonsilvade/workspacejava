
public class Porta {
	
	private boolean status;
	
	public Porta(){
		status = false;
	}
	
	public boolean isOpen(){
		
		return status;
	}
	public void open(){
		status = true;
		System.out.println("porta aberta");
	}
	public void close(){
		status = false;
		System.out.println("porta fechada");
	}

}


public class Reconhecedor {
	
	private Porta reconhece;
	String lat;
	
	public Reconhecedor(Porta reconhece, String lat) {
		this.reconhece = reconhece;
		this.lat = lat;
	}
	
	public void reconhecer(String lat2){
		if(lat.equals(lat2)){
			reconhece.isOpen();
			System.out.println("Porta aberta!!!");
		}
	}
	

	

}

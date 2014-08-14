
public class Usuario {
	
	private Menu menu;

/*	public Usuario(Menu menu) {
	
		this.menu = menu;
	}*/

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	public void impressao(){
	        menu.imprimir();
	}
	

}

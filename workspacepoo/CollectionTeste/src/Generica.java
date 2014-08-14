import java.util.ArrayList;


public class Generica<T> {
	
	public Object texto(){
		ArrayList<T> array = new ArrayList<T>();
		return "Anderson";
	}
	

	public static void main(String[] args) {

	Generica gen = new Generica();
	 
	String texto = gen.texto().toString();
	
	
	}

}

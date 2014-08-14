
import java.util.ArrayList;
import java.util.Collection;
public class TesteColecao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Collection colecao = new ArrayList();
      colecao.add("Anderson");
      colecao.add("Alice");
      
      
      for(Object obj:colecao){
    	  System.out.println(obj);
      }
      
	}

}

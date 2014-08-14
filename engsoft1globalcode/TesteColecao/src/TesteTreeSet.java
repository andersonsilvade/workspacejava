import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;


public class TesteTreeSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet colecao = new TreeSet();
	      colecao.add("Anderson");
	      colecao.add("Alice");
	      
	      
	      for(Object obj:colecao){
	    	  System.out.println(obj);
	      }
	      HashSet colecao1 = new HashSet();
	      colecao1.add("Anderson Silva");
	      colecao1.add("Anderson Barros");
	      
	      
	      for(Object obj:colecao1){
	    	  System.out.println(obj);
	      }
	      
		}


	}



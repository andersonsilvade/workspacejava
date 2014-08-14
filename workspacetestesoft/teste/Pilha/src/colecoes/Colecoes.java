package colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Colecoes {
	//Lists
	private ArrayList list = new ArrayList();
	private LinkedList list02 = new LinkedList();
	//Sets - não repete elementos
	private Set<String> list03 = new HashSet<String>();
	private Set<String> list04 = new LinkedHashSet<String>();
	//Map
	private Map<Integer, String> map01 = new HashMap<Integer, String>();
	
	
	//ou:
//	private List list = new ArrayList();
//	private List list02 = new LinkedList();
	
	public void useSet(){
		list03.add("Teste 1");
		list03.add("Teste 1");
		//nao aceita que coloque algo em determinada posicao		
		//list03.add(1, "Teste 1");
	}
	
	public void useMap(){
		map01.put(1, "Teste 1");
		map01.put(2, "t2");
		for (Integer key: map01.keySet()){
			String value = map01.get(key);
			System.out.println("\nKey: "+key+"\nValue"+ value);
		}
	}
	
	public static void main(){
		
	}
}

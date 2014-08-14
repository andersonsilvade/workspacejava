

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Colecoes {
	
	/*private ArrayList list = new ArrayList();
	private LinkedList list2 = new LinkedList();
	*/
	private List<String> list3 = new ArrayList<String>();
	private Set<String>  list4 = new HashSet<String>();
	private Set<String>  list5 = new LinkedHashSet<String>();
	private Map<Integer,String>map1 = new HashMap<Integer,String>();
	
	
       
	
	
	public void useList(){
		
		list3.add("teste 1");
		list3.add("teste 1");
		list3.add("teste 2");
		list3.add(1,"Teste 3");
		
		
		
		
		for(String teste : list3){
			System.out.println(teste);
		}
		System.out.println("#####################");
	}
		public void useSet(){
			list4.add("teste 1");
			list4.add("teste 1");
			list4.add("teste 2");
			list4.add("Teste 3");
			
			for(String teste : list4){
				System.out.println(teste);
			}
			System.out.println("#####################");
		}
		public void useLinkedSet(){
			list5.add("teste 1");
			list5.add("teste 1");
			list5.add("teste 2");
			list5.add("Teste 3");
			
			for(String teste : list5){
				System.out.println(teste);
			}
			System.out.println("#####################");
		}
		public void useMap(){
			map1.put(1,"Teste 1");
			map1.put(2,"teste 1");
			map1.put(3,"teste 2");
			map1.put(4,"Teste 3");
			map1.put(4,"xxxxxx");
			
			for(Integer key : map1.keySet()){
				String value = map1.get(key);
				System.out.println("chave "+key+" valor "+value);
			}
			System.out.println("#####################");
		}
		
		
	
	
	public static void main(String [] args) {
		
		Colecoes a = new Colecoes();
		System.out.println("List");
		a.useList();
		System.out.println("Set");
		a.useSet();
		System.out.println("LinkeSet");
		a.useLinkedSet();
		System.out.println("Map");
		a.useMap();
		/*try {
			
			e.push("A");
			
			
			
		} catch (StackFullException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e.pop();
		e.imprimePilha();*/
	}
	
	
	

}

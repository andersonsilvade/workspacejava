import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class CollectionHash {

	public static void main(String[] args) {
		//hashMap
		Map<String,String> map = new HashMap<String,String>();
		map.put("a", "Primitivos");
		map.put("b","valores");
		System.out.println(map.get("a").hashCode());
		
		//hashTable
		Map<String,String> mapTable = new Hashtable<String,String>();
		mapTable.put("c", "Primitivos");
		mapTable.put("d","valores");
		for(int i = 0 ; i < mapTable.size();i++){
			System.out.println("hashmap");
			System.out.println(mapTable.get(i).indexOf(i));
		System.out.println(mapTable.get("c").hashCode());
		}
		
		//hasSet
		Set<String>ordenado = new HashSet<String>();
		ordenado.add("Anderson Silva");
		ordenado.add("a");
		ordenado.add("f");
        
		
		for(String i : ordenado){
			System.out.println(i);
		}
		
		Set<String>ordenado2 = new TreeSet<String>();
		ordenado2.add("d");
		ordenado2.add("a");
		ordenado2.add("f");
		for(String i : ordenado2){
			System.out.println(i);
		}
		

	}

}

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
public class TesteMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Long, Pessoa> mapa = new HashMap<Long, Pessoa>();
		Pessoa p1 = new Pessoa("Pedro",1);
		Pessoa p2 = new Pessoa("Anderson",2);
		Pessoa p3 = new Pessoa("Carol",3);
		Pessoa p4 = new Pessoa("Alice",4);
		
		mapa.put(p1.getCpf(),p1);
		mapa.put(p2.getCpf(),p2);
		mapa.put(p3.getCpf(),p3);
		mapa.put(p4.getCpf(),p4);
		
		Set<Long> chaves = mapa.keySet();
		
		for(Object valorObj : chaves){
			long cpf = (long)valorObj;
			System.out.println("CPF: "+cpf);
			Pessoa pessoa = (Pessoa)mapa.get(cpf);
			System.out.println(pessoa);
		}
	}

}

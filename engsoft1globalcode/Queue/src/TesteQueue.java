import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
public class TesteQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Queue colecao = new PriorityQueue();
     Pessoa p1 = new Pessoa("Anderson",1);
     Pessoa p2 = new Pessoa("Alice",2);
     Pessoa p3 = new Pessoa("Carol",3);
     
     colecao.add(p1);
     colecao.add(p2);
     colecao.add(p3);
     
     
     System.out.println(colecao.remove());
     
     
     
	}

}

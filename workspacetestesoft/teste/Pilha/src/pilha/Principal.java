package pilha;
import java.util.Scanner;

public class Principal {

	public static void main(String args[]) throws StackFullException, StackEmptyException{
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Aline sua burra....digite um numero...");
		int size = leitor.nextInt();
		leitor.close();
		
		Stack pilha = new Stack(size);		
		
		pilha.push("Ana");
		pilha.push("Aline");
		pilha.push("Pedro");
				
		System.out.println("Tamanho: "+pilha.size());
		System.out.println("Topo: "+pilha.top());
		
		pilha.pop();

		System.out.println("Tamanho: "+pilha.size());
		System.out.println("Topo: "+pilha.top());
	}
}

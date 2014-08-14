package pilha;
import java.util.ArrayList;


public class Stack {
	private int size;
	private int top = 0;
	private ArrayList<String> stack = new ArrayList<String>();
	
	public Stack(int size){
		this.size=size;
	}
	
	public void push(String a) throws StackFullException{
		if (top == size){
			throw new StackFullException();
		}else{
			stack.add(a);
			top+=1;
		}
	}
	
	public String pop()throws StackEmptyException{
		if (top <= 0){
			throw new StackEmptyException();
		}else{
			String removido = stack.get(top-1);
			stack.remove(--top);
			return removido;	
		}
	}
	
	public boolean isEmpty(){
		if (top == 0) return true;
		return false;
	}
	
	public String top(){
		if (top <= 0){
			return null;
		}else return stack.get(top-1);
	}
	
	public int size(){
		return top;
	}
	
}

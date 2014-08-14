package Pilha;

import java.util.ArrayList;
import java.util.List;


public class Stack {
	
	private List<String> pilha; 
	private int topo = 0;
    private int tamanho;
	
	public Stack(int tamanho) {
		pilha = new ArrayList<String>();
		this.tamanho = tamanho;
	}
	public  void  push(String a)throws StackFullException{
		if(topo < tamanho){
			pilha.add(a);
			topo++;
			
		}else{
			throw new StackFullException();
			}
		
	}
	public String pop()throws StackEmptyException{
		if(topo > 0){
			String tPilha  = pilha.get(topo - 1);
			pilha.remove(--topo);
			return tPilha;
		}else{
			throw new StackEmptyException();
		}
	}
	
	public  boolean top(){
		if(topo == 0)return false;
		return true;
		
	}
	public boolean isEmpty(){
		return pilha.isEmpty();
	}
	public int size(){
		return pilha.size();
	}
	
	
}
 
	
	


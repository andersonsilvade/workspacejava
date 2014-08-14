package br.com.exer7;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Trabalhador trab = new Trabalhador("Anderson", 50, 10);
		Trabalhador trab2 = new Trabalhador("Carol", 100, 10);
		Trabalhador trab3 = new Trabalhador("Alice",40, 10);
		trab.calcularSalario();
		trab2.calcularSalario();
		trab3.calcularSalario();
		System.out.println(trab.getNome()+" receberá: "+trab.getSalario());
		System.out.println(trab2.getNome()+" receberá: "+trab2.getSalario());
		System.out.println(trab3.getNome()+" receberá: "+trab3.getSalario());
		
		
	}

}

package br.com.fatec;

public class Inicio {
	public static void main(String[] args) {
		Paralela p1 = new Paralela("p1");
		Paralela p2 = new Paralela("p2");
		p1.start();
		p2.start();
	}
}

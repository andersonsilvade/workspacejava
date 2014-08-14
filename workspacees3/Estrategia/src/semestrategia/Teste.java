package semestrategia;

public class Teste {

	public static void main(String[] args) {
		
		ClienteEspecial cE = new ClienteEspecial(12000.00);
		ClienteComum cC = new ClienteComum(100.00);
		Aposentado aP = new Aposentado(200.00);
		Estudante eT = new Estudante(50.00);
		
		
		
System.out.println("Cliente especial:::");		
		cE.imprimirCheque();
		cE.sacarEspecial(200.00);
		
		cC.sacarComum(40.00);
		
		
		
		
System.out.println("Cliente aposentado");		
		aP.imprimirCheque();
		aP.sacarComum(60.00);
		
		
		eT.sacarEspecial(12.00);
		
	}
}

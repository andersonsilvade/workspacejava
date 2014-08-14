package comestrategia;

public class Teste {
	
	public static void main(String[] args) {
		
		Usuario giuliano = new Usuario();
		giuliano.saldo = 3000.0;
		
		
		System.out.println("good times");
		giuliano.setS(new SaqueEspecial());
		giuliano.setImpressao(new ChequePermitido());
		giuliano.setE(new Papel());
		giuliano.setLis(new LimteEspecial());
		
		giuliano.emitirExtrato();
		giuliano.realizarSaque(2000.0);
		giuliano.emitirCheque();
		System.out.println("Limite: "+giuliano.getLis());
		System.out.println("Classe teste "+giuliano.saldo);
		
		
		System.out.println("###################################");
		
		System.out.println("bad times");
		giuliano.setS(new SaqueComum());
		giuliano.setImpressao(new ChequeProibido());
		giuliano.setE(new Celular());
		giuliano.setLis(new LimiteComum());
		giuliano.emitirExtrato();
		giuliano.realizarSaque(20.0);
		giuliano.emitirCheque();
		System.out.println("Classe teste "+giuliano.saldo);
		System.out.println("Limite "+ giuliano.getLis());
		
		System.out.println("###################################");
		
		System.out.println("hard times");
		giuliano.setS(new SaqueEspecial());
		giuliano.setImpressao(new ChequeProibido());
		giuliano.setE(new Tela());
		giuliano.emitirExtrato();
		giuliano.realizarSaque(60.0);
		giuliano.emitirCheque();
		System.out.println("Classe teste "+giuliano.saldo);
		System.out.println("##############################");
		System.out.println("old times");
		giuliano.setS(new SaqueComum());
		giuliano.setImpressao(new ChequePermitido());
		giuliano.realizarSaque(300.0);
		giuliano.emitirCheque();
		System.out.println("Classe teste "+giuliano.saldo);
		
	}

}

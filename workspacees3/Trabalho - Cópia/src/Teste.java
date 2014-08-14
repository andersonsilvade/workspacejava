
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Facade facade = new Facade();
		facade.inicializar();
		facade.inicializarPais();
		
		System.err.println("IMPRIMINDO ORDENADO ");
		//facade.ordenar(new ImpressaoOrdemCrescente());
		System.out.println("");
		facade.ordenar(new ImpressaoOrdemDecrescente());
		System.out.println("");
		System.err.println("IMPRIMINDO POR VITIMA DE ACIDENTE ");
		facade.imprimirVitima(new Pedestre());
		System.out.println("");
		System.err.println("IMPRIMINDO TOTAL DE ACIDENTE POR REGIÃO ");
		facade.imprimirRegiao(new Nordeste());
		System.out.println("");
		System.err.println("IMPRIMINDO COMPARANDO COM OUTROS PAISES ");
		facade.compararPais(new China());
		
		
		
		
	}

}

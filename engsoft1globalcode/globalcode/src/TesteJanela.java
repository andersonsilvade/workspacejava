
public class TesteJanela {

	
	public static void main(String[] args) {
		Janela window = new Janela();
		window.altura = 200;
		window.largura = 300;
		
		Janela window2 = new Janela();
		window2.altura = 100;
		window2.largura = 50;
	
		
		System.out.println(window.calculaArea());
		System.out.println(window2.calculaArea());

	}

}

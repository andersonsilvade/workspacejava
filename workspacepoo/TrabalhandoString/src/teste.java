
public class teste {

	public static void main(String[] args) {
		// trab 1
		
		String a ="";
		for(int i = 0; i < 100; i++){
			a+="String";
		}
		System.out.println(a);
		//trab 2
		String str = "teste";
		str.concat("valor");
		String b = str.concat(" valor2");
		String c = b.toUpperCase();
		str.toUpperCase();
		System.out.println(str);
		System.out.println(b);
		System.out.println(c);
		
		//trab 3 verificando tempo
		int vezes = 100000;
		long tempo = System.currentTimeMillis();
		concatenar(vezes);
		System.out.println(System.currentTimeMillis() - tempo);
		
		tempo = System.currentTimeMillis();
		concatenarsb(vezes);
		System.out.println(System.currentTimeMillis() - tempo);
		
		tempo = System.currentTimeMillis();
		concatenarsbu(vezes);
		System.out.println(System.currentTimeMillis() - tempo);
		
		
	}
	public static void concatenar(int vezes){
		String a = "";
		for(int i = 0; i < vezes; i++){
			a+="String";
		}
		
	}
	public static void concatenarsb(int vezes){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < vezes; i++){
			sb.append("String");
		}
		
	}
   public static void concatenarsbu(int vezes){
	   StringBuffer sb = new StringBuffer();
		for(int i = 0; i < vezes; i++){
			sb.append("String");
		}
	   
   }
}

import java.util.Scanner;


public class UpperCase {

	public static void main(String[] args) {
		while(true){
		Scanner entrada = new Scanner(System.in);
		String frase;
		System.out.println("Digite a palavra: ");
		frase = entrada.nextLine();
		System.out.println(frase.toUpperCase());
		}

	}

}

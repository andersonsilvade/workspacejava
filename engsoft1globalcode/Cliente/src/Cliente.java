import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Cliente {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket cliente = new Socket("127.0.0.1", 6213);
		System.out.println("O cliente se conectou ao servidor!");

		Scanner teclado = new Scanner(System.in);
		PrintWriter saida = new PrintWriter(cliente.getOutputStream(), true);
		BufferedReader i = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
		String msg = "";
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		while (!msg.equals("fim")) {
			msg = leitor.readLine();
			saida.println(msg);
			System.out.println(i.readLine());
		}

		saida.close();
		teclado.close();
		cliente.close();
	}
	
}
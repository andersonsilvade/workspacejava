import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Servidor {
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12343);
		System.out.println("Porta 12345 aberta!");

		Socket cliente = servidor.accept();
		System.out.println("Nova conexão com o cliente " +
			cliente.getInetAddress().getHostAddress());

		Scanner s = new Scanner(cliente.getInputStream());
		BufferedReader i = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
		PrintWriter saida = new PrintWriter(cliente.getOutputStream(), true);
		String aloalo = "";
		while (!aloalo.equals("fim")) {
			aloalo = s.nextLine();
			System.out.println(aloalo);
			saida.println("Echo: " + aloalo); }

		s.close();
		servidor.close();
		cliente.close();
	}
}
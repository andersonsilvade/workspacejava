
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Cliente {
	
	private Socket socketCliente;
	
	public Cliente() throws Exception{
		System.out.println("Fazendo conexão");
		socketCliente = new Socket("192.168.43.9",1234);
	}
	
	public void conectarEnviar() throws IOException{
    
 	    Scanner entrada = new Scanner(System.in);	
	    String texto; 
	    
		PrintWriter escritor = new PrintWriter(socketCliente.getOutputStream());
		System.out.println("Enviando ....");
		System.out.println("digite o texto");
		texto = entrada.next();
		escritor.write(texto);
		escritor.close();
	}
	}



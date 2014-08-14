import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class DateServer {

	
	public static void main(String[] args) {
	
		try{
			ServerSocket sock = new ServerSocket(6213);
			System.out.println("Porta aberta");
		while(true){
			Socket cliente = sock.accept();
			PrintWriter pount = new PrintWriter(cliente.getOutputStream(),true);
			pount.println(new java.util.Date().toString());
			cliente.close();
		}
	}
		catch(IOException e){
			System.err.println(e);
		}
	}
}

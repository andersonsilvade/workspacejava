import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageInputStream;


public class TesteIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream flo = new FileOutputStream("C:/Users/Public/teste2");
			ObjectOutputStream din = new ObjectOutputStream(flo);
			Pessoa p = new Pessoa();
	        p.setNome("Anderson");
	        p.setTelefone("3653-5012");
			
			din.writeObject(p);
			
			din.close();
			flo.close();
			System.out.println("lido");
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}

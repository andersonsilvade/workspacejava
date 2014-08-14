import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TestePessoa {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		

		Pessoa eu = new Pessoa();
		eu.setNome("Anderson");
		Agenda agenda = new Agenda();
		agenda.getPessoas().add(eu);
		
		//procedimento de escrita em disco
		/*FileOutputStream escritaDisco = new FileOutputStream("agenda.ser");
		ObjectOutputStream escritaObjeto = new ObjectOutputStream(escritaDisco);
		escritaObjeto.writeObject(agenda);
		escritaObjeto.close();*/
		//procedimento leitura
		FileInputStream ler = new FileInputStream("agenda.ser");
		ObjectInputStream lerDisco = new ObjectInputStream(ler);
		eu = (Pessoa)lerDisco.readObject();
		lerDisco.close();
		System.out.println("Nome: "+eu.getNome());
	}

}

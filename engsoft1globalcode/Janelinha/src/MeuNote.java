import javax.swing.JFrame;
import javax.swing.JTextArea;
public class MeuNote extends JFrame{
	/*componentes devem estar no contexto da instancia,para que possam ser acessados em todos 
	 os metodos não-estaticos da classe
	 */
	private JTextArea texto = new JTextArea();
	
	public MeuNote(){
		super("Teste janela");
		this.montaJanela();
	}
private void montaJanela(){
	this.getContentPane().add(texto);
}
public static void main(String []args){
	MeuNote janela = new MeuNote();
	janela.setSize(640, 480);
	janela.setVisible(true);
}
}

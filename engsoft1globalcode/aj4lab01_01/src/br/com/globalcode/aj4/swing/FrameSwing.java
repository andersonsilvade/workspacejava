/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.globalcode.aj4.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class FrameSwing extends JFrame {

	public FrameSwing(String title) {
		// Indicacao do titulo da janela
		super(title);

		// Utilizamos a constante declarada na classe JFrame para definir
		// o comportamento padrao no fechamento da janela
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Configuracao do tamanho da janela
		this.setSize(600, 400);
		// Tornando a janela visivel
		
		
		JLabel label = new JLabel("Hello World");
		add(label);
		
		JMenuBar barra = new JMenuBar();//a barra
		JMenu arquivo = new JMenu("Arquivo");//criando o menu da barra
		barra.add(arquivo);
		JMenu dados = new JMenu("Dados");
		barra.add(dados);
		JMenu edit = new JMenu("Editar");
		arquivo.add(edit);
		JMenuItem sair = new JMenuItem("sair");//dentro do menu colocanco um outro menu
		arquivo.add(sair);
		JMenuItem loc = new JMenuItem("Localizar");
		edit.add(loc);
		setJMenuBar(barra);
		
		this.setVisible(true);
		
	}

	// O metodo main cria uma instancia do FrameAWT que faz com que a janela
	// seja exibida.
	public static void main(String args[]) {
		FrameSwing t = new FrameSwing("Janela Swing");
		
	}
}

package br.com.globalcode.aj4.swing;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTexto extends JFrame{
	public JTexto(){
		super("Texto");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JTextField texto = new JTextField();
		add(texto);
		setSize(200, 70);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTexto t = new JTexto();

	}

}

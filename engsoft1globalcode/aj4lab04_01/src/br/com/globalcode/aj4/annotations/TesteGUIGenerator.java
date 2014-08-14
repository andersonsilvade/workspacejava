/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.globalcode.aj4.annotations;

import java.awt.Dimension;
import javax.swing.JFrame;


public class TesteGUIGenerator {

	public static void main(String[] args) {
		JFrame frame = new JFrame("GUI Generator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GUIGenerator generator = new GUIGenerator();
		/*Cliente cliente1 = new Cliente();
		generator.bind(cliente1);
		frame.add(generator);*/
		
		ClienteEspecial cliente = new ClienteEspecial();
		generator.bind(cliente);
		frame.add(generator);
		
		frame.setPreferredSize(new Dimension(300, 300));
		frame.pack();
		frame.setVisible(true);
	}
}

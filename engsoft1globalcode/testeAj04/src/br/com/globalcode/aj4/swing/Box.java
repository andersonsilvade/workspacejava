package br.com.globalcode.aj4.swing;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Box extends JFrame {
	public Box(){
	super("teste box");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JComboBox seletorBanco = new JComboBox();
	seletorBanco.addItem("Itau");
	seletorBanco.addItem("Bradesco");
	seletorBanco.addItem("HSBC");
	seletorBanco.setBackground(Color.CYAN);
	add(seletorBanco);
	setSize(275, 100);
	setVisible(true);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Box b = new Box();
	}

}

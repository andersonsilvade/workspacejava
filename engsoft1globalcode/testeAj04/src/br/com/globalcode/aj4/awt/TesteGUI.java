package br.com.globalcode.aj4.awt;

import java.awt.Button;
import java.awt.Frame;

public class TesteGUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame  = new Frame("hello word");
		frame.setSize(200, 200);
		Button btn = new Button("OK");
		frame.add(btn);
		frame.setVisible(true);
		
	}

}

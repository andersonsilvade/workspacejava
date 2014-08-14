package br.com.globalcode.aj4.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameComLabel extends JFrame {
	
	public FrameComLabel(){
		super("Janela");
		setSize(275,100);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Ola");
		add(label);
		
		setVisible(true);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameComLabel fcl = new FrameComLabel();

	}

}

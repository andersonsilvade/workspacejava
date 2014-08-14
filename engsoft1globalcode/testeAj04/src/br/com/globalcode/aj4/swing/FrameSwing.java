package br.com.globalcode.aj4.swing;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class FrameSwing extends JFrame{
	public FrameSwing (){
		super("Janela Swing");
		setSize(275,100);
		setVisible(true);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
       FrameSwing jan = new FrameSwing(); 
       jan.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
	}

}

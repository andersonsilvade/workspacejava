package br.com.globalcode.aj4.awt;

import java.awt.Frame;
import java.awt.Label;

public class ExemploFrame extends Frame {
	public ExemploFrame(String titulo){
		setTitle(titulo);
		
		setSize(200,100);
		
		setVisible(true);
		
		
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExemploFrame janela = new ExemploFrame("TITULO");
		
		

	}

}

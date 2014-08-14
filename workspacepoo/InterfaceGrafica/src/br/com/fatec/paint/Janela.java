package br.com.fatec.paint;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class Janela extends JFrame {
	 public Janela(){
		 Rabisco rab = new Rabisco(Color.BLUE);
		 rab.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		 getContentPane().add(rab);
		 getContentPane().setLayout(new GridLayout(1,1));
		 pack();
		 setVisible(true);
		 setSize(600,300);
		 setDefaultCloseOperation(3);
	 }
	
	

	public static void main(String[] args) {
		
		new Janela();
		
	}

}

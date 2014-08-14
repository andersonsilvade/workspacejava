package br.com.fatec.exer1;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Janela extends JFrame{
	
	public static void main(String[] args){
		
	JPanel painel = new Painel();
	JFrame janelaLinha = new JFrame("DESENHANDO QUADRADOS");
   
	janelaLinha.getContentPane().add(painel);
	
	janelaLinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janelaLinha.setSize(300,300);
	janelaLinha.setVisible(true);
	
	}
}

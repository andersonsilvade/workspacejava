package br.com.fatec.janela;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel{
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int largura = getWidth();
		int altura = getHeight();
		g.drawLine(0,0,largura,altura);
		g.drawLine(0,altura,largura,0);
		
	}

	
}

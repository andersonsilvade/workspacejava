package br.com.globalcode.aj4.swing;
import java.awt.Color;

import javax.swing.*;


public class ComIcone extends JFrame{
	
	public ComIcone(){
		super ("TesteJButton");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//cria��o de um icone
		ImageIcon icone = new ImageIcon("imagens/indice.jpg");
		//cria��o de um bot�o com icone
		JButton botaoIcone = new JButton(icone);
		
		botaoIcone.setBackground(Color.BLUE);

		add(botaoIcone);
		setSize(680, 400);
		
		setVisible(true);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ComIcone ic = new ComIcone();
	}

}

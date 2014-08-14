package br.com.fatec.janela;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Evento extends JFrame implements ActionListener{
	
	private JButton botao1,botao2;
	
	
	public Evento(){
		/*titulo da janela*/super("Exemplo botoes e eventos");
		botao1 = new JButton("ADD");
		botao2 = new JButton("SUB");
		botao1.addActionListener(this);
		botao2.addActionListener(this);
		
		Container c = getContentPane();//continuar com slide
	    c.setLayout(new GridLayout(1,3));
	    c.add(botao1);
	    c.add(botao2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(botao1, "Adicionando");
		JOptionPane.showMessageDialog(botao2, "Subtraindo");
	}
	
	

}

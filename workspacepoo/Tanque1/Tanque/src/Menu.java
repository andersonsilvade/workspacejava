

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;  
import javax.swing.JPanel;

public class Menu  extends JFrame implements ActionListener {

	private JButton novo, sair;
	private JLabel titulo, texto, n1,n2,n3;
	Scanner leitor = new Scanner(System.in);
	
	public Menu() throws IOException{  
		Container c = getContentPane();
		c.setLayout(null);		
		c.setBackground(Color.BLACK);
		
		Font fonte1 = new Font("Arial", Font.BOLD, 30);
		Font fonte2 = new Font("Arial", Font.BOLD, 20);
		Font fonte3 = new Font("Arial", Font.BOLD, 20);
		Font fonte4 = new Font("Arial", Font.BOLD, 12);
		
		titulo = new JLabel("Jogo de Tanques");
		titulo.setLocation(190,5);
		titulo.setSize(250,40);
		titulo.setFont(fonte1);
		titulo.setForeground(Color.RED);
		c.add(titulo);
		
		texto = new JLabel("Desenvolvido por:");
		texto.setLocation(10,230);
		texto.setSize(250,40);
		texto.setFont(fonte4);
		texto.setForeground(Color.BLUE);
		c.add(texto);
		
		n1 = new JLabel("Anderson Silva de Albuquerque");
		n1.setLocation(10,250);
		n1.setSize(250,40);
		n1.setFont(fonte4);
		n1.setForeground(Color.BLUE);
		c.add(n1);
		
		n2 = new JLabel("Maria Luciana Felix");
		n2.setLocation(10,270);
		n2.setSize(250,40);
		n2.setFont(fonte4);
		n2.setForeground(Color.BLUE);
		c.add(n2);
		
		n3 = new JLabel("Roberta Abreu");
		n3.setLocation(10,290);
		n3.setSize(250,40);
		n3.setFont(fonte4);
		n3.setForeground(Color.BLUE);
		c.add(n3);
		
			
		novo = new JButton("Novo Jogo");
		novo.setFont(fonte2);
		novo.setForeground(Color.RED);
		novo.setLocation(205,70);
		novo.setSize(200,20);
	
		c.add(novo);
		
		sair = new JButton("Sair do Jogo");
		sair.setFont(fonte3);
		sair.setForeground(Color.RED);
		sair.setLocation(205,120);
		sair.setSize(200,20);
		c.add(sair);
		
		novo.addActionListener(this);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(3);	
		
	}
	
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == novo){
			Arena arena = new Arena(600,400);
			arena.adicionaTanque(new Tanque(100,200,0,Color.BLUE));
			arena.adicionaTanque(new Tanque(200,200,45,Color.RED));
			arena.adicionaTanque(new Tanque(470,360,90,Color.GREEN));
			arena.adicionaTanque(new Tanque(450,50,157,Color.YELLOW));
			JFrame janela = new JFrame("Tanques");
			janela.getContentPane().add(arena);
			janela.addKeyListener(arena);
			janela.pack();
			janela.setVisible(true);
			janela.setDefaultCloseOperation(3);
		}
		if(e.getSource() == sair) {
			
	}
}
			
	public static void main(String args[]) throws IOException{
		Menu menu = new Menu();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setSize(600, 400);
        menu.setVisible(true);
	}
}
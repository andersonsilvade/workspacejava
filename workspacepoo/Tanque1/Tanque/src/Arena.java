import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import org.omg.CORBA.TIMEOUT;

@SuppressWarnings("serial")
public class Arena extends JComponent 
		implements MouseListener, ActionListener, KeyListener{
	private int largura,altura;
	private LinkedList<Tanque> tanques;
	private Timer contador;
	private static int player1;
	private static int player2;
	private LinkedList<Bala>bala;
	private Tanque selecionado = null;
	
	public Arena(int largura,int altura){
		this.largura = largura; 
		this.altura = altura;
		tanques = new LinkedList<Tanque>();
		bala = new LinkedList<Bala>();
		addMouseListener(this);
		addKeyListener(this);
		contador = new Timer(70,this);
		contador.start();
	}
	public void adicionaTanque(Tanque t){
		tanques.add(t);
	}
	
	public Dimension getMaximumSize(){
		return getPreferredSize();
	}
	public Dimension getMinimumSize(){
		return getPreferredSize();
	}
	public Dimension getPreferredSize(){
		return new Dimension(largura,altura);
	}
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(new Color(245,245,255));
		g2d.fillRect(0,0,largura,altura);
		g2d.setColor(new Color(220,220,220));
		for(int _largura=0;_largura<=largura;_largura+=20)
			g2d.drawLine(_largura,0,_largura,altura);
		for(int _altura=0;_altura<=altura;_altura+=20) 
			g2d.drawLine(0,_altura,largura,_altura);
		// Desenhamos todos os tanques e balas
		for(Tanque t:tanques) t.draw(g2d);
		for(Bala b : bala)b.draw(g2d);
	}
	public void mouseClicked(MouseEvent e){
		for(Tanque t:tanques)
			t.setEstaAtivo(false);
		for(Tanque t:tanques){
			boolean clicado = t.getRectEnvolvente().contains(e.getX(),e.getY());
			if (clicado){
				t.setEstaAtivo(true);
				switch(e.getButton()){
					case MouseEvent.BUTTON1: t.girarAntiHorario(3); break;
					case MouseEvent.BUTTON2: t.aumentarVelocidade(); break;
					case MouseEvent.BUTTON3: t.girarHorario(3); break;
				}
				break;
			}
		}
		repaint();
	}
	public void mouseEntered(MouseEvent e) { }
	public void mouseExited(MouseEvent e) { }
	public void mousePressed(MouseEvent e) { }
	public void mouseReleased(MouseEvent e) { }
	
	//DISPARAR
	public void disparar(Tanque t){
		bala.add(new Bala(t.getX(),t.getY(),t.getAngulo(),Color.BLACK));
	 }
		
	//COLIS�O
	public void colisao(){
		Tanque[] t = new Tanque[tanques.size()];
		int colidir = 0;
		for(Tanque tanque : tanques){
			t[colidir++ ] = tanque; 
		}
		double localizacao;
		for(int i = 0 ; i < tanques.size();i++){
			for(int x = i;x < tanques.size();x++){
				double coodX1 = t[i].getX();
				double coodY1 = t[i].getY();
				double coodX2 = t[x].getX();
				double coodY2 = t[x].getY();
				localizacao = Math.sqrt(Math.pow((coodX1 - coodX2), 2)+ Math.pow((coodY1 - coodY2), 2));
				if(localizacao < 30){
					t[i].girarAntiHorario(120);
					t[x].girarHorario(120);
				}
			}
		}
		
}
	   //DESTRUI��O
		public void destruicao(){
			double localizacao;
			
			for(int f = 0 ; f < tanques.size();f++){
				double tanX = tanques.get(f).getX();
				double tanY = tanques.get(f).getY();
				for(int b = 0; b < bala.size() ;b++){
					double balX = bala.get(b).getX();
					double balY = bala.get(b).getY();
					
					localizacao = Math.sqrt(Math.pow((tanX - balX), 2)+ Math.pow((tanY - balY), 2));
					if(localizacao < 20){
						tanques.remove(f);
						bala.remove(b);
					}
				}
			}
		
	}
	public void actionPerformed(ActionEvent e){
		     if(tanques.size() == 1){
		    	
		    	 JOptionPane.showMessageDialog(null, "Vencedor");
		    	
		    	 System.exit(0);
		     }
		for(Tanque t:tanques){
			t.mover();
			colisao();		    
			}
		for(Bala b : bala)
			b.mover();
		
		destruicao();
		
	repaint();
		
		}
	
	public void keyPressed(KeyEvent e) {
		Tanque x = null;
		for(Tanque t : tanques){
			x = tanques.get(0);
			repaint();
			break;
			
		} 
		x.setEstaAtivo(true);
		
		 
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT: x.girarAntiHorario(10);break;
		case KeyEvent.VK_RIGHT: x.girarHorario(10);break;
		case KeyEvent.VK_UP: x.aumentarVelocidade();break;
		case KeyEvent.VK_DOWN: x.diminuirVelecidade();break;
		case KeyEvent.VK_SPACE: disparar(x);break;
		}
		
		
	}
	
	public void keyReleased(KeyEvent e) {}
	
	public void keyTyped(KeyEvent e) {}
	
	public static void main(String args[]){
		
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
	
		

}
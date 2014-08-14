import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;

	
	public class Bala {

		private double x,y;
		private double angulo;
		private Color cor;
	    private int velBala = 40;
		
		public Bala(double d, double e, double f, Color cor){
			this.x = d;
			this.y = e;
			this.angulo = f;
			this.cor = cor; 
			
		}
		
		public int getVelBala() {
			return velBala;
		}
		public void mover(){
			x = x + Math.sin(Math.toRadians(angulo)) * velBala;
			y = y - Math.cos(Math.toRadians(angulo)) * velBala;

		}
        public double getX() {
			return x;
		}
        public double getY() {
			return y;
		}
        public double getAngulo() {
			return angulo;
		}
		
		
		
		public void draw(Graphics2D g2d){
			//Armazenamos o sistema de coordenadas original.
			AffineTransform antes = g2d.getTransform();
			//Criamos um sistema de coordenadas para o tanque.
			AffineTransform depois = new AffineTransform();
			depois.translate(x, y);
			depois.rotate(Math.toRadians(angulo));
			//Aplicamos o sistema de coordenadas.
			g2d.transform(depois);
			
			//Desenhando a bala
			
			g2d.setColor(Color.BLACK);
			g2d.fillOval(-3,-25,5,5);
			g2d.setTransform(antes);
			
			
		}	
		public Shape getRectEnvolvente(){
			AffineTransform at = new AffineTransform();
			at.translate(x,y);
			at.rotate(Math.toRadians(angulo));
			Rectangle rect = new Rectangle(-24,-32,48,55);
			return at.createTransformedShape(rect);
		}
	}
	
	
	


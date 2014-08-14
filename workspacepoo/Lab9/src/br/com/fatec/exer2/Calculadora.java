package br.com.fatec.exer2;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener{
	
	
	private JButton somar,subtrair,dividir,multiplicar,igual;
	private double resultado = 0;
	private Double x,y;
	private double a,b ;
	private JTextField iResultado;
	private JTextField n1;
	private JTextField n2;
	
	
	
	public Calculadora(){
		
		super("CALCULADORA");
		
		setSize(200,200);              

	    setLocation(200,200);          

	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

		 n1 = new JTextField(9);
		 n2 = new JTextField(9);
		
		
		JPanel p = new JPanel();	
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,1));
		
		somar = new JButton("+");
		subtrair = new JButton("-");
		dividir = new JButton("/");
		multiplicar = new JButton("X");
		igual = new JButton("=");
		iResultado = new JTextField(9);
		
		
		p.add(n1);
		p.add(n2);
		p.add(dividir);
		p.add(multiplicar);
		p.add(somar);
		p.add(subtrair);
		p.add(igual);
		p.add(iResultado);
		
		c.add(p);
		
		
       	
		somar.addActionListener(this);
		subtrair.addActionListener(this);
		dividir.addActionListener(this);
		multiplicar.addActionListener(this);
		igual.addActionListener(this);
		n1.addActionListener(this);
		n2.addActionListener(this);
		 
		
		
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(3);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == somar){
			if(n1.getText().equals("")||n2.getText().equals("")){
				JOptionPane.showMessageDialog(null, "preencha os campos");
			
			}else{
				a =(double) Double.parseDouble(n1.getText());
				b =(double) Double.parseDouble(n2.getText());
			}
			resultado = (a + b);
		}
		if(e.getSource() == subtrair){
			if(n1.getText().equals("")||n2.getText().equals("")){
				JOptionPane.showMessageDialog(null, "preencha os campos");
			
			}else{
				a =(double) Double.parseDouble(n1.getText());
				b =(double) Double.parseDouble(n2.getText());
			}
			resultado = a - b;
		}
		if(e.getSource() == dividir){
			if(n1.getText().equals("")||n2.getText().equals("")){
				JOptionPane.showMessageDialog(null, "preencha os campos");
			
			}else{
				a =(double) Double.parseDouble(n1.getText());
				b =(double) Double.parseDouble(n2.getText());
			}
			resultado = a / b;
		}if(e.getSource() == multiplicar){
			if(n1.getText().equals("")||n2.getText().equals("")){
				JOptionPane.showMessageDialog(null, "preencha os campos");
			
			}else{
				a =(double) Double.parseDouble(n1.getText());
				b =(double) Double.parseDouble(n2.getText());
			}
			resultado = a * b;
		}
		if(e.getSource() == igual){
			iResultado.setText(""+resultado);
		}
		
		
	}
public static void main(String[] args) {
		
		new Calculadora();
		
	}

}


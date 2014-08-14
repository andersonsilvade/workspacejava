package br.com.globalcode.aj4.swing;
import java.awt.FlowLayout;
import javax.swing.*;

public class LayOut extends JFrame{

	public LayOut(){
		 super("Teste FlowLayout");
		 
		 JPanel pBotoes = montaBotoes();
		 add(pBotoes);
		 setSize(275,100);
		 setVisible(true);
	}
		 
   public JPanel montaBotoes(){
	   
	   JPanel p = new JPanel();
	   p.setLayout(new FlowLayout(FlowLayout.LEFT));
	   p.add(new JButton("salvar"));
	   p.add(new JButton("Excluir"));
	   return p;
	   
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LayOut lt = new LayOut();
	}

}

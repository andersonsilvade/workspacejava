 import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
  public class classeJButton extends JFrame implements ActionListener  
{  
    JButton b1, b2 ;  
      
      
    public classeJButton()  
    {  
          
        setTitle("Acrescentando bot�es");  
        setBounds(200,150,400,300);  
          
          
        b1 = new JButton();  
        b1.setText("Sair");  
        b1.setSize(100,25);  
        b1.setLocation(50,200);  
        b1.setBackground(Color.orange);  
        b1.setForeground(Color.blue);  
        b1.setFont(new Font("Sans Serif",Font.BOLD,14));  
        b1.setBorder(BorderFactory.createBevelBorder(1,Color.white,Color.black));  
        b1.setEnabled(true);  
        b1.addActionListener(this);  
        b1.setMnemonic(KeyEvent.VK_S);//igual a utilizar ALT+S  
              
        b2 = new JButton("Cadastrar");  
        b2.setSize(100,25);  
        b2.setLocation(200,200);  
        b2.setFont(new Font("ScriptS",Font.ITALIC,12));  
        b2.setBorder(BorderFactory.createLineBorder(Color.black,2));  
        b2.setEnabled(true);  
        b2.addActionListener(this);  
        b2.setMnemonic(KeyEvent.VK_C);// igual a utilizar ALT+C  
          
        getContentPane().setLayout(null);  
        getContentPane().add(b1);  
        getContentPane().add(b2);  
    }     
    public void actionPerformed(ActionEvent e)//a��es de cada Bot�o  
  {    
   if(e.getSource()==b1)   
   {  
        System.exit(0);  
   }      
   if(e.getSource()==b2)   
   {  
        JFrame Ex = new classeJPaswordListener();  
        Ex.show();     
   }      
  }   
       
    public static void main (String arg[])  
    {  
        JFrame Ex = new classeJButton();  
        Ex.setVisible(true);  
    }  
}  
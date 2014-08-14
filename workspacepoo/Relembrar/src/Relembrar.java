import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

    public class Relembrar extends JFrame implements ActionListener {  
         
       private Container      cont;  
         
       private JTextField       txtValor1;  
       private JTextField       txtValor2;  
         
       private ButtonGroup    grupo;  
       private JRadioButton    btMais;  
       private JRadioButton    btMenos;  
       private JRadioButton    btDiv;  
       private JRadioButton    btMult;  
         
       private JButton       btResult;  
       private JButton         btSair;  
         
       private JPanel          panelCentro;  
       private JPanel         panelDir;  
       private JPanel         panelSul;  
         
       private char         op;  
         
       public static void main(String args[]) {  
            
          new Relembrar();  
       }  
         
       public Relembrar() {  
            
          super ("Calculadora");  
            
          cont          = getContentPane();  
          cont.setLayout(new BorderLayout());  
            
          panelCentro      = new JPanel(new GridLayout(2,2,5,5));  
          panelDir      = new JPanel(new GridLayout(4,1));  
          panelSul      = new JPanel(new GridLayout(1,2));  
            
          btResult      = new JButton("Resultado");  
          btSair         = new JButton("Sair");  
            
          grupo         = new ButtonGroup();  
          btMais         = new JRadioButton("Adição",true);  
          btMenos         = new JRadioButton("Subtração",false);  
          btDiv         = new JRadioButton("Divisão",false);  
          btMult         = new JRadioButton("Multiplicação",false);  
            
          txtValor1      = new JTextField();  
          txtValor2      = new JTextField();  
            
          grupo.add(btMais);  
          grupo.add(btMenos);  
          grupo.add(btDiv);  
          grupo.add(btMult);  
            
          panelCentro.add(new JLabel("Valor 1: "));  
          panelCentro.add(txtValor1);  
          panelCentro.add(new JLabel("Valor 2: "));  
          panelCentro.add(txtValor2);  
            
          panelDir.add(btMais);  
          panelDir.add(btMenos);  
          panelDir.add(btDiv);  
          panelDir.add(btMult);  
            
          panelSul.add(btResult);  
          panelSul.add(btSair);  
            
          btResult.addActionListener(this);  
          btSair.addActionListener(this);  
          btMais.addActionListener(this);  
          btMenos.addActionListener(this);  
          btDiv.addActionListener(this);  
          btMult.addActionListener(this);  
            
          cont.add(new JLabel("Calculadora"), BorderLayout.NORTH);  
          cont.add(panelCentro, BorderLayout.CENTER);  
          cont.add(panelSul, BorderLayout.SOUTH);  
          cont.add(panelDir, BorderLayout.EAST);  
            
          setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
          setSize(300,140);  
          setVisible(true);  
       }  
         
       public void actionPerformed(ActionEvent e) {  
            
               if (e.getSource() == btResult)    calcula();  
          else if (e.getSource() == btSair)       System.exit(0);  
          else if (e.getSource() == btMais)       op = '+';  
          else if (e.getSource() == btMenos)       op = '-';  
          else if (e.getSource() == btDiv)       op = '/';  
          else if (e.getSource() == btMult)       op = '*';  
       }  
      
       public void calcula() {  
            
          try {  
               
             Double v1 = new Double(txtValor1.getText().trim());  
             Double v2 = new Double(txtValor2.getText().trim());  
            
             double resultado;  
            
             switch (op) {  
               
                case '+': { resultado = v1.doubleValue() + v2.doubleValue(); break; }  
                case '-': { resultado = v1.doubleValue() - v2.doubleValue(); break; }  
                case '/': { resultado = v1.doubleValue() / v2.doubleValue(); break; }  
                case '*': { resultado = v1.doubleValue() * v2.doubleValue(); break; }  
                default:{ resultado = 0; break; }  
             }  
               
             JOptionPane.showMessageDialog(null, new Double(resultado).toString());  
          }  
          catch (Exception e) {  
             JOptionPane.showMessageDialog(null, "Verifique os números digitados.");  
          }  
       }  
    }  



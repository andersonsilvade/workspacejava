import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 

public class Formata { 


public static void main(String[] args) { 
JFormata janela = new JFormata(); 
janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
janela.setVisible(true); 

} 

} 
class JFormata extends JFrame implements ActionListener{ 

JLabel rotulo1, rotulo2; 
JTextField campo1, campoSai; 
JButton botBold, botItalic, botColor, botLimp; 
public char frase1, resultado; 

public JFormata(){ 
setTitle("Formate sua frase!!"); 
setSize(400,200); 

Container container = getContentPane(); 
GridLayout grid = new GridLayout(4,2,3,3); 
container.setLayout(grid); 

rotulo1 = new JLabel ("Entre com sua frase:"); 
campo1 = new JTextField(4); 

rotulo2 = new JLabel ("Resultado da formatação"); 
campoSai = new JTextField(6); 
campoSai.setEditable(false); 

botBold = new JButton ("NEGRITO"); 
botItalic = new JButton ("ITALICO"); 
botColor = new JButton ("COLORIDO"); 
botLimp = new JButton ("LIMPA"); 


container.add(rotulo1); 
container.add(campo1); 
container.add(rotulo2); 
container.add(campoSai); 
container.add(botBold); 
container.add(botItalic); 
container.add(botColor); 
container.add(botLimp); 

botBold.addActionListener(this); 
botItalic.addActionListener(this); 
botColor.addActionListener(this); 
botLimp.addActionListener(this); 

} 

public void actionPerformed(ActionEvent Evento) { 
frase1 = (char) Double.parseDouble(campo1.getText() ); 



if(Evento.getSource() == botBold){ 
botBold.setFont (new Font("Serif",Font.BOLD,14)); 
campoSai.setText(Double.toString(resultado)); 
} 

else if(Evento.getSource() == botItalic){ 
botItalic.setFont(new Font ("Serif",Font.ITALIC,14)); 
campoSai.setText(Double.toString(resultado)); 

} 

else if(Evento.getSource() == botColor){ 
botColor.setBackground(Color.red); 
campoSai.setText(Double.toString(resultado)); 
} 

else if(Evento.getSource() == botLimp){ 
campo1.setText(""); 
campoSai.setText(""); 
} 


} 


}